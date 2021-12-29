package javauygulamaları;

public class palindrome9 {

    public static int highNum(int a, int b) {
        int HighNumber = a;

        if (a < b) {
            HighNumber = b;
        } else {
            HighNumber = a;
        }
        return HighNumber;
    }

    public static void main(String[] ananyani) {

        System.out.println(highNum(8, 5));
    }
}
