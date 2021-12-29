package javauygulamaları;

import java.util.Scanner;

public class polindrome17 {

    public static boolean polindrome(String a) {

        boolean bol = false;
        char b;
        char c;
        for (int i = 0; i < a.length(); i++) {

            for (int j = a.length() - 1; j >= 0; j--) {

                if (a.charAt(i) == a.charAt(j)) {
                    bol = true;
                } else {
                    bol = false;
                }

            }
        }
        return bol;
    }


    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        String a = k.nextLine();
        System.out.println(polindrome(a));

    }
}
