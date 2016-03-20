; (ns todo-list.core
;   (:gen-class))
(ns example.core
	(:require
		[ring.adapter.jetty :as jetty]))

(defn -main []
	(jetty/run-jetty
		(fn [req] {:status 200 :body "images/giphy.gif"}
			{:port 5000}))
	)


; (defn giphy []
; 	(println "<html><body><img src='http://giphy.com/gifs/please-construction-patient-12onZb4hOx3xza' alt=""/></body></html>"))


; (defn -main
;   "I don't do a whole lot ... yet."
;   [& args]
;   (println "Hello, World!"))
