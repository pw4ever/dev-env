{

 :user {
        
        :plugins [
                  ;; for Cider (Clojure IDE and Repl)
                  [cider/cider-nrepl "0.8.1"]
                  [refactor-nrepl "0.2.2"]

                  ;; other Clojure targets
                  [lein-cljsbuild "1.0.3"]
                  [lein-droid "0.2.3"]

                  ;; misc plugins
                  [lein-localrepo "0.5.3"]
                  [lein-marginalia "0.8.0"]
                  [lein-javadoc "0.1.1"]
                  [lein-ancient "0.5.5"]
                  [lein-cprint "1.0.0"]
                  [lein-pprint "1.1.2"]
                  [lein-shell "0.4.0"]
                  [lein-try "0.4.3"]
                  
                  ]

        :dependencies [
                       [slamhound "1.5.5"]
                       [compliment "0.2.0"]
                       [alembic "0.3.2"]
                       ]

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
