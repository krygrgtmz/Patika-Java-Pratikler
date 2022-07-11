package com.ATM_Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapıyoruz.

        Scanner input = new Scanner(System.in);
        String userName, password;
        int balance=1000, right=3, selection;

        while (right > 0) {
            System.out.println("Bankamıza hoşgeldiniz.");
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = input.nextLine();

            if(userName.equals("koray") && password.equals("12345")) {
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    System.out.println( "1) Hesaba Para Yatırma\n" +
                                        "2) Hesaptan Para Çekme\n" +
                                        "3) Bakiye Sorgulama\n" +
                                        "4) Çıkış Yapma");

                    selection = input.nextInt();
                    switch (selection) {
                        case 1:
                            System.out.print("Hesabınıza yatırmak istediğiniz tutarı giriniz: ");
                            int moneyIn = input.nextInt();
                            balance += moneyIn;
                            System.out.println("Yeni bakiyeniz: " + balance + " TL");
                            break;
                        case 2:
                            System.out.print("Hesabınızdan çekmek istediğiniz tutarı giriniz: ");
                            int moneyOut = input.nextInt();
                            if (moneyOut > balance) {
                                System.out.println("Yetersiz bakiye. Lütfen tekrar deneyiniz.");
                                break;
                            } else {
                                balance -= moneyOut;
                                System.out.println("Yeni bakiyeniz: " + balance + " TL");
                            } break;
                        case 3:
                            System.out.println("Mevcut Bakiyeniz: " + balance + " TL");
                            break;
                        case 4:
                            System.out.println("Çıkış yapıyorsunuz. Bankamızı tercih ettiğiniz için teşekkür eder iyi günler dileriz.");
                            break;
                        default:
                            System.out.println("Lütfen geçerli bir seçim yapınız.");
                            break;
                }
            } while (selection != 4);
                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girişi yaptınız. Lütfen tekrar deneyiniz.");
                System.out.println("Kalan hakkınız: " + right);
                if (right == 0)
                    System.out.print("Hesabınız bloke edilmiştir. Lütfen en kısa zamanda bankanızla iletişime geçiniz.");
                }
            }
        }
}
