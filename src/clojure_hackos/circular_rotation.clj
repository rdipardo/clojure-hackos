(ns clojure-hackos.circular-rotation
  "Solves the *Circular Array Rotation* challenge.
   See: https://www.hackerrank.com/challenges/circular-array-rotation")

(defn rotate-slow
  "Finds the elements at each index in `queries` after rotating the given array
  a `k` number of times.
   
   *Note*
   This function can only solve for small arrays within the time limit.
   See [[rotate]] for the real solution."
  [a k queries]
  (let [slice  #(take (dec (count %)) %)]
    (loop [arr a
           cnt 0]
      (if (= cnt k)
        (->> (for [idx queries]
               (nth arr idx)) (map str) (clojure.string/join "\n"))
        (recur (conj (slice arr) (last arr))
               (inc cnt))))))
(defn rotate
  "About 6x faster than [[rotate-slow]]"
  [a k queries]
  (let [rot (mod k (count a))]
    (->> (for [idx queries]
           (if (>= (- idx rot) 0)
             (nth a (- idx rot))
             (nth a (+ (- idx rot) (count a)))))
         (map str) (clojure.string/join "\n"))))