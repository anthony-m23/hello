(ns hello.core
  (:gen-class)) 

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn add
  [x y]
  (+ x y))