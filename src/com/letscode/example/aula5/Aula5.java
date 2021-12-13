package com.letscode.example.aula5;

import java.util.Arrays;

public class Aula5 {
    public static void main(String[] args) {
        // Arrays, the first index is zero
//        int[] listInteiros = new int[10];
////        int[] list;
//        listInteiros[0] = 10;
//        listInteiros[1] = 8;
//        listInteiros[2] = 7;
//
////        int[] outraLista = {10,3,3,6};
//        System.out.println(Arrays.toString(listInteiros)); // imprime o array inteiro
//        for (int i = 0; i < listInteiros.length; i++){
//            System.out.printf("O número da lista na posição %d é %d%n",i ,listInteiros[i]);
//        }

        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i',
                'n','a', 'e', 'd'};
        char[] copyTo = Arrays.copyOfRange(copyFrom,2, 9);
        System.out.println(new String(copyTo));
    }
}
