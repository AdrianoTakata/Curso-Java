package com.letscode.example.exercicios02;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double num1 = Double.parseDouble(sc.nextLine());
        System.out.print("Informe o segundo número: ");
        Double num2 = Double.parseDouble(sc.nextLine());

        System.out.printf("Soma: %f + %f = %f%n", num1, num2, num1 + num2);
        System.out.printf("Subtração: %f - %f = %f%n", num1, num2, num1 - num2);
        System.out.printf("Multiplicação: %f x %f = %f%n", num1, num2, num1 * num2);
        if (num2.intValue() != 0 ) {
            System.out.printf("Divisão: %f / %f = %f%n", num1, num2, num1 / num2);
        } else {
            System.out.printf("Não é possível fazer a divisão");
        }
    }
}
