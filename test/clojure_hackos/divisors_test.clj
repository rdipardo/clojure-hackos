(ns clojure-hackos.divisors-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/find-digits/problem"
  (:require [clojure.test :as test :refer [deftest testing is]]
            [clojure-hackos.divisors :as div]))

(deftest find-digits-solves-a-2-digit-number
  (testing "Test against first HR test case"
    (is (= 2 (div/find-digits 12)))))

(deftest find-digits-solves-a-4-digit-number
  (testing "Test against second HR test case"
    (is (= 3 (div/find-digits 1012)))))