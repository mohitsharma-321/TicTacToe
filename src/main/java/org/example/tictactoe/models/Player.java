package org.example.tictactoe.models;


public abstract class Player {
    Symbol symbol;

    public abstract BoardCell makeMove(Board board);
}
