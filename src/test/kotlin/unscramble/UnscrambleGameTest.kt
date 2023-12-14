package unscramble

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class UnscrambleGameTest {

    @Test
    fun `test example test`() {
        assertEquals(1, 1)
    }

    @Test
    fun `test that wordRandomiser function returns a word from inputList`() {
        val underTest = UnscrambleGame()
        val wordList = underTest.wordList

        assert(underTest.wordRandomiser(wordList) in wordList)
    }

//    @Test
//    fun scrambleWord() {
//    }
//
//    @Test
//    fun isGuessCorrect() {
//    }
//
//    @Test
//    fun playGame() {
//    }
}