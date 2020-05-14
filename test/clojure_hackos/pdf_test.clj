(ns clojure-hackos.pdf-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/designer-pdf-viewer/problem"
  (:require [clojure.test :as test :refer [deftest testing is]]
            [clojure-hackos.pdf :as pdf]))

(deftest designer-pdf-viewer-highlights-the-word-aba
  (testing "Test against first HR test case"
    (let [alphabet '(1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5)]
      (is (= 9 (pdf/designer-pdf-viewer alphabet "aba"))))))

(deftest designer-pdf-viewer-highlights-the-word-zaba
  (testing "Test against second HR test case"
    (let [alphabet '(1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7)]
      (is (= 28 (pdf/designer-pdf-viewer alphabet "zaba"))))))