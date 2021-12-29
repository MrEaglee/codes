package javauygulamaları;

import java.util.Scanner;

public class polindrome4 {
    public static int basSayısı(int n) {
        int sayac = 0;

        while (n > 0) {

            n /= 10; // sayi = sayi / 10;
            sayac++;

        }
        return sayac;


    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        System.out.println("Basamak Sayısı : " + basSayısı(n));
    }
}
