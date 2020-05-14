(ns clojure-hackos.between-2-sets
  "Solution to the *Between Two Sets* challenge
   See: https://www.hackerrank.com/challenges/between-two-sets")

(defn- factor?
  "Returns `true` if and only if:
   - all elements of the `first` array are factors of the integer being considered
   - the same integer is a factor of every element in the `second` array."
  [first second num]
  (when
   (and
    (every? #(zero? (mod num %)) first)
    (every? #(zero? (mod % num)) second))
    true))

(defn get-total-x
  "Returns the number of elements which are 'between' sets `a` and `b`, meaning
   [[factor?]] returns `true` given both sets and a number."
  [a b]
  (let [start-val (apply max a)
        end-val (inc (apply min b))]

    (count (for [n (range start-val end-val)
                 :when
                 (factor? a b n)]
             (list n)))))
