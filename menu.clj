(ns menu
  (:require [compress :refer [compress_file, decompress_file]])
  (:require [clojure.java.io :as io]
            [clojure.string :as str]))

(defn exit1 []
  (println "Goodbye!!!")
  (System/exit 0))

(defn display-files []
  (let [files (file-seq (java.io.File. "."))]
    (doseq [file files]
      (println (.getName file)))))

(defn display-file-contents []
  (print "Enter file name: ")
  (flush)
  (let [filename (read-line)]
    (when-let [content (try (slurp filename)
                            (catch Exception e
                              (println "Oops: specified file does not exist")))]
      (println content))))

(defn menu []
  (println)
  (println
   "
*** Compression Menu ***
------------------------
1. Display list of files
2. Display file contents
3. Compress a file
4. Uncompress a file
5. Exit")
  (println "Enter an option? ")
  (let [choice (read-line)]
    (case choice
      "1" (do (display-files) (recur))
      "2" (do (display-file-contents) (recur))
      "3" (do (compress_file) (recur))
      "4" (do (decompress_file) (recur))
      "5" (do (exit1))
      (do (println "Invalid choice.") (recur))))
  )
(menu)