package javauygulamaları;

public class polindrome28 {
    public static int[] dizi(int[][] A) {

        //Her bir satırın toplamını geri döndüren method
        int[] degerler = new int[2];
        int toplam1 = 0;
        int toplam2 = 0;

        for (int j = 0; j < 5; j++) {

            toplam1 += A[0][j];

            toplam2 += A[1][j];

        }

        degerler[0] = toplam1;
        degerler[1] = toplam2;

        return degerler;
    }

    public static void main(String[] args) {

        int[][] A = {{648, 489, 21, 84, 98}, {25, 54, 87, 46, 654}};

        int[] list = dizi(A);
        System.out.println(" 1. Satırın Toplamı :  " + list[0]);
        System.out.println("2. Satırın Toplamı : " + list[1]);
    }
}
