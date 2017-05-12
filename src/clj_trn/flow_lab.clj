(ns clj-trn.flow-lab)

(defn check-guess
  "Checks a guess you big dummy"
  [secret guess]
  (if (= secret guess)
    (println "You win!")
    (do (if (> guess secret)
          (do (println "Too high!"))
          (do (println "Too low!"))))))

(defn check-guess2
  "Checks a guess again you big dummy"
  [secret guess]
  (cond
    (= secret guess) "You win!"
    (> guess secret) "Too high!"
    :else "Too low!"))
