package javauygulamaları;

import java.util.Scanner;

public class polindrome3 {

    public static void adSoyad(int n){
        for (int i=1 ; i<=n;i++)
        System.out.println("Fatih Kartal");

    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();

        adSoyad(n);
    }
}
