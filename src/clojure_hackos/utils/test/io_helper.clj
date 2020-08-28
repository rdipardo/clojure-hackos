(ns clojure-hackos.utils.test.io-helper
  "Wraps test cases that consume file input"
  (:require [clojure.java.io :as jio])
  (:import java.io.BufferedReader
           java.io.FileNotFoundException))

(defn- strs->coords
  "Converts a sequence of strings representing co-ordinate pairs to their
  linalg equivalents."
  [strs]
  (map
   (fn [xy] (mapv #(Integer/parseInt %) (re-seq #"\d+" xy)))
   strs))

(defn with-input
  "Applies `f` to the contents of `file`, which is converted to a sequence of
  co-oridnates when the `linalg` option is `true`."
  [f file & {:keys [linalg] :or {linalg false}}]
  (let [input (try
                (jio/reader (jio/as-relative-path file))
                (catch FileNotFoundException exc
                  (println "Broken test case:" (.getMessage exc))))
        res (when-let [data input]
              (if linalg
                (f (strs->coords (line-seq data)))
                (apply f (line-seq data))))]
    (when-not (nil? input)
      (.close ^BufferedReader input))
    res))
