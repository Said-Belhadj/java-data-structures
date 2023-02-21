package fr.sbelhadj;

import java.util.Arrays;

public class The2dArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = '-';
            }
        }

        System.out.println(Arrays.deepToString(board));

        char[][] board2 = new char[][] {
                new char[]{'-','-','-'},
                new char[]{'-','-','-'},
                new char[]{'-','-','-'}
        };

        System.out.println(Arrays.deepToString(board2));
    }
}
