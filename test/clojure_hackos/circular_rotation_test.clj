(ns clojure-hackos.circular-rotation-test
  (:require [clojure.test :as test :refer [deftest testing is]]
            [criterium.core :refer [time-body]]
            [clojure-hackos.circular-rotation :as circ]))

(deftest rotate-gets-right-answer
  (testing "Test accuracy of `rotate`"
    (is (= "2\n3\n1" (circ/rotate '(1 2 3) 2 '(0 1 2))))))

(deftest rotate-slow-gets-right-answer
  (testing "Test accuracy of `rotate-slow`"
    (is (= "2\n3\n1" (circ/rotate-slow '(1 2 3) 2 '(0 1 2))))))

(deftest rotate-is-faster
  (testing "Test efficiency of `rotate` vis-à-vis`rotate-slow`"
    (let [slow-run (first (time-body  (circ/rotate-slow '(7 5 3 2 5) 20 (range 5))))
          better-run (first (time-body (first (circ/rotate '(7 5 3 2 5) 20 (range 5)))))
          raw->percent #(format "%.3f" (- 100 (* 100 (double (/ %1 %2)))))]
      (is (< better-run slow-run))
      (println (str "circular-rotation/rotate-slow finished in " slow-run " mms."))
      (println (str "circular-rotation/rotate finished in " better-run " mms."))
      (println (str "Improvement: " (raw->percent better-run slow-run) "%")))))
