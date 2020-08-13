(ns clojure-hackos.test.io-helper
  "Wraps test cases that consume file input"
  (:require [clojure.java.io :as jio])
  (:import java.io.BufferedReader
           java.io.FileNotFoundException))

(defn with-input
  "Tries to call the given `fn` with the contents of `file` as argument."
  [fn file]
  (let [input (try
                (jio/reader (jio/as-relative-path file))
                (catch FileNotFoundException exc
                  (println "Broken test case:" (.getMessage exc))))
        res (when-let [data input]
              (fn (map #(conj [(Integer/parseInt (first %))]
                              (Integer/parseInt (second %)))
                       (map #(re-seq #"\d+" %) (line-seq data)))))]
    (when-not (nil? input)
      (.close ^BufferedReader input))
    res))
