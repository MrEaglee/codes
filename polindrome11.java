package javauygulamaları;

import java.util.Scanner;

public class polindrome11 {
    public static String sensetive(String str) {

        String nw = "";
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ) {
                char c = str.charAt(i);
                String word = String.valueOf(c);
                nw += word.toUpperCase();
            } else{

                char c = str.charAt(i);
                String word = String.valueOf(c);
                nw += word.toLowerCase();
            }
        }
        return nw;
    }

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        String str = k.nextLine();
        k.close();
        System.out.println(sensetive(str));
    }
}


