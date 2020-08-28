(ns clojure-hackos.bubble-sort-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/ctci-bubble-sort/problem"
  (:require [clojure.test :as test :refer [deftest testing is]]
            [clojure.string :as s]
            [clojure-hackos.bubble-sort :as b]))

(defn- format-answer [ans]
  (s/join "\n"
          (mapv format
                ["Array is sorted in %d swaps."
                 "First Element: %d"
                 "Last Element: %d"]
                ans)))

(deftest bubble-sort-returns-sorted-array-unchanged
  (testing "Test against first HR test case"
    (is (= "Array is sorted in 0 swaps.\nFirst Element: 1\nLast Element: 3"
           (format-answer (b/bubble-sort '(1 2 3) 3))))))

(deftest bubble-sort-returns-3-n-array-in-3-swaps
  (testing "Test against second HR test case"
    (is (= "Array is sorted in 3 swaps.\nFirst Element: 1\nLast Element: 3"
           (format-answer (b/bubble-sort '(3 2 1) 3))))))

(deftest bubble-sort-sorts-4-n-array-in-5-swaps
  (testing "Test against third HR test case"
    (is (= "Array is sorted in 5 swaps.\nFirst Element: 1\nLast Element: 4"
           (format-answer (b/bubble-sort '(4 2 3 1) 4))))))
