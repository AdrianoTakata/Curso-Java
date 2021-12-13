package com.letscode.example.aula5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] dataString = new String[5];

        for (int i = 0; i < dataString.length; i++){
            System.out.printf("Informe do aluno %d : ", i+1);
            dataString[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(dataString));

    }

}
