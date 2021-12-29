package javauygulamaları;

import java.util.Scanner;

public class polindrome35 {

    public static int[] dizi(String[][] A) {

        int[] degerler = new int[2];
        int enB = 0, a = 0, b = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                if (A[i][j].length() > enB) {

                    enB = A[i][j].length();

                    a = i;
                    b = j;
                }
            }
        }
        degerler[0] = a;
        degerler[1] = b;
        return degerler;
    }

    public static String dizia(String[][] A) {


        int enB = 0;
        String B = null;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                if (A[i][j].length() > enB) {

                    enB = A[i][j].length();
                    B = A[i][j];
                }
            }
        }
        return B;
    }


    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        String[][] A = new String[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                A[i][j] = k.nextLine();
            }
        }

        int[] list = dizi(A);
        System.out.println("Satır :" + list[0] + " " + "Sütün : " + list[1]);

        System.out.println("En Uzun String : " + dizia(A));

    }
}
