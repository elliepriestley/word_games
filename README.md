# Unscramble CLI Word Game 🅰️

This is a guide for developers working on this codebase on how to run the program, run tests, and build an executable.

## 💬 Description

Unscramble is a command-line game where the player is given a scrambled word, and they have to guess the original word. The game is written in Kotlin.

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
- Install Java version: Corretto-17.0.9.8.1
- TODO - is gradle installation needed?




## 🚀 Installation and Build

Clone this repo to your local machine with the following command: `git@github.com:elliepriestley/word_games.git`
  
To get an executable (or .jar in this case)
- Navigate to the unscramble subdirectory. From the root directory: `cd src/main/kotlin/unscramble`
- Use this command to build the executable: `kotlinc *.kt -include-runtime -d unscramble.jar`
- The executable is `java -jar unscramble.jar`

To create a bash script in order to execute the program using `./unscramble`:
- Navigate to the root directory 'word_games' 
- Open a text editor in your terminal by typing `nano unscramble`, which opens the nano text editor and creates a new file named 'unscramble' 
- Copy and paste the following lines into the text editor:

```
#!/bin/bash
java -jar src/main/kotlin/unscramble/unscramble.jar
```
- Save the file and exit the text editor. If you're using nano, you can do this by pressing Ctrl+X, then Y, then Enter. 
- Make the unscramble script executable by running the following command in your terminal: `chmod +x unscramble`.

 ## 🧪 Running tests

To run the tests directly in the Command Line:
- Navigate to the root directory 'word_games'
- Run `./gradlew test` to see all test information
- If this does not display the individual tests, you may need to run `./gradlew test --rerun-tasks` as by default, Gradle only re-executes a task if its inputs have changed since the last execution. However, use this with caution as it increases the time it takes to run the tests and should generally only be used when debugging. 


## 🏁 How to run the program
- Navigate to the root directory 'word_games'
- As long as you have followed the instructions to create a bash script in [Installation and Build](#-installation-and-build), you can use the command `./unscramble` to run the shell script and start the program.

## ✏️ How to pass arguments to the program

- Once the program has been executed with `./unscramble` it will prompt the user to enter a guess by typing directly into the command line and pressing Enter.
- The program does not currently accept command-line arguments.



## 🧩 Usage Notes and Future Scope

This section lists any assumptions I have made about the functionality or known limitations of the program.
 - Guess system is currently case-sensitive
 - Program does not currently accept command-line arguments.
 - Does not currently account for multiple correct answers on one scrambled word: i.e. 'hired' and 'hider'
 - Does not currently validate user input before submitting it as a guess, i.e. 'Are you sure x is your guess?'
 - Does not currently handle bad inputs to the command line, i.e. does not check in the case that if user input is empty, or not a five-letter word, it was likely a user error
 - Does not currently handle 'near-misses', where user's guess is only wrong by one character
 - Not tested on any other system than MacOS