{

 :user {

        :plugins [[lein-droid "0.2.3"]
                  [lein-cljsbuild "1.0.3"]
                  [lein-marginalia "0.7.1"]
                  [lein-ancient "0.5.5"]
                  [lein-cprint "1.0.0"]
                  [lein-pprint "1.1.1"]
                  [lein-shell "0.4.0"]
                  [lein-localrepo "0.5.3"]
                  [lein-try "0.4.1"]
                  [cider/cider-nrepl "0.8.0-SNAPSHOT"]]

        :dependencies [
                       [slamhound "1.5.5"]
                       [compliment "0.1.3"]
                       [alembic "0.2.1"]
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
