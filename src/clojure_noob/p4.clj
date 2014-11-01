(ns p4
  (require [clojure.string :as s]))

;A palindromic number reads the same both ways.
;The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
;Find the largest palindrome made from the product of two 3-digit numbers.
(defn palindrome? [num]
  (= (str num) (s/reverse (str num)))
  )

(defn problem4 []
  (reduce max (for [x (range 999 99 -1) y (range 999 99 -1)
               :let [z (* x y)]
               :when (palindrome? z)]
      z) )
  )
