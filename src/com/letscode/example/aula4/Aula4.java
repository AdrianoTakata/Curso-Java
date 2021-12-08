package com.letscode.example.aula4;

import java.util.Scanner;

public class Aula4 {
    /*
        pessoas > 16 -> opcional
        pessoas > 70 -> opcional
        pessoas > 18  -> obrigatório
        pessoas < 70 -> obrigatório
        pessoas < 16 Não vota
     */

    public static void main(String[] args) {

        /* If
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int age = Integer.parseInt(sc.nextLine());

        if (age >= 16 && age < 18 || age > 70) {
            System.out.println("Voto opcional");
        } else if (age < 16 ){
            System.out.println("Não pode Votar");
        } else {
            System.out.println("Voto obrigatório ");
        }
        */
        /* Switch Case */
        /*
        int month = 5;
        String monthString;

        switch (month){
            case 1:
                monthString = "Janeiro";
                break;
            case 2:
                monthString = "Fevereiro";
                break;
            case 3:
                monthString = "Março";
                break;
            default:
                monthString = "Não é um mês";
        }
        System.out.println(monthString);
        */
        int mes;
        int dias = 31;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o mês [1-12]: ");
        mes =Integer.parseInt(sc.nextLine());

        if ( mes > 12 || mes < 1) {
            System.out.println("Mês inválido");
        }

        switch (mes) {
            case 2:
                dias = dias - 3;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias -= 1;
        }
        System.out.printf("O mês %d tem %d dias", mes, dias);
    }

}
