package com.letscode.example.aula5;

import java.util.Scanner;

public class JovoDaVelha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Gostaria de jogar o jogo da velha [y/n]? ");
        String onPlay = sc.nextLine();
        System.out.println(onPlay.toUpperCase());
        boolean win = true;
        int players = 0;
        int position = 0;

        char[][] tabuleiro = {
                {'_', '|', '_', '|', '_'},
                {'_', '|', '_', '|', '_'},
                {'_', '|', '_', '|', '_'},
        };

        if ( onPlay.toUpperCase().equals("Y") ){
            players = player(players);
            System.out.println("Informe a posição no tabuleiro: ");
            position = Integer.parseInt(sc.nextLine());

        } else {
            System.out.print("Que pena. Até a próxima!");
        }

    }


    public static int player(int players) {
        if (players == 0){
            System.out.printf("É a vez do jogador %d%n", players);
            return 1;
        } else {
            System.out.printf("É a vez do jogador %d%n", players);
            return 0;
        }
    }

    /*
    public static void printTabuleiro(char[] tabuleiro){

        for (char[] row: tabuleiro ) {
            for (char collumn: row) {
                System.out.print(collumn);
            }
            System.out.println();
        }
    }
    */
}
