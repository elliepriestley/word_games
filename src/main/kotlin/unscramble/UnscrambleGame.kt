package unscramble

class UnscrambleGame {
    val wordList = listOf("pound", "trice", "hired", "comma", "logic")

    fun wordRandomiser(inputList: List<String>): String {
        return inputList.random()
    }

    fun scrambleWord(inputWord: String): String {
        return inputWord.toList().shuffled().joinToString("")
    }

    fun isGuessCorrect(userGuess: String, correctAnswer: String): Boolean {
        return userGuess == correctAnswer
    }

    fun playGame() {
        val word = wordRandomiser(wordList)
        val scrambledWord = scrambleWord(word)
        println("Here is a random scrambled word: $scrambledWord")
        println("Can you unscramble it? What is your guess? : ")
        val userGuess = readln()
        if (isGuessCorrect(userGuess, word)) {
            println("Correct! Well done, you've beaten the game")
        } else {
            println("Oh no! The correct answer was $word. You lost...")
        }
    }
}