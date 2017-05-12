(ns clj-trn.function-lab)

(defn greet
  "Says Ciao Mondo!"
  []
  (println "Ciao Mondo"))

(def greet2
  "Says Ciao Mondo!"
  (fn [] (println "Ciao Mondo!")))

(def greet3
  "Says Ciao Mondo!"
  #(println "Ciao Mondo!"))

(defn greeting
  "Greets accordingly"
  ([] (println "Ciao Mondo!"))
  ([name] (println (str "Ciao " name "!")))
  ([greeting name] (println (str greeting " " name "!"))))

