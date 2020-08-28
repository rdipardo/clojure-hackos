(ns clojure-hackos.string-reduction
  "Solves the *Super Reduced String* challenge.
  See: https://www.hackerrank.com/challenges/reduced-string")

(defn reduce-str
  "Shortens `s` by recursively deleting pairs of adjacent letters."
  [s]
  (let [res (reduce #(if (not= (last %1) %2)
                       (conj %1 %2)
                       (vec (drop-last %1)))
                    [] s)]
    (if (empty? res) "Empty String" (apply str res))))
