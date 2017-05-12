(ns clj-trn.function-lab-test
  (:require [clj-trn.function-lab :refer :all]
            [clojure.test :refer :all]))

(deftest function-lab-tests
  (testing "Function lab tests"
    (assert (nil? (greeting)))
    (assert (nil? (greeting "Carl")))))

