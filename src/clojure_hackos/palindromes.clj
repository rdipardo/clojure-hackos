(ns clojure-hackos.palindromes
  "Solution to the *Beautiful Days at the Movies* challenge.
   See: https://www.hackerrank.com/challenges/beautiful-days-at-the-movies")

(defn count-factors
  "Counts the number of integers between `i` and `j` that, when subtracted from
  their mirror-opposites, have `k` as factor.

   Example:
   ```clojure
   (count-factors '(20 23 6))
   ;; => 2
   ```
   Explanation:
   ```
   |20 - 02| % 6 == 0
   |21 - 12| % 6 != 0
   |22 - 22| % 6 == 0
   |23 - 32| % 6 != 0
   ```"
  [i j k]
  (count
   (lazy-seq
    (for [n (range i (inc j))
          :when
          (zero?
           (mod
            (- n (Integer/parseInt (clojure.string/join (reverse (str n)))))
            k))]
      n))))
