# Unscramble CLI Word Game 🅰️

This is a guide for developers working on this codebase on how to run the program, run tests, and build an executable.

## 💬 Description

Unscramble is a command-line game where the player is given two scrambled words, and they have to guess the original word for each in order to win. The game is written in Kotlin.

## 📚 Table of Contents
- [Prerequisites](#-prerequisites)
- [Installation and Build](#-installation-and-build)
- [Running Tests](#-running-tests)
- [How to run the program](#-how-to-run-the-program)
- [How to pass arguments to the program](#-how-to-pass-arguments-to-the-program)
- [Usage Notes and Future Scope](#-usage-notes-and-future-scope)


## 💡 Prerequisites

### Kotlin and Java:

This project is written in Kotlin and requires the installation of the Kotlin compiler (version `1.9.21`):
- You can manually install the compiler from [GitHub Releases](https://github.com/JetBrains/kotlin/releases/tag/v1.9.21) 
- Or alternatively, you can install it directly on the command line 
  - Install it on macOS via [HomeBrew](https://brew.sh/) with:
    `brew update;
    brew install kotlin`

This project also requires the installation of Java `version 1.7` or above


## 🚀 Installation and Build

Clone this repo to your local machine with the following command: `git@github.com:elliepriestley/word_games.git`
  
To get an executable (or .jar in this case)
- Navigate to the unscramble subdirectory. From the root directory: `cd src/main/kotlin/unscramble`
- Use this command to build the executable: `kotlinc *.kt -include-runtime -d unscramble.jar`
- The executable is `java -jar unscramble.jar`


 ## 🧪 Running tests

To run the tests directly in the Command Line:
- Navigate to the root directory 'word_games'
- Run `./gradlew test` to see all test information
- If this does not display the individual tests, you may need to run `./gradlew test --rerun-tasks` as by default, Gradle only re-executes a task if its inputs have changed since the last execution. However, use this with caution as it increases the time it takes to run the tests and should generally only be used when debugging. 


## 🏁 How to run the program
- Navigate to the root directory 'word_games'
- Use the command `./unscramble` to run the shell script and start the program.

## ✏️ How to pass arguments to the program

- Once the program has been executed with `./unscramble` it will prompt the user to enter a guess by typing directly into the command line and pressing Enter.
- The program does not currently accept command-line arguments.



## 🧩 Usage Notes, Limitations and Future Scope

This section lists any assumptions I have made about the functionality or known limitations of the program.
 - Program now only accepts user guesses that are 5-letter words with characters a..z
 - Program now accepts correct user guesses regardless of case, i.e. if user guesses correct word in uppercase, answer still taken as valid
 - Program does not currently allow the user to choose the no of rounds / difficulty level
 - Program does not currently allow the user to 'select' which word they want to unscramble first
 - Program does not currently have the ability to recognise when a user is new. It will play the Introduction / rules to the game at the start of each new game
 - Program does not currently accept command-line arguments.
 - Does not currently account for multiple correct answers on one scrambled word: i.e. 'hired' and 'hider'
 - Does not currently validate user input before submitting it as a guess, i.e. 'Are you sure x is your guess?'
 - Does not currently handle 'near-misses', where user's guess is only wrong by one character
 - Not tested on any other system than macOS
 - Several functions not fully tested - tested via user interaction rather than tests. This is due to the function's need for user input on CLI:
   - userGuessIsValid function
   - playIntroduction function
   - didUserWinGame function
   - playGame function