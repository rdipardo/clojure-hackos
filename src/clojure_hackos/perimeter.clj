(ns clojure-hackos.perimeter
  "Solution to the *Compute the Perimeter of a Polygon* challenge
  See: https://www.hackerrank.com/challenges/lambda-march-compute-the-perimeter-of-a-polygon"
  (:require [clojure-hackos.utils.geometry :as g]))

(defn perimeter
  "Computes the perimeter of a figure with vertices at the given sequence of
  co-ordinates"
  [coords]
  (reduce + (map g/distance (g/line-segments coords))))

(defn try-me
  "Demonstrates [[perimeter]] by reading in the following inputs:
  - the number of vertices in the figure
  - the x-y co-ordinates of each vertex, each pair on a single line"
  []
  (let [coords (for [_ (range (Integer/parseInt (read-line)))]
                 (vec (map #(Integer/parseInt %) (re-seq #"\d+" (read-line)))))]
    (println (perimeter coords))))
