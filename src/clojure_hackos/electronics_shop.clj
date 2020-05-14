(ns clojure-hackos.electronics-shop
  "Solution to the *Electronics Shop* challenge.
   See: https://www.hackerrank.com/challenges/electronics-shop")

(defn money-spent
  "Returns the highest subtotal within the given `budget`, where the subtotal
   is the combined price of a keyboard and a drive.
   Returns `-1` if all subtotals are over-budget."
  [keyboards drives budget]
  (let
   [prices (filter
            #(<= % budget)
            (for [kb keyboards
                  usb drives]
              (+ kb usb)))]

    (if (seq prices)
      (apply max prices)
      -1)))
