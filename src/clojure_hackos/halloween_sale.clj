(ns clojure-hackos.halloween-sale
  "Solution to the *Halloween Sale* challenge.
   See: https://www.hackerrank.com/challenges/halloween-sale/problem")

(defn how-many-games
  "Returns the number of games that can be purchased with budget `s`, given the
   starting price `p` and applying discount `d` for each purchased game up to
   the minimum price `m`."
  [p d m s]
  (loop [games 0 prices '() total 0]
    (if (>= total s) games
        (let [running-total (reduce + prices)
              price (- p (* d games))
              next-price (if (< m price) price m)]
          (recur
           (if (>= s (+ running-total next-price))
             (inc games)
             games)
           (conj prices next-price)
           (long running-total))))))
