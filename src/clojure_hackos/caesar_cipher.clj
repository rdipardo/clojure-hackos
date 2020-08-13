(ns clojure-hackos.caesar-cipher
  "Solves the *Caesar Cipher* challenge.
   See: https://www.hackerrank.com/challenges/caesar-cipher-1"
  (:require [clojure-hackos.lib.helpers :refer [idx-of]]))

(def ^:private lc-alpha
  "Lowercase letters, mapped to their ASCII code points."
  (map #(assoc {} % (char %)) (range 97 123)))

(def ^:private uc-alpha
  "Capital letters, mapped to their ASCII code points."
  (map #(assoc {} % (char %)) (range 65 91)))

(defn- char-index
  "Finds and returns the index of a character mapping in `dict` whose key
  matches the given ASCII `code`."
  [code dict]
  (when-let [found (first (seq (filter #{{code (char code)}} dict)))]
    (idx-of dict found)))

(defn- rotate
  "Finds and returns a character mapping in `dict` by increasing the given
  `idx`, circling around to the first element when necessary."
  [idx rot dict]
  (let [abs #(if (neg? %) (- %) %)
        safe-idx #(if (< % (count dict))
                    %
                    (- % (* (count dict) (quot % (count dict)))))
        i (char-index idx dict)]
    (when (nat-int? i)
      (if-let [enc (nth dict (+ i rot) nil)]
        (val (last enc))
        (val (last (nth dict
                        (safe-idx (abs (- (+ i rot) (count dict))))
                        nil)))))))

(defn encrypt
  "Returns the string obtained by shifting every character in `s` down the
  alphabet a given number of times."
  [s rot]
  (apply str
         (for [ch s]
           (cond (Character/isLowerCase ^Character ch)
                 (rotate (int ch) rot lc-alpha)

                 (Character/isUpperCase ^Character ch)
                 (rotate (int ch) rot uc-alpha)

                 :else
                 ch))))
