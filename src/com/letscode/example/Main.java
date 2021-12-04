package com.letscode.example;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Variáveis
        int num = 2;
        String name = "Adriano";
        boolean verificacao= true;
        float nota = 7.0f;
        double piDouble = 3.141592653589793;
        float piFloat = 3.141592653589793f;
        DiasDaSemana aula = DiasDaSemana.segunda;
        String mes = MesesDoAno.JANEIRO.name();

        System.out.println("Número = " + num);
        System.out.println("Name = " + name);
        System.out.println("Checked = " + verificacao);
        System.out.println("Nota = " + nota);
        System.out.println(Math.PI);
        System.out.println(piFloat);
        System.out.println(DiasDaSemana.quinta);
        System.out.println(aula);
        System.out.println(mes);

        // Operadores
        int contador = 0;
        contador += 1;  // contador = contador + 1;
        System.out.println(++contador);

    }

}

enum  DiasDaSemana {
    segunda, terca, quarta, quinta, sexta, sabado, domingo;
}
