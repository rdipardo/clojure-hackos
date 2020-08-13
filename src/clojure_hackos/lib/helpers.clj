(ns clojure-hackos.lib.helpers
  "Assorted useful functions")

(defn idx-of
  "Returns the index of `e` in the given `arr`, or `-1` if `e` is not found."
  [arr e]
  (let [len (count arr)]
    (if-let [res (inc (last
                       (take-while
                        #(and (< % len)
                              (not= e (nth arr % nil)))
                        (iterate inc -1))))]

      (if (< res len) res -1)
      -1)))

(defn- deltas
  "Generates a sequence of the arithmetic differences between each pair of
  elements in the given `coll`."
  [coll]
  (->> (range (dec (count coll)))
       (reduce
        (fn [pairs i]
          (conj pairs (- (nth coll (inc i) 0) (nth coll i))))
        [])))

(defn ordered?
  "Returns the logical result of applying the given `pred` function to the
  arithmetic difference between every pair of elements in `coll`.
  When called without a predicate, returns `true` if all elements are in
  ascending sequence (ignoring duplicates).

  This function is meant to be wrapped, e.g.,

  ```clojure
  (defn descending? [c] (ordered? neg? c))
  (descending? [2 -1 -6 -8 -10 -13 -17])
  ;; => true
  ```"
  ([coll]
   (every? nat-int? (deltas coll)))
  ([pred coll]
   (every? pred (deltas coll))))
