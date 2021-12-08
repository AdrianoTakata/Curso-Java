package com.letscode.example.aula4;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float notas = 0f;
        float media = 0f;
        float total = 0f;
        int count = 0;

        System.out.println("Digite a quantidade de notas: ");
        int quantidadeDeNotas = Integer.parseInt(sc.nextLine());

        while (count < quantidadeDeNotas) {
            count++;
            System.out.printf("Digite a nota %d: ", count);
            notas = Float.parseFloat(sc.nextLine());
            total += notas;
        }
        media = total / quantidadeDeNotas;
        System.out.println("O total é: " + total);
        System.out.printf("A média é: %.2f", media);
    }
}
