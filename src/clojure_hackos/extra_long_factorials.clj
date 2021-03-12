(ns clojure-hackos.extra-long-factorials
  "Solution to the *Extra Long Factorials* challenge.
   See: https://www.hackerrank.com/challenges/extra-long-factorials")

(defn n!
  "Returns the factorial of `n`.

   *Note*
   You must return a string to stop the `N` postfix from being printed;
   HackerRank is fussy about output format!"
  [n]
   ;; Avoid overflows: use the operator version that supports arbitrary
   ;; precision
  (str (reduce *' 1 (range n 1 -1))))
