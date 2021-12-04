package com.letscode.example.aula3;

import java.util.Locale;
import java.util.Scanner;

public class ConversorMoeda {

    public static void main(String[] args) {

        final float DOLAR = 5.65f;
        final float EURO = 6.39f;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor em reais: ");
        float real = sc.nextFloat();

        System.out.printf("Você possui %.2f %s %n", real, "BRL");
        System.out.printf(Locale.US, "Você possui %.2f %s %n", (real / DOLAR), SimboloMoeda.USD);
        System.out.printf(Locale.GERMANY, "Você possui %.2f %s", (real / EURO), SimboloMoeda.EUR);


    }
}

enum SimboloMoeda {
    USD,
    EUR
}