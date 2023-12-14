# Unscramble CLI Word Game 🅰️

This is a guide for developers working on this codebase on how to run the program, tests, and build an executable.


## 💡 Prerequisites

### Download Kotlin Compiler:

This project is written in Kotlin and requires the installation of the Kotlin compiler (version `1.9.21`):

- You can manually install the compiler from [Github Releases](https://github.com/JetBrains/kotlin/releases/tag/v1.9.21) 
- Or alternatively, you can install it directly on the command line 
  - Install it on MacOS via [HomeBrew](https://brew.sh/) with:
    `brew update;
    brew install kotlin`

JUNIT5 ? - added to dependencies in gradle file

### Clone the Repo

Clone this repo to your local machine with `git@github.com:elliepriestley/word_games.git`


 ## 🧪 Run tests

To run the tests directly in the Command Line:
- Navigate to the root directory 
- Run `./gradlew test` 


## 🚀 Build
To get an executable (or .jar in this case)
- Navigate to the unscramble subdirectory: `cd src/main/kotlin/unscramble`
- Use this command to build the application: `kotlinc *.kt -include-runtime -d unscramble.jar` 



## 🏁 How to run the program
- Navigate to the unscramble subdirectory. From the root directory:`cd src/main/kotlin/unscramble`
- Run `java -jar unscramble.jar`

## ✏️ How to pass arguments to the program

- Once the program has been executed with `java -jar unscramble.jar` it will prompt the user to enter a guess by typing directly into the command line and pressing Enter



## 🧩 Usage Notes

This section lists any assumptions I have made about the functionality or known limitations of the program.
 - Guess system is currently case-sensitive
 - Does not currently validate user input before submitting it as a guess, i.e. 'Are you sure x is your guess?'
 - Does not currently handle bad inputs to the command line, i.e. does not check in the case that  if user input is empty it was likely a user error
 - Not tested on any other system than MacOS