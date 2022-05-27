package com.Vki;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, vki;
        int kilo;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        kilo = input.nextInt();

        vki = kilo / (boy*boy);

        System.out.println("Vücut Kitle İndeksiniz: " + vki);
    }
}
