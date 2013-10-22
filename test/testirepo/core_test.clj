(ns testirepo.core-test
  (:require [midje.sweet :refer :all]
            [testirepo.core :refer :all]))

(fact "foo" {:exercise 1
             :points 1}
      (foo 2) => 4
      (foo 3) => 6)

(fact "bar" {:exercise 2
             :points 1}
      (bar 2) => 4
      (bar 3) => 9)
