package javauygulamaları;

import java.util.Scanner;

//kendisine parametre olarak gelen iki boyutlu string dizisindeki en uzun stringi geri döndüren
public class polindrome29 {
    public static String dizi(String[][] A) {

        int enB = 0;
        String enBb = null;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                if (A[i][j].length() > enB) {
                    enB = A[i][j].length();
                    enBb = A[i][j];
                }
            }
        }
        return enBb;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String[][] A = new String[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = k.next();
            }
        }
        System.out.println("En Uzun String : " + dizi(A));
    }
}
