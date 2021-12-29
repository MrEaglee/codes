package javauygulamaları;

import java.util.Arrays;

public class polindrome21 {

     public static int[] dizi(int[]A){

         int[] gecici = new int[A.length];
         for (int i = 0 ; i<A.length;i++){

             gecici[i]=A[i]+1;
         }
         return gecici;
     }

    public static void main(String[] args) {

        int[] A = {0,1,2,3,4,5,6,7,8,9,10};

        int[] liste = dizi(A);
            System.out.print(Arrays.toString(liste) + " " );
     }

    }



