(ns clojure-hackos.electronics-shop-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/electronics-shop/problem"
  (:require [clojure.test :as test :refer [deftest testing is]]
            [clojure-hackos.electronics-shop :as shop]))

(deftest money-spent-finds-best-purchase-plan
  (testing "Test against first HR test case"
    (is (= 9 (shop/money-spent '(3 1) '(5 2 8) 10)))))

(deftest money-spent-knows-when-all-purchase-plans-are-over-buget
  (testing "Test against second HR test case"
    (is (= -1 (shop/money-spent '(4) '(5) 5)))))