package javauygulamaları;

public class polindrome26 {

    public static int dizi(int[][] A) {

        int enB = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {

                if (A[i][j] > enB) {

                    enB = A[i][j];

                }

            }
        }


        return enB;
    }

    public static void main(String[] args) {

        int[][] A = {{648, 489, 21, 84, 98}, {25, 54, 87, 46, 654}};

        System.out.println(dizi(A));
    }

}
