package com.TransposeMatrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of rows and columns respectively: ");
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] array = new int[row][col];

        System.out.println("Please enter the values starting from first row: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = input.nextInt();
                System.out.print(" ");
            }
        }

        System.out.println("The matrix you entered is below.");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Transpose of the matrix you entered is below.");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println(" ");
        }

    }
}
