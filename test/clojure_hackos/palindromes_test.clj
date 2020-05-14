(ns clojure-hackos.palindromes-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem"
  (:require [clojure.test :as test :refer [deftest testing is]]
            [clojure-hackos.palindromes :as pal]))

(deftest count-factors-passes-hr-test-case
  (testing "Test against first HR test case"
    (is (= 2 (pal/count-factors 20 23 6)))))

(deftest count-factors-passes-anaother-hr-test-case
  (testing "Test against second HR test case"
    (is (= 33 (pal/count-factors 13 45 3)))))

(deftest count-factors-can-process-big-ranges
  (testing "Test performance on big ranges"
    (is (= 2464 (pal/count-factors 15 12333 5)))))
