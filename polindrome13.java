package javauygulamaları;

import java.util.Scanner;

public class polindrome13 {

    public static int howMany(String b) {

        String c = "aa";
        int counter = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == 'a' && b.charAt(i + 1) == 'a' && b.charAt(i + 2) == 'a') {
                break;
            }
            if (b.charAt(i) == 'a' && b.charAt(i + 1) == 'a') {
                counter++;

            }
        }


        return counter;

    }

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        String b = k.nextLine();
        k.close();
        System.out.println(howMany(b) + " Tane aa vardır.");


    }
}
