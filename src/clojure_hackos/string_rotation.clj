(ns clojure-hackos.string-rotation
  "Solves the *Rotate String* challenge
  See: https://www.hackerrank.com/challenges/rotate-string")

(defn- anagrams
  "Generates an infinite, circular sequence of the letters in the given string."
  [s]
  (lazy-cat (conj (vec (rest s)) (first s))
            (anagrams (conj (vec (rest s)) (first s)))))

(defn permute-str
  "Selects all possible unique strings that can be formed by rotating a single
  letter of `s`."
  [s]
  (let [r (count s) n (* r r)]
    (partition r (take n (anagrams s)))))
