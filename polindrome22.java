package javauygulamaları;

public class polindrome22 {

    public static int dizi(String[] A){


        int enUzun = A[0].length();
        int indis=0;
        for (int i = 0; i < A.length; i++) {

            if (enUzun< A[i].length()) {

                enUzun= A[i].length();
                indis = i+1;
            }
        }
return indis;
    }

    public static void main(String[] args) {

        String[] A = {"Ali" , "Emre" , "Berat" , "Mehmet" , "Fatih", "Emirhan"};

        System.out.println("En uzun : " + dizi(A));
    }

}
