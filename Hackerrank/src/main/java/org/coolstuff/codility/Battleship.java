package org.coolstuff.codility;

/**
 * Created by andersonkmi on 8/14/2016.
 */
public class Battleship {
    public String solution(int dimension, String ships, String hits) {

        // Builds and initializes the board
        char[][] board = build(dimension);

        // Parses the ships positions and retrieve the coordinates
    }

    private char[][] build(int dimension) {
        char[][] board = new char[dimension][dimension];

        for(int i = 0; i < dimension; i++) {
            for(int j = 0; j < dimension; j++) {
                board[i][j] = 'W';
            }
        }

        return board;
    }

    private int convertLetterToPosition(char position) {
        return (int)Character.toUpperCase(position) - 65;
    }
}
