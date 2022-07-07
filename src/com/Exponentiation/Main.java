package com.Exponentiation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

        int n,k;
        int total=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        n = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        k = input.nextInt();

        for(int i=1; i<=k; i++) {
            total *= n;
        }

        System.out.println("Cevap: " +total);
    }
}
