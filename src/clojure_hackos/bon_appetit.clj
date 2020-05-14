(ns clojure-hackos.bon-appetit
  "Solution to the *Bon Appétit* challenge.
   See: https://www.hackerrank.com/challenges/bon-appetit")

(defn assess-bill
  "Determines if the amount `paid` is exactly half of the totalled `bill`.
   If `false`, returns the amount not covered."
  [bill excluded paid]
  (let [fair-cost (int (/ (- (reduce + bill) (nth bill excluded)) 2))
        difference (- paid fair-cost)]

    (if (zero? difference)
      "Bon Appetit!"
      (str difference))))
