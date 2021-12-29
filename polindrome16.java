package javauygulamaları;

import java.util.Scanner;

public class polindrome16 {

    public static boolean isThere(String a) {

        boolean b = false;
        char character = 'a';
        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) == character) {
                b = true;
                if (b == true) {
                    break;
                }
            } else {
                b = false;
            }
        }
        return b;
    }


    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        String a = k.nextLine();
        System.out.println(isThere(a));


    }
}
