(ns p5)

;2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
;What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

(defn gcd [a b]
  (cond (= 1 b) b
        (zero? (rem a b)) b
        :else (recur b (rem a b)))
  )

(defn smallestMultiple [n]
  (loop [res n i n]
    (cond (= i 1) res
          :else (recur (/ (* res i) (gcd res i)) (dec i)))
    )
  )

(defn problem5 []
  (smallestMultiple 20))


