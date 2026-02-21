package org.example.tictactoe;

import org.example.tictactoe.models.Game;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        game.setBoard(game.intializeBoard());
        game.printBoard(game.getBoard());

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Player " + game.getCurrentPlayer() + ", enter row and column (0-2):");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (row < 0 || col < 0 || row > 2 || col > 2 || game.getBoard().getCells()[row][col] != '-') {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            game.getBoard().getCells()[row][col] = game.getCurrentPlayer();
            game.printBoard(game.getBoard());

            if (game.checkWinner(game.getBoard())) {
                System.out.println("Player " + game.getCurrentPlayer() + " wins!");
                break;
            }
            if (game.isBoardFull(game.getBoard())) {
                System.out.println("It's a draw!");
                break;
            }

            game.setCurrentPlayer( (game.getCurrentPlayer() == 'X') ? 'O' : 'X');
        }
        sc.close();

    }
}