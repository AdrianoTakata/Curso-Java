package com.letscode.example.aula5;

import java.util.Arrays;

public class Matriz {
    public static void main(String[] args) {

//        int[][] matrizInteiros = {{1,2,3},{1,2,3},{1,2,3}};
        double[][] matrizInteiros = new double[3][4];
        matrizInteiros[0][0] = 8;
        matrizInteiros[0][1] = 9;
        matrizInteiros[0][2] = 10;
        matrizInteiros[0][3] = 8;

        System.out.println(matrizInteiros.length);

        for (int i = 0; i < matrizInteiros.length; i++){
            for (int j= 0; j < matrizInteiros[i].length; j++){
                System.out.printf("matrizInteiros[%d][%d] = %.2f%n", i, j, matrizInteiros[i][j]);
            }
        }

    }
}
