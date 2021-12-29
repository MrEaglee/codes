package javauygulamaları;

import java.util.Scanner;

public class palindrome8 {
    public static int kücükSayı(String n) {

        String karakter = n.toLowerCase();
        int sayac = 0;

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) >= 97 && n.charAt(i) <= 122) {
                sayac++;
            }

        }
        return sayac;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String n = k.nextLine();
        k.close();
        System.out.println( "Küçük Karater Sayısı : " + kücükSayı(n));
    }
}
