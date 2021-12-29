package javauygulamaları;

import java.util.Scanner;

public class polindrome20 {

    public static boolean dizi(int[] A) {
        boolean bol = true;

        for (int i = 0; i < A.length-1; i++) {
            if (A[i] > A[i + 1]) {

                bol = false;
            }


        }

        return bol;
    }


    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        int[] A = new int[5];
        System.out.println("5 Eleman Giriniz : ");

        for (int i = 0; i < A.length; i++) {
            A[i] = k.nextInt();
        }
        System.out.println(dizi(A));
    }

}
