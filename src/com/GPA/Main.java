package com.GPA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Değişkenleri oluşturma
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfını tanımlama
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri alma
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        double toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;

        System.out.println("Ortalamanız : " + sonuc);

        String basari = (sonuc >= 60) ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(basari);

    }
}
