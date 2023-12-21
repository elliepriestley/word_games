package wordProcessor

import java.io.File

class WordProcessor {
    val file = File("/Users/elliepriestley/IdeaProjects/word_games/src/main/kotlin/wordProcessor/words.txt")
    val wordlist = file.readLines()
}