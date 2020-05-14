(ns clojure-hackos.extra-long-factorials
  "Solution to the *Extra Long Factorials* challenge.
   See: https://www.hackerrank.com/challenges/extra-long-factorials")

(defn n!
  "Returns the factorial of `n`.

   *Note*
   You must return a string to stop the `N` postfix from being printed;
   HackerRank is fussy about output format!"
  [n]
  (str
   (loop [cnt 0 factors '()]
     ;; Calling `(*)` with no arguments returns `1`, so `(n! 0)` will be
     ;; `1` as expected.
     (if (= cnt n) (reduce * factors)
         (recur (inc cnt) (cons (- (bigint n) cnt) factors))))))
