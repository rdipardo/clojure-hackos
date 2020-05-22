(ns clojure-hackos.helpers-test
  (:require
   [clojure.test :refer [deftest testing is]]
   [clojure-hackos.helpers :as lib]))

(deftest idx-of-returns-index-when-found
  (testing "Test retrieval of existing index"
    (is (= 2 (lib/idx-of (range 1 20) 3)))))

(deftest idx-of-returns-neg-one-when-not-found
  (testing "Test return value of failed search"
    (is (= -1 (lib/idx-of (range 1444) 1445)))))

(deftest idx-of-retuns-neg-one-for-empty-seq
  (testing "Test return value when sequence is empty"
    (is (= -1 (lib/idx-of '() 1)))))

(deftest ordered?-ignores-duplicates-in-ascending-seqs-by-default
  (testing "Test return value default predicate is applied"
    (is (lib/ordered? [-1 0 0 1 1 2 3 3 5 8]))))

(deftest ordered?-notices-duplicates-when-given-explicit-predicate
  (testing "Test return value default predicate is applied"
    (is (not (lib/ordered? pos? [-1 0 0 1 1 2 3 3 5 8])))))

(deftest ordered?-returns-true-when-given-empty-sequence
  (testing "Test return value when sequence is empty "
    (is (lib/ordered? '()))))

(deftest ordered?-applies-given-predicate
  (testing "Test return value when passed a predicate function"
    (is (lib/ordered? even? [2 8 10 12 16 24]))))

(defn- descending? [c] lib/ordered? neg? c)

(deftest ordered?-detects-a-descending-sequence
  (testing "Test return value when given a descending sequence"
    (is (descending? [-31 -23 -11 -9 -3 -2 0 1 4 17 20 24]))))
