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
        if (position == 2) {
            board[0][1] = BoardElements.X;
        }
        if (position == 3) {
            board[0][2] = BoardElements.X;
        }
        if (position == 4) {
            board[1][0] = BoardElements.X;
        }
        if (position == 5) {
            board[1][1] = BoardElements.X;
        }
        if (position == 6) {
            board[1][2] = BoardElements.X;
        }
        if (position == 7) {
            board[2][0] = BoardElements.X;
        }
        if (position == 8) {
            board[2][1] = BoardElements.X;
        }
        if (position == 9) {
            board[2][2] = BoardElements.X;
        }
    }
    public void playerTwoPlays(int position) {
        if (position == 1) {
            board[0][0] = BoardElements.X;
        }
        if (position == 2) {
            board[0][1] = BoardElements.X;
        }
        if (position == 3) {
            board[0][2] = BoardElements.X;
        }
        if (position == 4) {
            board[1][0] = BoardElements.X;
        }
        if (position == 5) {
            board[1][1] = BoardElements.X;
        }
        if (position == 6) {
            board[1][2] = BoardElements.X;
        }
        if (position == 7) {
            board[2][0] = BoardElements.X;
        }
        if (position == 8) {
            board[2][1] = BoardElements.X;
        }
        if (position == 9) {
            board[2][2] = BoardElements.X;
        }
    }



}
