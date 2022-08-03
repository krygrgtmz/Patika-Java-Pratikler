package com.FrequencyOfElementsInArray;

// Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size of the array : ");
        int size = input.nextInt();
        int[] list = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + " : ");
            list[i] = input.nextInt();
        }
        System.out.println("Your array is " + Arrays.toString(list));
        System.out.println("==============================================================");
        Arrays.sort(list);

        for (int j = 0; j < size; j++) {
            if ((j != 0) && (list[j] == list[j - 1])) {
                continue;
            }
            count = 0;
            for (int k = 0; k < size; k++) {
                if ((j != k) && (list[j] == list[k])) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.println("The element " + list[j] + " is repeated " + (count+1) + " times in this array.");
            } else {
                System.out.println("The element " + list[j] + " is not repeated in this array.");
            }
        }
    }
}
