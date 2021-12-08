package com.letscode.example.exercicios02;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a temperatura em Celsius: ");
        float temCelsius = Float.parseFloat(sc.nextLine());
        float temFarenheit;
        temFarenheit = (temCelsius * (9.0f/5.0f)) + 32.0f;

        System.out.printf("A temperatura em Farenheit é %.2f", temFarenheit);
    }
}
