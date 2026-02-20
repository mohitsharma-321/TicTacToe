package org.example.tictactoe.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Board {

    private List<List<BoardCell>> cells = new ArrayList<>();
}
