package unscramble

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


fun main() {
//    println("What is your name?")
//    val name = readln()
//    println("Hello $name! Welcome to my program")
    val word = wordRandomiser(wordList)
    val scrambledWord = scrambleWord(word)
    println("Here is a random scrambled word: ${scrambledWord}")
    println("Can you unscramble it? What is your guess? : ")
    val userGuess = readln()
    if (isGuessCorrect(userGuess, word)) {
        println("Correct! Well done, you've beaten the game")
    } else {
        println("Oh no! The correct answer was $word. You lost...")
    }
}




