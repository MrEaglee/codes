package javauygulamaları;

import java.util.Scanner;

public class polindrome14 {

    public static String lowOrHigh(String a, String b) {


        String enB = a;

        if (a.length() > b.length()) {

            enB = a;

        } else if (a.length() == b.length()) {

            enB = a + b;

        } else {
            enB = b;
        }

        return enB;
    }

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        String a = k.nextLine();
        String b = k.nextLine();
        System.out.println(lowOrHigh(a , b));
    }

}
