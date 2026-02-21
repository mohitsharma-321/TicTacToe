package org.example.tictactoe.models;

import lombok.Getter;
import lombok.Setter;
import org.example.tictactoe.service.GameService;

@Getter
@Setter
public class Game {

    private String name;
   // private List<Player> players = new ArrayList<>();
    private char currentPlayer = 'X';
    private Board board;

    GameService gameService = new GameService();

//    private static Game instance = null;
//
//    private Game() {}
//
//    public static Game getInstance() {
//        if(instance == null)
//            return new Game();
//        return instance;
//    }
//
    public Board createGame(Board board) {
        return gameService.createGame(board);
    }

    public Board intializeBoard() {
        return gameService.intializeBoard();
    }

    public void printBoard(Board board) {
        gameService.printBoard(board);
    }

    public Boolean checkWinner(Board board) {
        return gameService.checkWinner(board,currentPlayer);
    }
    public Boolean isBoardFull(Board board) {
        return gameService.isBoardFull(board);
    }

    public void execute() {

    }

}
