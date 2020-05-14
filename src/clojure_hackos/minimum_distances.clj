(ns clojure-hackos.minimum-distances
  "Solution to the *Minimum Distances* challenge.
   See: https://www.hackerrank.com/challenges/minimum-distances")

(defn min-distance
  "Groups the given array into pairs of equal elements and returns the smallest
   difference between their indices.
   Returns `-1` if no matching pairs are found."
  [arr]
  (let
   [index-widths
    (map
     #(- (last %) (first %))
     (partition
      2
      (map #(% 0)
           (sort-by #(% 1)
                    (for [elem (map-indexed vector arr)
                          :when
                          (= 2 (count (filter #{(elem 1)} arr)))]
                      elem)))))]
    (if (seq index-widths)
      (apply min index-widths)
      -1)))
