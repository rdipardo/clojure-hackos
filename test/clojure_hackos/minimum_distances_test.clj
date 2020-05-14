(ns clojure-hackos.minimum-distances-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/minimum-distances/problem"
  (:require [clojure.test :as test :refer [deftest testing is]]
            [clojure-hackos.minimum-distances :as min-d]))

(deftest min-distance-finds-min-distance-between-matching-elements
  (testing "Test against first HR test case"
    (is (= 3 (min-d/min-distance [7 1 3 4 1 7])))))

(deftest min-distance-knows-when-no-pairs-exist
  (testing "Test against second HR test case"
    (is (= -1 (min-d/min-distance [1 2 3 4 10])))))