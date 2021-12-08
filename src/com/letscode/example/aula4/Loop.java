package com.letscode.example.aula4;

public class Loop {

    public static void main(String[] args) {
        int count = 0;
        final float fatorDeConversao = 2.20462f;
        System.out.println(fatorDeConversao);
        /*while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }*/
        /*
        do {

            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
        */
//        for (int i = 1; i < 11; i++){
//            System.out.println("Count is: " + i);
//        }

        for (int i = 11; i > 0; i-- ){
            System.out.println("Count is: " + i);
        }
    }

}
