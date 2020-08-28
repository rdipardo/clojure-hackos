(ns clojure-hackos.utils.helpers
  "Assorted useful functions")

(defn- every-step?
  "Returns `true` if the arithmetic difference between every pair of elements
  in `coll` satisfies the given `pred`."
  [pred coll]
  (let [len (count coll)]
    (if (<= len 1) true
        (->> (range (dec len))
             (take-while #(pred (- (nth coll (inc %) 0) (nth coll %))))
             (count)
             (= (dec len))))))

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
   (every-step? nat-int? coll))
  ([pred coll]
   (every-step? pred coll)))
