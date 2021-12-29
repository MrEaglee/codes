package javauygulamaları;

public class polindrome24 {

    public static int[] dizi(int[] A) {

        int tmp;
        int[] degerler = new int[2];

        for (int i = 0; i < A.length; i++) {
            for (int j = A.length - 1; j > i; j--) {

                if (A[j - 1] > A[j]) {
                    tmp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = tmp;

                }
            }
            degerler[0] = A[0];
            degerler[1] = A[A.length - 1];
        }
        return degerler;
    }


    public static void main(String[] args) {

        int[] A = {984, 15, 8, 32, 987, 51, 398};

        int[] list = dizi(A);
        System.out.println("En küçük değer : " + list[0]);
        System.out.println("En Büyük Değer : " + list[1]);
    }
}

