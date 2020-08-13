(ns clojure-hackos.pdf
  "Solution to the *Designer PDF Viewer* challenge.
   See: https://www.hackerrank.com/challenges/designer-pdf-viewer")

(defn designer-pdf-viewer
  "Determines the optimal area needed to highlight the given `word`."
  [letter-heights word]
  ;; Calculate area as `1 x #-of-letters x max-letter-height` (units in `mm`)
  (reduce
   *
   [(count word)
    (->>
       ;; Index letter heights by their ASCII code points, starting with `a` (97);
       ;; convert `word` to a sequence of code points; collect the heights of
       ;; letters with code points matching an entry; select the tallest one as
       ;; determining the overall height
     (map-indexed #(list (+ 97 %1) %2) letter-heights)
     (filter
      (fn [code-pt] (some #{(first code-pt)} (map int word))))
     (map second)
     (apply max))]))
