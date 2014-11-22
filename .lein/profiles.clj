{

 :user {
        
        :plugins [[lein-droid "0.2.3"]
                  [lein-cljsbuild "1.0.3"]
                  [lein-marginalia "0.8.0"]
                  ;;[lein-voom "0.1.0-20140716_032004-g85e4c9b"]
                  [lein-ancient "0.5.5"]
                  [lein-cprint "1.0.0"]
                  [lein-pprint "1.1.2"]
                  [lein-shell "0.4.0"]
                  [lein-localrepo "0.5.3"]
                  [lein-try "0.4.3"]
                  [cider/cider-nrepl "0.8.1"]]

        :dependencies [
                       [slamhound "1.5.5"]
                       [compliment "0.2.0"]
                       [alembic "0.3.2"]
                       ]

        :aliases {
                  "slamhound" ["run" "m" "slam.hound"]
                  }


        :android {
                  ;;:sdk-path "/home/wei/android-sdk"
                  ;;:keystore-path ~(clojure.string/join (System/getProperty "file.separator") [(System/getProperty "user.home") ".android" "pengw.keystore"])
                  ;;:keystore-path "/home/wei/.android/pengw.keystore"
                  ;;:key-alias "pengw"

                  ;;:storepass ""
                  ;;#:keypass ""
                  }

        }

 }
