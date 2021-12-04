package com.letscode.example.aula2;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {

        Scanner nota = new Scanner(System.in);
        System.out.print("Digite a primeira nota = ");
        float nota1 = nota.nextFloat();
        System.out.print("Digite a segunda nota = ");
        float nota2 = nota.nextFloat();
        System.out.print("Digite a terceira nota = ");
        float nota3 = nota.nextFloat();
        float media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média é %.2f", media);
    }
}
