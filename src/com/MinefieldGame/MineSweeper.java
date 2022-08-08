package com.MinefieldGame;

import java.util.Scanner;

public class MineSweeper {
    Scanner input = new Scanner(System.in);
    int rowBoard, colBoard;
    int row, col;
    int numberOfMines;
    String[][] board;
    String[][] mineArray;
    boolean check = true;
    int count;

    public MineSweeper(int row, int col) {
        this.rowBoard = row;
        this.colBoard = col;
        this.numberOfMines = ((col*row) / 4);
        this.board = new String[row][col];
        this.mineArray = new String[row][col];
    }

    public void userInput() {
        check = false;
        System.out.println();
        System.out.print("Row number of the box you will choose (starting from zero) : ");
        row = input.nextInt();
        System.out.print("Column number of the box you will choose (starting from zero) : ");
        col = input.nextInt();

        while (!check) {
            if ((row >= 0) && (col >= 0) && (row < this.rowBoard) && (col < this.colBoard)) {
                check = true;
            } else {
                System.out.println("You've chosen a point off the map! Try again...");
                System.out.print("Enter the size as row number: ");
                row = input.nextInt();
                System.out.print("Enter the size as column number: ");
                col = input.nextInt();
            }
        }
    }

    public void minesAround() {
        count = 0;
        for (int i = (row - 1); i <= (row + 1); i++) {
            for (int j = (col - 1); j <= (col + 1); j++) {
                if ((i < 0) || (j < 0) || (i >= this.rowBoard) || (j >= this.colBoard)) {
                    continue;
                } else {
                    if (mineArray[i][j].equals("*")) {
                        count++;
                    }
                }
            }
        }
        board[row][col] = String.valueOf(count);
        mineArray[row][col] = String.valueOf(count);
        for (int i = 0; i < this.rowBoard; i++ ) {
            for (int j = 0; j < this.colBoard; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void cheatBoard() {
        for (int i = 0; i < this.rowBoard; i++) {
            for (int j = 0; j < this.colBoard; j++) {
                System.out.print(mineArray[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void fillBoard() {
        for (int i = 0; i < this.rowBoard; i++) {
            for (int j = 0; j < this.colBoard; j++) {
                board[i][j] = "-";
                mineArray[i][j] = "-";
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < numberOfMines; i++) {
            int a = (int) (Math.random() * this.rowBoard);
            int b = (int) (Math.random() * this.colBoard);
            if (mineArray[a][b].equals("*")) {
                i--;
            }
            mineArray[a][b] = "*";
        }
    }

    public boolean winCheck() {
        for (int i = 0; i < this.rowBoard; i++) {
            for (int j = 0; j < this.colBoard; j++) {
                if (mineArray[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void start() {
        fillBoard();

        while (check) {
            userInput();
            if (mineArray[row][col].equals("*")) {
                System.out.println("GAME OVER!");
                System.out.println("Location of mines is below.");
                cheatBoard();
                check = false;
            } else {
                minesAround();
                if (winCheck()) {
                    System.out.println("==================");
                    System.out.println("CONGRATS! YOU WON!");
                    System.out.println("Location of mines is below.");
                    cheatBoard();
                    check = false;
                }
            }
        }
    }

}
