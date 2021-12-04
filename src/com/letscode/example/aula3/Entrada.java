package com.letscode.example.aula3;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String name = sc.nextLine();
        System.out.print("Digite a sua idade: ");
        int age = sc.nextInt();
        System.out.print("Deseja continuar N/Y: ");
        String continuar = sc.next();
        String res = continuar == "Y" ? "Sim" : "Não";


        System.out.printf("O nome informado foi %s %n", name);
        System.out.printf("A idade do %s é %d anos %n", name, age);
        System.out.printf("Deseja continuar: %s", res);




        /*
        int num = Integer.parseInt(args[0]);
        System.out.printf("Hello, %d %s %n", num, args[1]);
         */

    }

}
