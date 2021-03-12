(ns clojure-hackos.triangle-arithmétique
  "Solution to the *Pascal's Triangle* challenge.
  See: https://www.hackerrank.com/challenges/pascals-triangle/problem"
  (:require [clojure.string :refer [join]]))

(defn walk [n]
  (letfn [(n! [n] (reduce *' 1 (range n 1 -1)))
          (ncr [n r]
            ((memoize
               (fn [n r]
                 (quot (n! n) (*' (n! r) (n! (- n r))))))
             n r))]
    (join "\n"
      (for [row (range n)]
        (join " "
              (map #(ncr row %)
                   (take-while #(<= % row) (range))))))))
