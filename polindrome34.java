package javauygulamaları;

public class polindrome34 {

    public static double dizi(int[] A) {

        int toplam = 0;
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {

            } else {
                toplam += A[i];
                counter++;
            }
        }
        return (double) (toplam) / (counter);
    }

    public static void main(String[] args) {
        int[] A = {65, 45, 98, 71, 62, 34, 23, 81, 31, 50};

        System.out.println("Tek sayıları Ort'si : " + dizi(A));

    }
}
