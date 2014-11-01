(ns p3)

;Project euler 3
;The prime factors of 13195 are 5, 7, 13 and 29.
;What is the largest prime factor of the number 600851475143?

(defn primeFactors [n]
  (loop [f 2 n n res #{}]
    (cond (<= n 1) res
          (zero? (rem n f)) (recur f (quot n f) (conj res f))
          :else (recur (inc f) n res))
    )
  )

(defn problem3 []
  (reduce max (primeFactors 600851475143)))