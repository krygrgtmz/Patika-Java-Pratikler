package com.PalindromicNumber;

// Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

public class Main {
    static boolean isPalindromic(int number) {
        int temp = number, reversedNumber = 0, lastDigit;
        while (temp != 0) {
            lastDigit = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            temp /= 10;
        }
        return number == reversedNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromic(9889));
    }
}
