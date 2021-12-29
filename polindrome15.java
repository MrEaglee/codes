package javauygulamaları;

import java.util.Scanner;

public class polindrome15 {

    public static int howManyWord(String a) {

        char b =' ';
        int counter = 0;

        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) == b) {

                counter = counter + 2;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String a = k.nextLine();
        System.out.println(howManyWord(a));

    }
}
