(ns clojure-hackos.sequence-equation-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/permutation-equation/problem"
  (:require [clojure.test :as test :refer [deftest testing is]]
            [clojure-hackos.sequence-equation :as seq]))

(deftest permute-solves-for-n-3-array
  (testing "Test against first HR test case: "
    (let [ans (seq/permute 3 '(2 3 1))]
      (is (= '(2 3 1) ans)))))

(deftest permute-solves-for-n-5-array
  (testing "Test against second HR test case:"
    (let [ans (seq/permute 5 '(4 3 5 1 2))]
      (is (= '(1 3 5 4 2) ans)))))

(deftest permute-solves-for-anoher-n-5-array
  (testing "Test against another n-5 sequence"
    (let [ans (seq/permute 5 '(5 2 1 3 4))]
      (is (= '(4 2 5 1 3) ans)))))

(deftest permute-given-empty-sequence-returns-nil
  (testing "Bounds checking test case #1"
    (let [ans (seq/permute 0 '())]
      (is (nil? ans)))))

(deftest permute-given-invalid-size-returns-nil
  (testing "Bounds checking test case #2"
    (let [ans (seq/permute 5 [0 1 2])]
      (is (nil? ans)))))

(deftest permute-given-sequence-of-nils-returns-nil
  (testing "Bounds checking test case #3"
    (let [ans (seq/permute 3 '(nil nil nil))]
      (is (nil? ans)))))

(deftest permute-given-non-numeric-sequence-returns-nil
  (testing "Bounds checking test case #4"
    (let [ans (seq/permute 1 "D")]
      (is (nil? ans)))))
