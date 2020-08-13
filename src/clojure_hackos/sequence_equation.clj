(ns clojure-hackos.sequence-equation
  "Solution to the *Sequence Equation* problem
  See: https://www.hackerrank.com/challenges/permutation-equation"
  (:require [clojure-hackos.lib.helpers :refer [idx-of]]))

(defn permute
  "Returns the sequence of elements in `p` that satisfy the equation:
   `p(p(y))` &#8801; `x`, where `x` is any value in the interval `[1, n(p)]`."
  [n p]
  (let [x-values (sort (range 1 (inc n)))]
    (when (and
           (seq p)
           (instance? Number (first p))
           (<= n (count p)))
      (->>
       (map #(inc (idx-of p %)) x-values)
       (map #(idx-of p %))
       (map #(nth p %))
       (map #(inc (idx-of p %)))))))
