(ns clojure-hackos.day256-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/day-of-the-programmer/problem"
  (:require [clojure.test :as test :refer [deftest testing is]]
            [clojure-hackos.day256 :as cal]))

(deftest day-of-programmer-finds-day-256-in-2017
  (testing "Test against first HR test case"
    (is (= "13.09.2017" (cal/day-of-programmer 2017)))))

(deftest day-of-programmer-finds-day-256-in-2016
  (testing "Test against first HR test case"
    (is (= "12.09.2016" (cal/day-of-programmer 2016)))))

(deftest day-of-programmer-finds-day-256-in-1800
  (testing "Test against first HR test case"
    (is (= "12.09.1800" (cal/day-of-programmer 1800)))))
