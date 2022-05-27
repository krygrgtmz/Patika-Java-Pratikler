package com.Manav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut, armutToplam, elma, elmaToplam, domat, domatToplam, muz, muzToplam, patlı, patlıToplam;
        float toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo armut aldığınızı giriniz: ");
        armut = input.nextDouble();
        System.out.print("Kaç kilo elma aldığınızı giriniz: ");
        elma = input.nextDouble();
        System.out.print("Kaç kilo domates aldığınızı giriniz: ");
        domat = input.nextDouble();
        System.out.print("Kaç kilo muz aldığınızı giriniz: ");
        muz = input.nextDouble();
        System.out.print("Kaç kilo patlıcan aldığınızı giriniz: ");
        patlı = input.nextDouble();

        armutToplam = armut*2.14;
        elmaToplam = elma*3.67;
        domatToplam = domat*1.11;
        muzToplam = muz*0.95;
        patlıToplam = patlı*5;

        toplamTutar = (float) ((armutToplam+elmaToplam+domatToplam+muzToplam+patlıToplam));
        System.out.println("Toplam tutar: " + toplamTutar + " TL");
    }
}
