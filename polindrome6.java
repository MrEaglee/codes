package javauygulamaları;

import java.util.Scanner;

public class polindrome6 {

    public static int fak(int n){

        int sonuc=1;
        for (int i = 1; i<=n;i++) {
            sonuc = sonuc * i;
        }
        return sonuc;
    }
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        System.out.println(fak(n));
    }

}
