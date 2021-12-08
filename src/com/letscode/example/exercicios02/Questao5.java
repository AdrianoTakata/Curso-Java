package com.letscode.example.exercicios02;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        final float POLEGADA = 2.54f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a medida em polegadas: ");
        float medidaPol = Float.parseFloat(sc.nextLine());
        float medidaCm;
        medidaCm = medidaPol * POLEGADA;

        System.out.printf("%.2fin é %.2fcm", medidaPol, medidaCm);
    }
}
