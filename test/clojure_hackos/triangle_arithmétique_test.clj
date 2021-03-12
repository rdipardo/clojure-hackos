(ns clojure-hackos.triangle-arithmétique-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/pascals-triangle/problem"
  (:require [clojure.test :as test :refer [deftest testing is]]
            [clojure-hackos.triangle-arithmétique :as tri]))

(deftest walks-triangle-when-n-is-4
  (testing "Test against first HR test case"
    (is (= "1\n1 1\n1 2 1\n1 3 3 1"
           (tri/walk 4)))))

(deftest walks-triangle-when-n-is-10
  (testing "Test against fourth HR test case"
    (is (= "1\n1 1\n1 2 1\n1 3 3 1\n1 4 6 4 1\n1 5 10 10 5 1\n1 6 15 20 15 6 1\n1 7 21 35 35 21 7 1\n1 8 28 56 70 56 28 8 1\n1 9 36 84 126 126 84 36 9 1"
           (tri/walk 10)))))

(deftest walks-triangle-when-n-is-1
  (testing "Test against first trivial test case"
    (is (= "1"
           (tri/walk 1)))))

(deftest doesnt-walk-triangle-when-n-is-0
  (testing "Test against second trivial test case"
    (is (= ""
           (tri/walk 0)))))

(deftest doesnt-walk-triangle-when-n-is-negative
  (testing "Test against third trivial test case"
    (is (= ""
           (tri/walk -37)))))
