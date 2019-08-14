
(in-ns 'temp.core)
(import java.awt.Color)

(def pi Math/PI)

(defn to-radians [angle]
  (Math/toRadians angle))

(defn to-degrees [angle]
  (Math/toDegrees angle))

(defn sin [angle]
  (Math/sin (to-radians angle)))

(defn cos [angle]
  (Math/cos (to-radians angle)))

(defn acos [value]
  (to-degrees (Math/acos value)))

 (defn atan2 [y x]
   (Math/toDegrees (Math/atan2 y x)))

(defn sqrt [x]
  (Math/sqrt x))

(defn abs [x]
  (Math/abs x))

(defn pow [n e]
  (Math/pow n e))

(defn round [n]
  (Math/round n))

(defn cartesian-to-polar [ox oy x y]
  (let [x (- x ox)
        y (- y oy)]
    [(sqrt (+ (* x x) (* y y))) (atan2 y x)]))

(defn within [value min max]
  (cond
    (< value min) min
    (> value max) max
    :else value))

(defn get-arg-names [list]
  (map (fn [n]
         (symbol (str "a" n)))
       (range (count (filter (fn [e] (= e '_)) list)))))

(defn substitute-arg-names [list names]
  (if (empty? list)
    ()
    (if (= (first list) '_)
      (cons (first names) (substitute-arg-names (rest list) (rest names)))
      (cons (first list) (substitute-arg-names (rest list) names)))))

(defmacro slots [fname & args]
  (let [names (into [] (get-arg-names args))]
    `(fn ~names
       (~fname ~@(substitute-arg-names args names)))))

(defn in? [elm seq]
  (some #(= elm %) seq))

(defn rand-range [min max]
  (+ (* (rand) (- max min)) min))

(defn get-color [name]
  (if (keyword? name)
    (let [colors {:red (. Color red)
                  :green (new Color 0 158 0)
                  :blue (. Color blue)
                  :white (. Color white)
                  :black (. Color black)
                  :gray (. Color gray)
                  :dark-gray (new Color 30 30 30)
                  :lightgray (. Color lightGray)
                  :yellow (. Color yellow)
                  :purple (new Color 85 26 139)
                  :orange (new Color 255 140 0)
                  :pink (new Color 255 20 147)
                  }]
      (get colors name))
    name))

(defn make-color [r g b]
  (new Color r g b))

(defn get-red [color]
  (.getRed color))

(defn get-green [color]
  (.getGreen color))

(defn get-blue [color]
  (.getBlue color))

(defn near-zero? [value]
  (< (abs value) 0.001))

(defn =-approx [& values]
  (every? near-zero? (map (fn [v1 v2]
                            (- v1 v2))
                          values
                          (rest values))))
(defn sleep [n]
  (Thread/sleep n))

(defn rotate-list [list]
  (reverse (into () (conj (into [] (rest list)) (first list)))))

(defn rotate-until [list predicate] ;;################## infinite loop
  (if (predicate (first list))
    list
    (rotate-until (rotate-list list) predicate)))

(defn map-between-ranges [value min-a max-a min-b max-b]
  (let [a-size (- max-a min-a)
        b-size (- max-b min-b)
        proportion (/ (- value min-a) a-size)]
    (float (+ (* proportion b-size) min-b))))

(defn gen-keyword [base]
  (keyword (gensym (symbol (subs (str base) 1)))))

(defn find-if [pred coll]
  (first (filter pred coll)))

(defn parse-int [string]
  (Integer/parseInt string))

(defn parse-float [string]
  (Float/parseFloat string))

(defn collection-difference [a b]
  (into [] (difference (into #{} a) b)))

(defn create-combinations [& lists]
  (if (= (count lists) 1)
    (map vector (first lists))
    (mapcat (fn [a]
              (map (fn [b]
                     (cons a b))
                   (apply create-combinations (rest lists))))
            (first lists))))

(defn accumulate [list]
  (let [rec (fn [acc lst]
              (if (empty? lst)
                acc
                (recur (conj acc (+ (last acc) (first lst)))
                       (rest lst))))]
    (rec [0] list)))

(defn remove-nil [coll]
  (filter (comp not nil?) coll))

(defn starts-with? [str end]
  (.startsWith str end))

(defn ends-with? [str end]
  (.endsWith str end))

;; get-combined-rotation
;; (get-transform-rotation (combine-transforms (make-transform [0 0 0] [1 0 0 180])
;;                                             (make-transform [0 0 0] [0 1 0 -90]
;;                                                             )))

(defn float-equals? [a b]
  (< (abs (- a b)) 0.0001))

(def not-nil? (comp not nil?))

(defn inside-box? [box x y]
  (let [bx (:x box)
        by (:y box)
        hw (/ (:w box) 2)
        hh (/ (:h box) 2)
        x1 (- bx hw)
        x2 (+ bx hw)
        y1 (- by hh)
        y2 (+ by hh)]
    (and (< x1 x x2)
         (< y1 y y2))))

(defn get-current-time []
  (System/currentTimeMillis))

(defn vector-insert [seq element index]
  (let [before (take index seq)
        after (nthrest seq index)]
    (vec (concat before [element] after))))

(defn vector-remove [seq index]
  (let [before (take index seq)
        after (nthrest seq (inc index))]
    (vec (concat before after))))

(defn kw->str [k]
  (subs (str k) 1))

(defn map-map [func m]
  (apply merge (map func m)))
