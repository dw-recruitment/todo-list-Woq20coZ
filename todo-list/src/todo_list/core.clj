(ns todo-list.core
  (:gen-class))
; (ns example.core
; 	(:require
; 		[ring.adapter.jetty :as jetty]))

(defn hello []
	[:div {:img "images/giphy.gif"}]
	{:port 5000}
	)

(defn -main []
	(println hello))


; (defn -main []
; 	(jetty/run-jetty
; 		(fn [req] {:status 200 :body "images/giphy.gif"}
; 			{:port 5000}))
; 	)


; (defn -main
;   "I don't do a whole lot ... yet."
;   [& args]
;   (println "Hello, World!"))
