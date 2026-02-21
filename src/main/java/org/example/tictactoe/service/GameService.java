package org.example.tictactoe.service;

import org.example.tictactoe.models.Board;

public class GameService {

    public Board createGame(Board board) {
        return null;
    }

    public Board intializeBoard() {
        Board currBoard = new Board();
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        currBoard.setCells(board);
        return currBoard;

    }

    public void printBoard(Board board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board.getCells()[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Boolean checkWinner(Board board,char currentPlayer) {
        for (int i = 0; i < 3; i++)
            if (board.getCells()[i][0] == currentPlayer &&
                    board.getCells()[i][1] == currentPlayer &&
                    board.getCells()[i][2] == currentPlayer)
                return true;
        for (int j = 0; j < 3; j++)
            if (board.getCells()[0][j] == currentPlayer &&
                    board.getCells()[1][j] == currentPlayer &&
                    board.getCells()[2][j] == currentPlayer)
                return true;

        if (board.getCells()[0][0] == currentPlayer &&
                board.getCells()[1][1] == currentPlayer &&
                board.getCells()[2][2] == currentPlayer)
            return true;

        if (board.getCells()[0][2] == currentPlayer &&
                board.getCells()[1][1] == currentPlayer &&
                board.getCells()[2][0] == currentPlayer)
            return true;

        return false;
    }

    public Boolean isBoardFull(Board board) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board.getCells()[i][j] == '-') return false;
        return true;
    }
}
