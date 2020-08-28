(ns clojure-hackos.bubble-sort
  "Solution to the *Sorting: Bubble Sort* challenge.
  See: https://www.hackerrank.com/challenges/ctci-bubble-sort"
  (:require [clojure-hackos.utils.helpers :refer [ordered?]]))

(defn bubble-sort
  "Applies the bubble sorting algorithm to `arr`, returning a vector composed
  of the number of swaps performed, the first and last element of the sorted
  sequence."
  [arr len]
  (letfn [(next-idx [i f] (if (< i (dec len)) (f i) 0))
          (iter [a s i]
            (let [p (next-idx i identity)
                  c (first (subvec a p (inc p)))
                  n (first (subvec a (inc p) (+ 2 p)))
                  na-s (if (> c n)
                         [(-> (assoc a p n) (assoc (inc p) c)) (inc s)]
                         [a s])]
              (if (ordered? a) [s (first a) (last a)]
                  #(iter (first na-s) (last na-s) (next-idx i inc)))))]
    (trampoline iter (vec arr) 0 0)))
