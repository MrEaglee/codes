package javauygulamaları;

import java.util.Scanner;

public class polindrome12 {

    public static String lowToHig(String a) {

        char c;
        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) == Character.toLowerCase(a.charAt(i))) {
                a = a.toUpperCase();
            }

        }
        return a;
    }

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        String a = k.nextLine();
        k.close();
        System.out.println(lowToHig(a));

    }

}
