package com.SortingElementsInArray;

/* Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
   Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız. */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size of the array : ");
        int size = input.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Element " + i + " : ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println("New array is " + Arrays.toString(list));
    }
}
