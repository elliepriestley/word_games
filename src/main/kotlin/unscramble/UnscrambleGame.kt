package unscramble

class UnscrambleGame {
    val wordText = UnscrambleWordsTxt()
    val fiveLetterWordList = wordText.unfilteredWordList.filter { it.length == 5 }

    fun wordRandomiser(inputList: List<String>): String {
        return inputList.random()
    }

    fun scrambleWord(inputWord: String): String {
        val result = inputWord.toList().shuffled().joinToString("")
        return if (result != inputWord) result else scrambleWord(result)
    }

    fun isGuessCorrect(userGuess: String, correctAnswer: String): Boolean {
        return userGuess == correctAnswer
    }

    fun isUserInputValid(userInput: String): Boolean {
       return (userInput.length == 5 && userInput.all { char -> char in 'a'..'z' })
    }

    fun userGuessIsInvalid(): String {
        println("""
                ________________________________________________________
                
                Your guess isn't valid. 🥲
                
                Make sure it is a 5 letter word and doesn't contain special characters!
                
                Re-enter your guess below:
                """.trimIndent())
        val newUserGuess = readln()
        return if (!isUserInputValid(newUserGuess)) {
            userGuessIsInvalid()
        } else {
            return newUserGuess
        }
    }

    private fun playIntroduction(scrambledWord: String) {
        println("\n" +
                "  _   _                                    _     _      \n" +
                " | | | |_ __  ___  ___ _ __ __ _ _ __ ___ | |__ | | ___ \n" +
                " | | | | '_ \\/ __|/ __| '__/ _` | '_ ` _ \\| '_ \\| |/ _ \\\n" +
                " | |_| | | | \\__ \\ (__| | | (_| | | | | | | |_) | |  __/\n" +
                "  \\___/|_| |_|___/\\___|_|  \\__,_|_| |_| |_|_.__/|_|\\___|\n" +
                "                                                        \n")
        println("""
                ________________________________________________________
                
                This is the Unscramble word game.👋
                
                Your goal is to unscramble a 5-letter word.                
                
                You have one guess...
                
                Ready?
                
                Here is your random scrambled word: $scrambledWord
                
                Can you unscramble it? Input your guess below 👇 and press Enter: 
        """.trimIndent())
    }

    fun didUserWinGame(word: String, userGuess: String):Boolean {
        var updatedUserGuess = userGuess
        if (!isUserInputValid(updatedUserGuess)) {
            // if it's not valid, userGuessIsInvalid function is run until there is a valid user guess
            updatedUserGuess = userGuessIsInvalid()
        }
        // once input is valid...is guess correct? True or False
        return isGuessCorrect(updatedUserGuess, word)




    }

    fun playGame() {
        val word = wordRandomiser(fiveLetterWordList)
        val scrambledWord = scrambleWord(word)
        playIntroduction(scrambledWord)
        val userGuess = readln()
        val didWin = didUserWinGame(word, userGuess)

        if (didWin) {
            println("\nCorrect! Well done, you've beaten the game! 🥳")
        } else {
            println("\nOh no! The correct answer was '$word'. Better luck next time! 😬")
        }
    }
}

