package org.coolstuff.codility;

/**
 * Created by andersonkmi on 8/14/2016.
 */
public class Battleship {
    private enum Coords {
        A,
        B,
        C,
        D,
        E,
        F,
        G,
        H,
        I,
        J,
        K,
        L,
        M,
        N,
        O,
        P,
        Q,
        R,
        S,
        T,
        U,
        V,
        W,
        X,
        Y,
        Z;

        public int getCoords(char coord) {
            for(Coords item : Coords.values()) {
                if(item.name().equalsIgnoreCase(String.valueOf(coord))) {
                    return item.ordinal();
                }
            }
            return null;
        }
    }
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
        switch(position) {
            case 'A':
                return 0;
            break;

            case 'B':
                return 1;
            break;

            case 'C':
                return 2;
            break;
        }
    }
}
