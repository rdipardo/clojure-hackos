(ns clojure-hackos.apple-and-orange-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/apple-and-orange/problem"
  (:require [clojure.test :as test :refer [deftest testing is]]
            [clojure.string :refer [split]]
            [clojure-hackos.apple-and-orange :as fruit]))

(deftest count-apples-&-oranges-passes-hr-test-case
  (testing "Test against first HR test case"
    (let [ans (fruit/count-apples-&-oranges 7 10 4 12 '(2 3 -4) '(3 -2 -4))
          apples (first (split ans #"\n"))
          oranges (last (split ans #"\n"))]
      (is (and
           (= 1 (Integer/parseInt apples))
           (= 2 (Integer/parseInt oranges)))))))

(deftest count-apples-&-oranges-finds-passes-anoher-hr-test-case
  (testing "Test against second HR test case"
    (let [ans (fruit/count-apples-&-oranges 7 11 5 15 '(-2 2 1) '(5 -6))
          apples (first (split ans #"\n"))
          oranges (last (split ans #"\n"))]
      (is (and
           (= 1 (Integer/parseInt apples))
           (= 1 (Integer/parseInt oranges)))))))