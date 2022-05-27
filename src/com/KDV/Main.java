package com.KDV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fiyat, kdvlifiyat, kdvtutari, kdv;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ürünün fiyatını giriniz: ");
        fiyat = input.nextDouble();

        kdv = (fiyat < 1000) ? 0.18 : 0.08;
        kdvtutari = fiyat * kdv;
        kdvlifiyat = fiyat + kdvtutari;

        System.out.println("KDV'siz Fiyat: " + fiyat + " TL");
        System.out.println("KDV Oranı: " + kdv);
        System.out.println("KDV Tutarı: " + kdvtutari + " TL");
        System.out.println("KDV'li Fiyat: " + kdvlifiyat + " TL");
    }
}