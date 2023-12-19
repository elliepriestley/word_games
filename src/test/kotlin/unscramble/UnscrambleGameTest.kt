package unscramble

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class UnscrambleGameTest {

    @Test
    fun `test that wordRandomiser function returns a word from inputList`() {
        val underTest = UnscrambleGame()
        val wordList = underTest.fiveLetterWordList

        assert(underTest.wordRandomiser(wordList) in wordList)
    }

    @Test
    fun `test that wordRandomiser function selects a random word from inputList`() {
        val underTest = UnscrambleGame()
        val wordList = underTest.fiveLetterWordList
        // creating a set below means only unique words are stored
        val selectedWords = mutableSetOf<String>()
        repeat(100) {
            val selectedWord = underTest.wordRandomiser(wordList)
            assert(selectedWord in wordList)
            selectedWords.add(selectedWord)
        }
        assertTrue(selectedWords.size > 1)
    }

    @Test
    fun `test that scrambleWord function returns all the same characters as input word`() {
        val underTest = UnscrambleGame()

        "pound".forEach { char ->
            assert(underTest.scrambleWord("pound").contains(char))
        }
        "trice".forEach { char ->
            assert(underTest.scrambleWord("trice").contains(char))
        }
        "hired".forEach { char ->
            assert(underTest.scrambleWord("hired").contains(char))
        }
        "comma".forEach { char ->
            assert(underTest.scrambleWord("comma").contains(char))
        }
        "logic".forEach { char ->
            assert(underTest.scrambleWord("logic").contains(char))
        }
    }

    @Test
    fun `test that scrambleWord function does not return input word without scrambling it`() {
        val underTest = UnscrambleGame()
        assertNotEquals("pound", underTest.scrambleWord("pound"))
    }

    @Test
    fun `test that isGuessCorrect function returns true for a correct guess`() {
        val underTest = UnscrambleGame()
        val word: String = "hired"
        assertTrue(underTest.isGuessCorrect(word, word))
    }

    @Test
    fun `test that isGuessCorrect function returns false for an incorrect guess`() {
        val underTest = UnscrambleGame()
        val correctAnswer = "comma"
        val incorrectGuess = "commy"
        assertFalse(underTest.isGuessCorrect(incorrectGuess, correctAnswer))
    }

    @Test
    fun `test that fiveLetterWordList only contains five letter words`() {
        val underTest = UnscrambleGame()
        val wordList = underTest.fiveLetterWordList

        assertTrue(wordList.all {it.length == 5})
    }

}