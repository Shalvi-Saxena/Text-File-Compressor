# Compression Menu

## Overview
Welcome to the Compression Menu! This Clojure program provides a simple command-line interface for file compression and decompression. It utilizes the `compress` namespace, which includes functions for compressing and decompressing files.

## Usage
1. Ensure you have the necessary dependencies installed.

```clojure
(ns menu
  (:require [compress :refer [compress_file, decompress_file]])
  (:require [clojure.java.io :as io]
            [clojure.string :as str]))
```

2. Run the menu by invoking the `(menu)` function in your Clojure REPL.

## Menu Options

### 1. Display list of files
- This option displays a list of files in the current directory.

### 2. Display file contents
- Enter a file name, and this option will display the contents of the specified file.

### 3. Compress a file
- Compress a file using the `compress_file` function.

### 4. Uncompress a file
- Decompress a file using the `decompress_file` function.

### 5. Exit
- Choose this option to exit the menu.

## Example
```clojure
Enter an option? 
3
Enter file name to compress: example.txt
File compressed successfully!
```

## Notes
- Ensure that the `compress` namespace and its functions are properly defined and available in the current environment.
- Make sure to enter valid file names when prompted.

Enjoy using the Compression Menu! 📁