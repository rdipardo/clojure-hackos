(ns clojure-hackos.string-compression
  "Solves the *String Compression* problem.
   See: https://www.hackerrank.com/challenges/string-compression")

(defn compress-str
  "Reduces the given string by replacing every sub-string of repeated letters
  with that letter followed by the number of duplicates."
  [s]
  (apply str
         (reduce
          (fn [acc ch]
            (let [len (memoize #(count %))
                  prev (first (subvec acc (dec (len acc))))]
              (cond (= ch prev) (conj acc 2)
                    (and (integer? prev)
                         (= [ch] (subvec acc (- (len acc) 2) (dec (len acc)))))
                    (conj (subvec acc 0 (dec (len acc))) (inc prev))
                    :else (conj acc ch))))
          [(first s)] (drop 1 s))))
