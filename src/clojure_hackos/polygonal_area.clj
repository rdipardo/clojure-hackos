(ns clojure-hackos.polygonal-area
  "Solution to the *Compute the Area of a Polygon* challenge
  See: https://www.hackerrank.com/challenges/lambda-march-compute-the-area-of-a-polygon"
  (:require [clojure-hackos.lib.geometry :as g]))

(defn area [coords]
  (let [segments (g/line-segments coords)
        sides (map g/distance segments)
        abs #(if (neg? %) (- %) %)]
    (if (= 1 (count (set sides)))
      ;; regular polygon
      (* 0.5
         (* (reduce + sides)
            (/ (first sides)
               (* 2 (Math/tan (Math/toRadians (/ 180 (count sides))))))))
      ;; (concave) irregular polygon
      (abs (reduce + (map g/concave-area segments))))))

(defn try-me
  "Demonstrates the `area` function by reading in the following inputs:
  - the number of vertices in the figure
  - the x-y co-ordinates of each vertex, each pair on a single line"
  []
  (let [coords (for [_ (range (Integer/parseInt (read-line)))]
                 (vec (map #(Integer/parseInt %) (re-seq #"\d+" (read-line)))))]
    (println (area coords))))
