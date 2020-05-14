(ns clojure-hackos.between-2-sets-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/between-two-sets/problem"
  (:require [clojure.test :as test :refer [deftest testing is]]
            [clojure-hackos.between-2-sets :as sets]))

(deftest get-total-x-finds-numbers-between-unequal-sized-arrays
  (testing "Test against HR test case"
    (is (= 3 (sets/get-total-x '(2 4) '(16 32 96))))))

(deftest get-total-x-finds-numbers-between-equal-sized-arrays
  (testing "Test against one more test case"
    (is (= 2 (sets/get-total-x '(3 4) '(24 48))))))