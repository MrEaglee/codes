package javauygulamaları;
//bouble short sıralama
//diziyi yazdır
//main de dizi oluştur sırala metota yolla
//swap() metotu çağır
//geçiçi adında bir değişken kullan
//gecici=A[i] A[j]=A[j-1] A[j-1]=gecici

import java.util.Scanner;

public class newb {

    public static int[] sırala(int[]dizi) {

        int tmp;

        for (int i = 0; i < dizi.length; i++) {

            for (int j = dizi.length - 1; j > i; j--) {
                {
                    if (dizi[j - 1] > dizi[j]) {

                        swap(i,j,dizi);
                    }


                }
            }

        }

        return dizi;
    }
    public static void swap(int i , int j,int[]dizi){
        int tmp;
        tmp = dizi[j - 1];
        dizi[j - 1] = dizi[j];
        dizi[j] = tmp;

    }

    public static void main(String[] args) {


        int[] dizi = {1,5,7,8,6,3,2,4,10,9};

        System.out.println(sırala(dizi));

    }


}
