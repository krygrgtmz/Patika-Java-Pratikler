package com.MinefieldGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Minefield!");
        System.out.print("Enter the size as row number: ");
        int row = input.nextInt();
        System.out.print("Enter the size as column number: ");
        int col = input.nextInt();
        int numberOfMines = ((col*row) / 4);
        System.out.println(numberOfMines + " mines laid. Please begin... ");
        System.out.println();

        MineSweeper game1 = new MineSweeper(row, col);
        game1.start();

    }
}
