package javauygulamaları;

public class polindrome27 {
    public static int[] dizi(int[][] A) {
        int[] degerler = new int[2];
        int enB = 0, a = 0, b = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {

                if (A[i][j] > enB) {

                    enB = A[i][j];
                    a = i;
                    b = j;
                }

            }
        }
        degerler[0] = a;
        degerler[1] = b;

        return degerler;
    }

    public static void main(String[] args) {

        int[][] A = {{648, 489, 21, 84, 98}, {25, 54, 87, 46, 654}};

        int[] list = dizi(A);

        System.out.println("Dizi indisi : " + list[0] + "," + list[1]);
    }
}
