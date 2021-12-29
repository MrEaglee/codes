package javauygulamaları;

import java.util.Scanner;

public class polindrome10 {

    public static char ters(String a) {

        for (int i = a.length() - 1; i >= 0; i--) {

            System.out.print(a.charAt(i));
        }

        return 1;

    }

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        String a = k.nextLine();
        System.out.print(ters(a));

    }

}
