package javauygulamaları;

import java.util.Scanner;

public class palindrome5 {

    public static int fib(int n) {

        int a = 0;
        int b = 1;
        int c = 0;

        int sayac = 1;
        if (n == 1) {
            System.out.println(1);
            System.exit(1);
        }

        do {

            c = a + b;
            if (c > 1000) {
                break;
            }
            sayac++;
            if (sayac == n)
                break;
            a = b;
            b = c;

        } while (c < 1000);
        return c;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        System.out.println(fib(n));

    }


}
