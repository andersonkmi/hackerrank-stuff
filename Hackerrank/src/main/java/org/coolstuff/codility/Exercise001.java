// you can also use imports, for example:
// import java.util.*;
package org.coolstuff.codility;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Exercise001 {
    public String solution(int N, String S, String T) {
        // write your code in Java SE 8
        char[][] board = new char[N][N];
        int hitCount = 0;
        int sinkCount = 0;


        // Initializes board
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                board[i][j] = 'W';
            }
        }

        List<String> ships = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(S, ",");
        while(tokenizer.hasMoreTokens()) {
            String coord = tokenizer.nextToken().trim();
            ships.add(coord);
            markShips(board, coord);
        }

        /*
        for(int index0 = 0; index0 < N; index0++) {
            for(int index1 = 0; index1 < N; index1++) {
                System.out.print(board[index0][index1] + " ");
            }
            System.out.println("\n");
        }*/

        List<String> hits = new ArrayList<>();
        StringTokenizer tokenizer1 = new StringTokenizer(T);
        while(tokenizer1.hasMoreTokens()) {
            String hit = tokenizer1.nextToken().trim();
            hits.add(hit);
            int row = Integer.parseInt(Character.toString(hit.charAt(0))) - 1;
            int col = convertCoordCharToNumber(hit.charAt(1));

            if(board[row][col] == 'S') {
                board[row][col] = 'X';
            } else {
                board[row][col] = 'M';
            }
        }

        /*
        System.out.println("--------");
        for(int index0 = 0; index0 < N; index0++) {
            for(int index1 = 0; index1 < N; index1++) {
                System.out.print(board[index0][index1] + " ");
            }
            System.out.println("\n");
        }*/

        for(String ship : ships) {
            int[] results = verifyShipHits(board, ship);
            sinkCount += results[0];
            hitCount += results[1];
        }

        return String.format("%d,%d", sinkCount, hitCount);
    }

    private void markShips(char[][] board, String shipCoords) {
        StringTokenizer tokenizer = new StringTokenizer(shipCoords);
        String coord1 = tokenizer.nextToken();
        String coord2 = tokenizer.nextToken();

        /*
        System.out.println("Coord1: " + coord1);
        System.out.println("Coord2: " + coord2);
        */

        int row0 = Integer.parseInt(Character.toString(coord1.charAt(0))) - 1;
        int row1 = Integer.parseInt(Character.toString(coord2.charAt(0))) - 1;


        int col0 = convertCoordCharToNumber(coord1.charAt(1));
        int col1 = convertCoordCharToNumber(coord2.charAt(1));

        /*
        System.out.println("Row coords: " + row0 + ", " + row1);
        System.out.println("Col coords: " + col0 + ", " + col1);
        */
        for(int i = row0; i <= row1; i++) {
            for(int j = col0; j <= col1; j++) {
                board[i][j] = 'S';
            }
        }
    }

    private int[] verifyShipHits(char[][] board, String shipCoords) {
        int[] counter = new int[2];

        StringTokenizer tokenizer = new StringTokenizer(shipCoords);
        String coord1 = tokenizer.nextToken();
        String coord2 = tokenizer.nextToken();

        int row0 = Integer.parseInt(Character.toString(coord1.charAt(0))) - 1;
        int row1 = Integer.parseInt(Character.toString(coord2.charAt(0))) - 1;

        int col0 = convertCoordCharToNumber(coord1.charAt(1));
        int col1 = convertCoordCharToNumber(coord2.charAt(1));

        int cellCount = 0;
        int hitCount = 0;

        for(int i = row0; i <= row1; i++) {
            for(int j = col0; j <= col1; j++) {
                cellCount++;
                if(board[i][j] == 'X') {
                    hitCount++;
                }
            }
        }

        if(hitCount == cellCount) {
            counter[0]++;
        } else if(hitCount > 0) {
            counter[1]++;
        }

        return counter;
    }

    private int convertCoordCharToNumber(char coord) {
        switch(coord) {
            case 'A': return 0;
            case 'B': return 1;
            case 'C': return 2;
            case 'D': return 3;
            case 'E': return 4;
            case 'F': return 5;
            case 'G': return 6;
            case 'H': return 7;
            case 'I': return 8;
            case 'J': return 9;
            case 'K': return 10;
            case 'L': return 11;
            case 'M': return 12;
            case 'N': return 13;
            case 'O': return 14;
            case 'P': return 15;
            case 'Q': return 16;
            case 'R': return 17;
            case 'S': return 18;
            case 'T': return 19;
            case 'U': return 20;
            case 'V': return 21;
            case 'W': return 22;
            case 'X': return 23;
            case 'Y': return 24;
            case 'Z': return 25;
            default: return -1;
        }
    }
}