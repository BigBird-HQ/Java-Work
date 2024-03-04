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
    public void testThatGameIsFilledWithEMPTY() {
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

    }

}
