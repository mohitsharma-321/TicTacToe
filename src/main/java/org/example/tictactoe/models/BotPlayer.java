package org.example.tictactoe.models;

import org.example.tictactoe.strategies.PlayingStrategy;

public class BotPlayer extends Player{

    PlayingStrategy playingStrategy;

    @Override
    public BoardCell makeMove(Board board) {
        return playingStrategy.makeMove(board);
    }
}
