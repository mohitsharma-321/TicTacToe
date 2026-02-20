package org.example.tictactoe.models;

import lombok.Getter;

@Getter
public class HumanPlayer extends Player{

    User user;

    @Override
    public BoardCell makeMove(Board board) {
        return null;
    }
}
