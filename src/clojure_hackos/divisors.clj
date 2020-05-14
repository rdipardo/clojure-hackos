(ns clojure-hackos.divisors
  "Solves the *Find Digits* problem.
   See: https://www.hackerrank.com/challenges/find-digits")

(defn find-digits
  "Returns the number of digits which are factors of the given `num`."
  [num]
  (let [num-str (str num)]
    (count
     (filter
      #(and (not (zero? %)) (zero? (mod num %)))
      (map #(Integer/parseInt (str %)) num-str)))))
