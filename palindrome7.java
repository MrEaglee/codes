package javauygulamaları;

import java.util.Scanner;

public class palindrome7 {

    public static int toplam(int n) {
        int sonuc = 0;

        for (int i = 1; i <= n; i++) {

            sonuc += i;


        }
        return sonuc;
    }


    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        System.out.println(toplam(n));

    }
}
