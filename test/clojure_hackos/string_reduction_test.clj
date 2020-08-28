(ns clojure-hackos.string-reduction-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/reduced-string/problem"
  (:require [clojure.test :refer [deftest testing is]]
            [clojure-hackos.string-reduction :as sr]))

(deftest reduce-str-returns-a-shortened-string
  (testing "Test against first HR test case"
    (is (= "abd" (sr/reduce-str "aaabccddd")))))

(deftest reduce-str-returns-empty-string-when-every-letter-is-duplicated
  (testing "Test against second HR test case"
    (is (= "Empty String" (sr/reduce-str "aa")))))

(deftest reduce-str-returns-empty-string-when-letters-are-equally-duplicated
  (testing "Test against third HR test case"
    (is (= "Empty String" (sr/reduce-str "baab")))))
