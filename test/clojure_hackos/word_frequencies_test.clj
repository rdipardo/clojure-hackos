(ns clojure-hackos.word-frequencies-test
  "Find the HR test cases at: https://www.hackerrank.com/challenges/ctci-ransom-note/problem"
  (:require [clojure.test :refer [deftest testing is]]
            [clojure-hackos.utils.test.io-helper :as tio]
            [clojure-hackos.word-frequencies :as wf]))

(deftest proper-subset-of?-given-a-proper-subset-returns-yes
  (testing "Test against first HR test case"
    (is (= "Yes"
           (wf/proper-subset-of? "give me one grand today night"
                                 "give one grand today")))))

(deftest proper-subset-of?-given-unmatched-frequencies-returns-no
  (testing "Test against second HR test case"
    (is (= "No"
           (wf/proper-subset-of? "two times three is not four"
                                 "two times two is four")))))

(deftest proper-subset-of?-given-disjunct-sets-returns-no
  (testing "Test against third HR test case"
    (is (= "No"
           (wf/proper-subset-of?
            "ive got a lovely bunch of coconuts"
            "ive got some coconuts")))))

(deftest proper-subset-of?-given-huge-redundant-set-returns-yes
  (testing "Test against obscure HR test case"
    (let [res
          (tio/with-input
            wf/proper-subset-of? "resources/huge_word_freqs.txt")]
      (when-not (nil? res)
        (is (= "Yes"))))))
