; (ns todo-list.core
;   (:gen-class))
(ns example.core
	(:require
		[ring.adapter.jetty :as jetty]))

(defn hello [] 
	(println "http://giphy.com/gifs/please-construction-patient-12onZb4hOx3xza"))

(defn -main []
	(jetty/run-jetty
		(fn [req] {:status 200 :body "http://giphy.com/gifs/please-construction-patient-12onZb4hOx3xza"})
		{:port 5000}))
; (defn -main [] 
	; (hello))

; (defn -main
;   "I don't do a whole lot ... yet."
;   [& args]
;   (println "Hello, World!"))
