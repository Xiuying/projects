(defproject hbc.transposon "0.0.2-SNAPSHOT"
  :description "Track and analyze transposon insertion points over time."
  :dependencies [[org.clojure/clojure "1.5.0"]
                 [org.clojure/data.csv "0.1.2"]
                 [clj-yaml "0.4.0"]
                 [me.raynes/fs "1.4.0"]
                 [incanter "1.4.1"]]
  :min-lein-version "2.0.0"
  :profiles {:dev {:dependencies [[midje "1.5-RC1" :exclusions [org.clojure/clojure]]]}}
  :plugins [[lein-midje "3.0-RC1"]]
  :aliases {"merge" ["run" "-m" "hbc.transposon.merge"]
            "score" ["run" "-m" "hbc.transposon.score"]})