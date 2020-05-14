(ns clojure-hackos.caesar-cipher-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/caesar-cipher-1/problem"
  (:require [clojure.test :as test :refer [deftest testing is]]
            [clojure-hackos.caesar-cipher :as jules]))

(deftest test-encryption-by-rotating-2-letters
  (testing "Test against first HR test case"
    (is (= "okffng-Qwvb"
           (jules/encrypt "middle-Outz" 2)))))

(deftest test-encryption-of-David-Bowie-lyrics
  (testing "Test against challenge author's test case"
    (is (= "Wkhuh'v-d-vwdupdq-zdlwlq'-lq-wkh-vnb"
           (jules/encrypt "There's-a-starman-waitin'-in-the-sky" 3)))))

(deftest test-encryption-by-rotating-5-letters
  (testing "Test against second HR test case"
    (is (= "Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj"
           (jules/encrypt "Always-Look-on-the-Bright-Side-of-Life" 5)))))

