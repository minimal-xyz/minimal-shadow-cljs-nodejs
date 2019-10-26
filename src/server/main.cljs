
(ns server.main
 (:require-macros [server.macro :refer [defcomp]]))

(def value-a 1)

(defonce value-b 2)

(defn reload! []
  (println "Code updated.")
  (println "Trying values:" value-a value-b))

(defcomp comp-a [a] {:data a})

(defn main! []
  (println "App loaded!")
  (println (comp-a 100)))
