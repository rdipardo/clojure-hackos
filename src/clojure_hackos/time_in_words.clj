(ns clojure-hackos.time-in-words
  "Solution to the *Time in Words* challenge.
   See: https://www.hackerrank.com/challenges/the-time-in-words")

(defn- hr->wrd
  "Returns the name of the given hour."
  [hr]
  (get
   (nth
    (->>
     (interleave
      (range 1 13)
      '("one" "two" "three" "four" "five" "six"
              "seven" "eight" "nine" "ten" "eleven" "twelve"))
     (partition 2)
     (map #(hash-map (first %) (last %))))
    (dec hr))
   hr))

(defn- mins->expr
  "Returns the word equivalent of the given number of minutes."
  [m]
  (get
   (nth
    (->>
     (interleave
      (range 1 30)
      '("one" "two" "three" "four" "five" "six" "seven" "eight"
              "nine" "ten" "eleven" "twelve" "thirteen" "fourteen" "fifteen"
              "sixteen" "seventeen" "eighteen" "nineteen" "twenty" "twenty one"
              "twenty two" "twenty three" "twenty four" "twenty five"
              "twenty six" "twenty seven" "twenty eight" "twenty nine"))
     (partition 2)
     (map #(hash-map (first %) (last %))))
    (dec m))
   m))

(defn time->str
  "Returns a time expression for the given hour and number of minutes."
  [h m]
  (let [h-name (if (> m 30) (hr->wrd (inc h)) (hr->wrd h))
        plural? #(when (> % 1) "s")]
    (cond (zero? m)
          (str h-name " o' clock")
          (= m 15)
          (str "quarter past " h-name)
          (= m 30)
          (str "half past " h-name)
          (= m 45)
          (str "quarter to " h-name)
          (and (>= m 1) (<= m 30))
          (str (mins->expr m) " minute" (plural? m) " past " h-name)
          (> m 30)
          (str (mins->expr (- 60 m)) " minute" (plural? m) " to " h-name))))
