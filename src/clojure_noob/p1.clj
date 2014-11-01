(ns p1)

(defn multiOf3_or_5? [x]
  (or (zero? (rem x 3)) (zero? (rem x 5)))
  )

(defn problem1 []
  (reduce + (filter multiOf3_or_5? (range 1 1000))))