(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [x & args]
  (println x)
  (println (count args))
  (println "I am actually a little teapot"))


;Project euler 1
(defn multipliesOf3And5 [i sum]
  (when (< i 1000)
    (if (= (mod i 3) 0)  (mod )))
  )

;Project euler 2
(defn finbo-gen [i l]
  (loop [x i list l]
    ;(println x)
    ;(println list)
    (let [next (+ (first list) (nth list 1))]
      (if (> x next)
        (recur x (conj list next))
        list
        )
      )
    )
  )

(defn sumofEvenFibo [x]
  (reduce + 0 (filter even? (finbo-gen x (list 2 1)))
    )
  )



(defn make-adder [x]
  (let [y x]
    (fn [z] (+ y z))
    )
  )

(def add2 (make-adder 2))

