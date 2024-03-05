package ticTacToeTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ticTacToe.BoardElements;
import ticTacToe.TicTacToe;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTest {
    private TicTacToe ticTacToe;
    @BeforeEach
    public void setUp() {
        ticTacToe = new TicTacToe();
    }
    @Test
    public void testThatGameIsFilledWithEMPTYAtStart() {
        //ticTacToe.checkBoard()[0][0];
        assertEquals(BoardElements.EMPTY, ticTacToe.checkBoard()[0][0]);
    }

    @Test
    public void testThatGameHasTwoPlayers() {
        assertEquals(2, ticTacToe.getNumberOfPlayers());
    }
    @Test
    public void testThatPlayerOneCanPlayGame() {
        ticTacToe.playerOnePlays(1);
        assertEquals(BoardElements.X, ticTacToe.checkBoard()[0][0]);
    }
    @Test
    public void playerOnePlaysAtPositionTwo_playerOnePlaysTest() {
        ticTacToe.playerOnePlays(2);
        assertEquals(BoardElements.X, ticTacToe.checkBoard()[0][1]);
    }
    @Test
    public void playerOnePlaysAtPositionThree_playerOnePlaysTest() {
        ticTacToe.playerOnePlays(3);
        assertEquals(BoardElements.X, ticTacToe.checkBoard()[0][2]);
    }
    @Test
    public void playerOnePlaysAtPositionFour_playerOnePlaysTest() {
        ticTacToe.playerOnePlays(4);
        assertEquals(BoardElements.X, ticTacToe.checkBoard()[1][0]);
    }
    @Test
    public void playerOnePlaysAtPositionFive_playerOnePlaysTest() {
        ticTacToe.playerOnePlays(5);
        assertEquals(BoardElements.X, ticTacToe.checkBoard()[1][1]);
    }
    @Test
    public void playerOnePlaysAtPositionSix_playerOnePlaysTest() {
        ticTacToe.playerOnePlays(6);
        assertEquals(BoardElements.X, ticTacToe.checkBoard()[1][2]);
    }
    @Test
    public void playerOnePlaysAtPositionSeven_playerOnePlaysTest() {
        ticTacToe.playerOnePlays(7);
        assertEquals(BoardElements.X, ticTacToe.checkBoard()[2][0]);
    }
    @Test
    public void playerOnePlaysAtPositionEight_playerOnePlaysTest() {
        ticTacToe.playerOnePlays(8);
        assertEquals(BoardElements.X, ticTacToe.checkBoard()[2][1]);
    }
    @Test
    public void playerOnePlaysAtPositionNine_playerOnePlaysTest() {
        ticTacToe.playerOnePlays(9);
        assertEquals(BoardElements.X, ticTacToe.checkBoard()[2][2]);
    }

}
