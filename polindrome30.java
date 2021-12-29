package javauygulamaları;

import java.util.Scanner;

public class polindrome30 {

    public static int dizi(int[][] A, int[][] B) {

        int toplam = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                toplam += A[i][j] + B[i][j];


            }
        }
        return toplam;
    }

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = k.nextInt();
                B[i][j] = k.nextInt();

            }

        }

        System.out.println(dizi(A, B));
    }
}
