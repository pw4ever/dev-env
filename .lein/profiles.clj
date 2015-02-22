{

 :user {
        
        :plugins [
                  ;; for Cider (Clojure IDE and Repl)
                  [cider/cider-nrepl "0.8.2"]
                  [refactor-nrepl "0.2.2"]

                  ;; other Clojure targets
                  ;;[lein-cljsbuild "1.0.3"]
                  ;;[lein-droid "0.2.3"]

                  ;; better REPL
                  [venantius/ultra "0.2.1"]
                  
                  ;; misc plugins
                  [lein-localrepo "0.5.3"]
                  [lein-marginalia "0.8.0"]
                  [lein-javadoc "0.1.1"]
                  [lein-ancient "0.6.1"]
                  [lein-pprint "1.1.2"]
                  
                  ]

        :dependencies [
                       [slamhound "1.5.5"]
                       [alembic "0.3.2"]
                       ]

        ;; https://github.com/venantius/ultra/issues/13
        :ultra {:repl true
                :stacktraces true
                :tests true
                :java true
                :color-scheme :solarized_dark}

        ;; local JDK API javadoc
        :resource-paths ["/usr/share/doc/java/api/"]

        :aliases {
                  "slamhound" ["run" "m" "slam.hound"]
                  }


        :android {
                  ;;:sdk-path "/home/wei/android-sdk"
                  ;;:keystore-path ~(clojure.string/join (System/getProperty "file.separator") [(System/getProperty "user.home") ".android" "pengw.keystore"])
                  ;;:keystore-path "/home/wei/.android/pengw.keystore"
                  ;;:key-alias "pengw"

                  ;;:storepass ""
                  ;;:keypass ""
                  }

        }

 }
