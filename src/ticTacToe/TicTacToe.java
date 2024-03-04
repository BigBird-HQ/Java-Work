package ticTacToe;

public class TicTacToe {
    private BoardElements[][] board = new BoardElements[3][3];
    private int numberOfPlayers = 2;

    public TicTacToe() {
        for (int index = 0; index < board.length; index++) {
            for (int count = 0; count < board.length; count++) {
                board[index][count] = BoardElements.EMPTY;
            }
        }

    }

    public BoardElements[][] checkBoard() {
        return board;
    }
    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void playerOnePlays(int position) {
        if (position == 1) {
            board[0][0] = BoardElements.X;
        }
    }


}
