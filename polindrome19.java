package javauygulamaları;

public class polindrome19 {
    public static int dizi(int[] A) {


        //bubble short sıralama algoritması
        int tmp;
        for (int i = 0; i < A.length; i++) {

            for (int j = A.length - 1; j > i; j--) {
                if (A[j - 1] > A[j]) {

                    tmp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = tmp;
                }
            }

        }
        int b = A[0];

        return b;
    }

    public static void main(String[] args) {

        int[] A = {7, 5, 6, 2, 8, 565, 568, 21, 795, 1};
        System.out.println(dizi(A));

    }
}
