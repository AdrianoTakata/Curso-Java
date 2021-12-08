package com.letscode.example.exercicios02;

import java.util.Locale;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a cotação do dolar: ");
        float cotacaoDolar = Float.parseFloat(sc.nextLine());
        System.out.print("Informe a quantidade em reais: ");
        float quantReais = Float.parseFloat(sc.nextLine());

        System.out.printf(Locale.FRANCE,"A contação do dolar é %.2f %s%n", cotacaoDolar, SimboloMoeda.BRL);
        System.out.printf(Locale.FRANCE,"A quantidade informada em reais é %.2f %s%n", quantReais, SimboloMoeda.BRL);
        System.out.printf(Locale.US,"A quantidade em dolar é %.2f %s%n", quantReais/cotacaoDolar, SimboloMoeda.USD);
    }
}

enum SimboloMoeda {
    USD,
    BRL
}
