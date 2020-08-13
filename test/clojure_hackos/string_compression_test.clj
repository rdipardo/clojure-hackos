(ns clojure-hackos.string-compression-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/string-compression/problem"
  (:require [clojure.test :refer [deftest testing is]]
            [clojure-hackos.string-compression :as sc]))

(deftest compress-str-counts-duplicates-at-middle-and-end-position
  (testing "Test against first HR test case"
    (is (= "abca3b3" (sc/compress-str "abcaaabbb")))))

(deftest compress-str-returns-same-string-when-it-has-no-duplicates
  (testing "Test against second HR test case"
    (is (= "abcd" (sc/compress-str "abcd")))))

(deftest compress-str-counts-duplicates-at-start-and-middle-position
  (testing "Test against third HR test case"
    (is (= "a3ba4c2a4ba" (sc/compress-str "aaabaaaaccaaaaba")))))
