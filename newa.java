package javauygulamaları;

import java.util.Random;
import java.util.Scanner;

public class newa {

    public static int[] Dizi(int a) {
        int countera=0;
        int counterb=0;

        int[] değerler = new int[2];
        Random rdn = new Random();
        int[] dizi = new int[a];

        for (int i = 0; i < a; i++) {

            dizi[i] = rdn.nextInt(1, 100);

            if (dizi[i]%2==0){

                countera++;

            }else{
                counterb++;
            }

            değerler[0]=countera;
            değerler[1]=counterb;

        }
        return değerler;
    }


    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.print("Dizi uzunluğunu Giriniz : ");
        int a = k.nextInt();
        k.close();
        System.out.println("Dizi" + Dizi(a));

    }


}
