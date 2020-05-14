(ns clojure-hackos.halloween-sale-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/halloween-sale/problem"
  (:require [clojure.test :as test :refer [deftest testing is]]
            [clojure-hackos.halloween-sale :as spook]))

(deftest how-many-games-passes-hr-test-case
  (testing "Test against first HR test case"
    (is (= 6 (spook/how-many-games 20 3 6 80)))))

(deftest how-many-games-passes-anaother-hr-test-case
  (testing "Test against second HR test case"
    (is (= 7 (spook/how-many-games 20 3 6 85)))))