package javauygulamaları;

public class polindrome23 {

    public static int dizi(int[] A) {


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
        int secondNum = A[1];
        return secondNum;
    }

    public static void main(String[] args) {


        int[] A = {56, 7, 6, 48, 9, 651, 541, 2};

        System.out.println("En Büyük 2. Sayı : " + dizi(A));


    }
}
