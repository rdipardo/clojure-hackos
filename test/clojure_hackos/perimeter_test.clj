(ns clojure-hackos.perimeter-test
  "Find the HR test cases at:
  https://www.hackerrank.com/challenges/lambda-march-compute-the-perimeter-of-a-polygon/problem"
  (:require [clojure.test :as test :refer [deftest testing is]]
            [clojure-hackos.utils.test.io-helper :as tio]
            [clojure-hackos.perimeter :as p]))

(deftest compute-perimeter-of-a-square
  (testing "Test against first HR test case"
    (let [res (tio/with-input
                p/perimeter "resources/square.txt" :linalg true)]
      (when-not (nil? res)
        (is (= "4.0000000" (format "%.7f" res)))))))

(deftest compute-perimeter-of-a-triangle
  (testing "Test against second HR test case"
    (let [res (tio/with-input
                p/perimeter "resources/triangle.txt" :linalg true)]
      (when-not (nil? res)
        (is (= "1556.3949033" (format "%.7f" res)))))))

(deftest compute-perimeter-of-an-octagon
  (testing "Test against third HR test case"
    (let [res (tio/with-input
                p/perimeter "resources/octagon_1.txt" :linalg true)]
      (when-not (nil? res)
        (is (= "1847.48055065" (format "%.8f" res)))))))
