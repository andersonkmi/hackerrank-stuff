package org.coolstuff.codility;

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

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

        public static int getCoords(char coord) {
            for(Coords item : Coords.values()) {
                if(item.name().equalsIgnoreCase(String.valueOf(coord))) {
                    return item.ordinal();
                }
            }
            return -1;
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

    private List<int[][]> giveCoordinates(String coordinates) {
        List<int[][]> results = new LinkedList<>();
        StringTokenizer tokenizer = new StringTokenizer(coordinates);

        String firstCoord = tokenizer.nextToken();
        String secondCoord = tokenizer.nextToken();

        int firstCoordRow = Integer.valueOf(firstCoord.charAt(0));
        int firstCoordCol = Coords.getCoords(firstCoord.charAt(1));

        int secondCoordRow = Integer.valueOf(secondCoord.charAt(0));
        int secondCoordCol = Coords.getCoords(secondCoord.charAt(1));

        return results;
    }
}
