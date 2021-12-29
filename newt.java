package javauygulamaları;

import java.util.Scanner;


//There is a big problem...
//3 ün cevabı 8.6
public class newt {

    public static double hesapla(double m) {
        double toplam = 0;
        for (int n = 1; n <m; n++) {

            toplam += (5 * n * n) - (3 * n);

        }
        return toplam / fak(m);
    }

    public static void veriYaz(double m) {

        System.out.println("Sonucu yaz : " + hesapla(m));
    }

    public static double fak(double m) {

        double fak = 1;

        for (int i = 1; i <=m; i++) {

            fak = i * fak;
        }
        return fak;
    }

    public static void main(String[] args) {


        Scanner k = new Scanner(System.in);
        System.out.print("M değerini Giriniz :");
        double m = k.nextDouble();
        veriYaz(m);
    }
}
