package javauygulamaları;

import java.util.Arrays;

public class polindrome25 {

    public static double[] dizi(int[] vize, int[] fnl) {

        int vizeToplam = 0;
        int fnlToplam = 0;
        double[] ort = new double[vize.length];

        for (int i = 0; i < vize.length; i++) {

            ort[i] = vize[i] + fnl[i];
            ort[i] = ort[i] / 2;
        }

        return ort;
    }

    public static void main(String[] args) {

        int[] vize = {10, 60, 30, 40, 50, 20};
        int[] fnl = {50, 90, 40, 15, 35, 65};
        double[] list = dizi(vize, fnl);

        System.out.println(Arrays.toString(list));

    }
}
