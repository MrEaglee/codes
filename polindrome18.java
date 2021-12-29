package javauygulamaları;

public class polindrome18 {

    public static int dizi(int[] A) {

        int toplam = 0;

        for (int i = 0; i < A.length; i++) {

            toplam += A[i];

        }
        return toplam;
    }


    public static void main(String[] args) {

        int[] A = {1, 6, 8489, 874, 8541, 15, 8, 15, 84, 6};

        System.out.print("Toplam : " + dizi(A));

    }
}
