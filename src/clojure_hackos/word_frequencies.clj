(ns clojure-hackos.word-frequencies
  "Solves the *Hash Tables: Ransom Note* challenge.
  See: https://www.hackerrank.com/challenges/ctci-ransom-note")

(defn proper-subset-of?
  "Returns 'Yes' if every word in `n` occurs at least as many times as in `m`;
  returns 'No' otherwise."
  [m n]
  (let [mag (frequencies (re-seq #"\w+" m))
        note (re-seq #"\w+" n)
        common (->>
                (frequencies note)
                (merge-with #(>= %1 %2) mag)
                (filter #(boolean? (second %))))]
    (if (and (every? second common)
             (= (count (set note)) (count (map first common))))
      "Yes"
      "No")))
