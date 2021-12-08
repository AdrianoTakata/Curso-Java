package com.letscode.example.exercicios02;

public class Questao2 {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++){
            System.out.println("Tabuada do " + i);
            for (int j = 1; j < 11; j++){
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
        }
    }
}
