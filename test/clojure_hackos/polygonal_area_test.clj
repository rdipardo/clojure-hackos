(ns clojure-hackos.polygonal-area-test
  "Find the HR test cases at:
  https://www.hackerrank.com/challenges/lambda-march-compute-the-area-of-a-polygon/problem"
  (:require [clojure.test :as test :refer [deftest testing is]]
            [clojure-hackos.test.io-helper :as tio]
            [clojure-hackos.polygonal-area :as pa]))

(deftest compute-area-of-a-square
  (testing "Test against first HR test case"
    (let [res (tio/with-input pa/area "resources/square.txt")]
      (when-not (nil? res)
        (is (= "1.0000000" (format "%.7f" res)))))))

(deftest compute-area-of-a-triangle
  (testing "Test against second HR test case"
    (let [res (tio/with-input pa/area "resources/triangle.txt")]
      (when-not (nil? res)
        (is (= "115342.0" (format "%.1f" res)))))))

(deftest compute-area-of-an-octagon
  (testing "Test against third HR test case"
    (let [res (tio/with-input pa/area "resources/octagon_1.txt")]
      (when-not (nil? res)
        (is (= "255931.0" (format "%.1f" res)))))))

(deftest compute-area-of-another-octagon
  (testing "Test against fourth HR test case"
    (let [res (tio/with-input pa/area "resources/octagon_2.txt")]
      (when-not (nil? res)
        (is (= "277068.0" (format "%.1f" res)))))))
