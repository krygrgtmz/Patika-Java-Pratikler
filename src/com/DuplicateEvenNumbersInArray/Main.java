package com.DuplicateEvenNumbersInArray;

// Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazınız.

import java.util.Arrays;

public class Main {
    static boolean isIn(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {0, 0, 1, 1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8};
        int[] duplicateNumbers = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i]%2 == 0)) {
                    if (!isIn(duplicateNumbers, list[i])) {
                        duplicateNumbers[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int k : duplicateNumbers) {
            if (k != 0) {
                System.out.println(k);
            }
        }
    }
}
