(ns clojure-hackos.time-in-words-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/the-time-in-words/problem"
  (:require [clojure.test :as test :refer [deftest testing is]]
            [clojure-hackos.time-in-words :as clock]))

(deftest time->str-knows-when-the-half-hour-is-passed
  (testing "Test against first HR test case"
    (is (= "thirteen minutes to six" (clock/time->str 5 47)))))

(deftest time->str-expresses-the-top-of-the-hour
  (testing "Test against second HR test case"
    (is (= "three o' clock" (clock/time->str 3 00)))))

(deftest time->str-expresses-quarter-hours
  (testing "Test against third HR test case"
    (is (= "quarter past seven" (clock/time->str 7 15)))))