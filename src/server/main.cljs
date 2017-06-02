
(ns server.main)

(def value-a 1)

(defonce value-b 2)

(defn on-reload []
  (println "Code updated.")
  (println "Trying values:" value-a value-b))

(defn main []
  (println "App loaded!"))
