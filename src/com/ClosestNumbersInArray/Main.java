package com.ClosestNumbersInArray;

/* Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve büyük en yakın sayıyı bulan programı yazınız.
   Dizi : {15,12,788,1,-1,-778,2,0}
   Girilen Sayı : 5
   Girilen sayıdan küçük en yakın sayı : 2
   Girilen sayıdan büyük en yakın sayı : 12
 * */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println("Array : " + Arrays.toString(list));
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int closestSmaller = list[0];
        int closestGreater = list[0];

        Arrays.sort(list);
        for (int i : list) {
            if (i < number) {
                closestSmaller = i;
            }
            if (i > number) {
                closestGreater = i;
                break;
            }
        }
        System.out.println("The smaller closest number to " + number + " is " + closestSmaller);
        System.out.println("The greater closest number to " + number + " is " + closestGreater);
    }
}
