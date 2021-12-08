package com.letscode.example.exercicios;

public class conversaoKgToLb {
    public static void main(String[] args) {
        final double fatorDeConversao = 2.0462;
        double pesoKg = 100.0;
        double pesoLb;
        pesoLb = pesoKg * fatorDeConversao;
        System.out.printf("%.0fkg são %.2flb", pesoKg, pesoLb);
    }
}
