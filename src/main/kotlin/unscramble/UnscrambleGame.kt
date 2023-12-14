package unscramble

class UnscrambleGame {
    val wordList = listOf("pound", "trice", "hired", "comma", "logic")

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

    fun playGame() {
        val word = wordRandomiser(wordList)
        val scrambledWord = scrambleWord(word)
        println("\n" +
                "  _   _                                    _     _      \n" +
                " | | | |_ __  ___  ___ _ __ __ _ _ __ ___ | |__ | | ___ \n" +
                " | | | | '_ \\/ __|/ __| '__/ _` | '_ ` _ \\| '_ \\| |/ _ \\\n" +
                " | |_| | | | \\__ \\ (__| | | (_| | | | | | | |_) | |  __/\n" +
                "  \\___/|_| |_|___/\\___|_|  \\__,_|_| |_| |_|_.__/|_|\\___|\n" +
                "                                                        \n")
        println("________________________________________________________")
        println("\nThis is the Unscramble word game.👋\n\nYour goal is to unscramble a 5-letter word.\n\nYou have one guess...\n\nReady?\n\nHere is your random scrambled word: $scrambledWord")
        println("\nCan you unscramble it? Input your guess below 👇 and press Enter: ")

        val userGuess = readln()
        if (isGuessCorrect(userGuess, word)) {
            println("\nCorrect! Well done, you've beaten the game! 🥳")
        } else {
            println("\nOh no! The correct answer was '$word'. Better luck next time! 😬")
        }
    }
}