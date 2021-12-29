package javauygulamaları;

import java.util.Scanner;

public class polindrome33 {

    public static boolean asal(int A) {
        boolean b = false;
        int counter = 0;
        for (int i = 2; i < A; i++) {
            if (A % i == 0) {
                counter++;
            }
        }
        if (counter == 0) {
            b = true;
            counter = 0;
        }
        return b;
    }


    public static void main(String[] args) {


        Scanner k = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int A = k.nextInt();
        k.close();
        System.out.println(asal(A));
    }
}
