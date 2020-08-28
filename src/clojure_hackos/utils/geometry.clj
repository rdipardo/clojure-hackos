(ns clojure-hackos.utils.geometry
  "Utilities for computing dimensions of 2D figures")

(defn line-segments
  "Returns a sequence of Cartesian co-ordinates enclosing a figure with
  vertices at the given `coords`."
  [coords]
  (partition
   2
   (concat (list (last coords) (first coords))
           (loop [xys coords sides '()]
             (if (seq (rest xys))
               (recur (rest xys) (concat (list (first xys) (second xys)) sides))
               sides)))))

(defn distance
  "Computes the distance between two points (i.e., the length of a line
  segment)."
  [coord-pair]
  (let [sqr #(* % %)]
    (Math/sqrt (+ (sqr (reduce - (map first coord-pair)))
                  (sqr (reduce - (map last coord-pair)))))))

(defn concave-area
  "Computes the average of the area under the given pair of co-ordinates."
  [coord-pair]
  (* (* 0.5 (reduce + (map last coord-pair))) (reduce - (map first coord-pair))))
