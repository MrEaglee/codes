package javauygulamaları;

public class metotlar2 {
    public static int toplam(int a, int b) {
        return ((int)Math.pow(a,b));

    }
    public static void main(String[] args) {
        System.out.println("Üs Değeri : " + toplam(5,6));
        System.out.println("Üs Toplamı :" + toplam1(5,6));

    }

    public static int toplam1(int f, int g){
        int c = 1;
        for (;g!=0;g--){
            c = c*f;
        }
        return c;
    }

}

