(defproject clojure-hackos "0.1.3"
  :description "Clojurian solutions to various HackerRank challenges"
  :url "https://github.com/rdipardo/clojure-hackos"
  :license {:name "Public Domain"
            :url "https://unlicense.org"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :repl-options {:init-ns clojure-hackos.utils.helpers}
  :target-path "target/%s"
  :profiles {:dev
             {:dependencies [[criterium "0.4.6"]]
              :plugins [[cider/cider-nrepl "0.25.9"]
                        [lein-cljfmt "0.7.0"]]}
             :uberjar {:aot :all}})
