(ns clojure-hackos.apple-and-orange
  "Solution to the *Apple and Orange* challenge.
   See: https://www.hackerrank.com/challenges/apple-and-orange")

(defn count-apples-&-oranges
  "Returns the number of fallen apples and oranges that land within a given
   range, where:
   - `s` is the start of the range
   - `t` is the end of the range
   - `a` denotes the location of the apple tree
   - `b` denotes the location of the orange tree
   - `apples` are the distances at which each apple falls from the tree
   - `oranges` are the distances at which each orange falls from the tree."
  [s, t, a, b, apples, oranges]
  (clojure.string/join
   "\n"
   (list
    (count (for [apple apples
                 :when
                 (and (>= (+ a apple) s) (<= (+ a apple) t))]
             (list apple)))
    (count (for [orange oranges
                 :when
                 (and (>= (+ b orange) s) (<= (+ b orange) t))]
             (list orange))))))
