(ns clojure-hackos.bon-appetit-test
  (:require [clojure.test :as test :refer [deftest testing is]]
            [clojure-hackos.bon-appetit :as waiter]))

(deftest assess-bill-given-unpaid-bill-returns-number
  (testing "Test accuracy of `assess-bill` when there's a remainder."
    (is (= 5 (Integer/parseInt (waiter/assess-bill '(3 10 2 9) 1 12))) "Expect an integer")))

(deftest assess-bill-given-paid-bill-returns-a-string
  (testing "Test accuracy of `assess-bill` when there's no remainder."
    (is (= "Bon Appetit!" (waiter/assess-bill '(3 10 2 9) 1 7)) "Expect a string")))
