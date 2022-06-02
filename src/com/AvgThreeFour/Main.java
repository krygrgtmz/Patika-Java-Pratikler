package com.AvgThreeFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, sum=0, count=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        k = input.nextInt();

        for (int i=0; i<=k; i++) {
            if (i%3==0 && i%4==0) {
                sum+=i;
                count++;
            }
        }
        int mean=sum/count;

        System.out.print("0'dan girdiğiniz sayıya kadar olan sayılardan 3'e ve 4'e bölünebilen sayıların ortalamsaı: " + mean);
    }
}
