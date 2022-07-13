package com.PrimeNumbers;

// Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

public class Main {
    public static void main(String[] args) {

        String primeNumbers = "";
        for (int i = 1; i <= 100; i++) {
            int counter = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    counter ++;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println(primeNumbers);
    }
}
