(ns clojure-hackos.string-rotation-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/rotate-string/problem"
  (:require [clojure.test :refer [deftest testing is]]
            [clojure.string :as s]
            [clojure-hackos.string-rotation :as sr]))

(deftest permute-str-rotates-3-letter-words
  (testing "Test against first HR test case"
    (is (= "bca cab abc"
           (s/join " " (map #(apply str %) (sr/permute-str "abc")))))))

(deftest permute-str-rotates-5-letter-words
  (testing "Test against second HR test case"
    (is (= "bcdea cdeab deabc eabcd abcde"
           (s/join " " (map #(apply str %) (sr/permute-str "abcde")))))))

(deftest permute-str-rotates-4-letter-words
  (testing "Test against third HR test case"
    (is (= "baba abab baba abab"
           (s/join " " (map #(apply str %) (sr/permute-str "abab")))))))

(deftest permute-str-rotates-n-3-string-sequences
  (testing "Test against fouth HR test case"
    (is (= "aaa aaa aaa"
           (s/join " " (map #(apply str %) (sr/permute-str "aaa")))))))

(deftest permute-str-rotates-n-1-string-sequences
  (testing "Test against fifth HR test case"
    (is (= "z"
           (s/join " " (map #(apply str %) (sr/permute-str "z")))))))
