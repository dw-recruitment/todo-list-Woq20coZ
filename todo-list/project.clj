(defproject todo-list "0.1.0-SNAPSHOT"
  :description "todo-list: a list of todo items"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
  							[org.clojure/clojure "1.6.0"]
  							[ring/ring-core "1.4.0"]
  							[ring/ring-jetty-adapter "1.4.0"]
                [hiccup "1.0.5"]
  							]
  :main todo-list.core/hello							
  :main ^:skip-aot todo-list.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
