package com.LoginPassword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        // username:patika, password:java123
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı!");
        } else if (!userName.equals("patika") && password.equals("java123")) {
            System.out.println("Kullanıcı adınızı yanlış girdiniz! Lütfen tekrar deneyiniz.");
        } else if (userName.equals("patika") && !password.equals("java123")) {
            System.out.println("Şifrenizi yanlış girdiniz.");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (1:Evet) (2:Hayır)");
            System.out.print("Seçiminiz: ");
            int resetPassword;
            resetPassword = input.nextInt();
            switch (resetPassword) {
                case 1:
                    System.out.print("Yeni şifreniz: " + input.nextLine());
                    String newPassword = input.nextLine();
                    if (newPassword.equals("java123")) {
                        System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz! Lütfen tekrar deneyiniz.");
                        break;
                    } else if (newPassword.equals(password)) {
                        System.out.println("Yeni şifreniz hatalı girilen şifreyle aynı olamaz! Lütfen tekrar deneyiniz.");
                        break;
                    } else {
                        System.out.println("Şifreniz başarıyla değiştirilmiştir.");
                        break;
                    }
                case 2:
                    System.out.println("Lütfen bilgilerinizi kontrol ederek tekrar deneyiniz.");
                    break;
                default:
                    System.out.println("Lütfen tekrar deneyiniz.");
            }
        } else {
            System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz!");
        }
    }
}
