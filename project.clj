(defproject clojure-hackos "0.1.0"
  :description "Clojurian solutions to various HackerRank challenges"
  :url "https://github.com/rdipardo/clojure-hackos"
  :license {:name "Public Domain"
            :url "https://unlicense.org"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :repl-options {:init-ns clojure-hackos.helpers}
  :target-path "target/%s"
  :profiles {:dev
             {:dependencies [[criterium "0.4.5"]]
              :plugins [[cider/cider-nrepl "0.22.4"]
                        [lein-cljfmt "0.6.4"]]}
             :uberjar {:aot :all}})
