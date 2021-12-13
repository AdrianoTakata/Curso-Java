package com.letscode.example.velha;

import java.util.Arrays;
import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        // Tabuleiro
        char[][] boardGame = {
                {'1', '|', '2', '|', '3'},
                {'4', '|', '5', '|', '6'},
                {'7', '|', '8', '|', '9'},
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Gostaria de jogar o jogo da velha [y/n]? ");
        String res = sc.nextLine();
        boolean winner = false;
        int count = 0;
        int player = 1;
        int positions[] = new int[9];
        boolean validatedMove = true;


        if ( res.toLowerCase().equals("y") ){
            printBoardGame(boardGame);
            while ( !winner && count < 10 ) {
                System.out.printf("É a vez do jogador %d%n", player);
                do {
                    System.out.printf("Jogador %d informe uma posição de [1-9]: %n", player);
                    positions[count] = Integer.parseInt(sc.nextLine());
                    validatedMove = checkPosition(positions, count);
                } while (!validatedMove);
                // atualizar o tabuleiro a jogada
                updateBoardGame(boardGame, player, positions[count]);
                // verificar se é o vencedor
                winner = checkWinner(boardGame);
                if (winner) {
                    System.out.printf("O jagador %d é o vencedor!%n", player);
                    break;
                }
                player = player == 1 ? 2 : 1;
                count++;
            }
            System.out.println("Não houve vencedor!!");
        } else {
            System.out.print("Que pena. Até a próxima!");
        }
    }

    public static boolean checkPosition(int[] positions, int count){

        boolean validatedCheck = true;
        if ( positions[count] > 0 && positions[count] < 10 ){
            for (int i = 0; i < count; i++) {
                if (positions[i] == positions[count]){
                    validatedCheck = false;
                }
            }
            System.out.printf("A posição é possível: %b%n", validatedCheck);
        } else {
            validatedCheck = false;
            System.out.println("A position é inválida!");
        }

        return validatedCheck;
    }

    public static void updateBoardGame(char[][] boardGame, int player, int position) {
        char character;
        character = player == 1 ? 'X' : 'O';

        switch (position) {
            case 1:
                boardGame[0][0] = character;
                break;
            case 2:
                boardGame[0][2] = character;
                break;
            case 3:
                boardGame[0][4] = character;
                break;
            case 4:
                boardGame[1][0] = character;
                break;
            case 5:
                boardGame[1][2] = character;
                break;
            case 6:
                boardGame[1][4] = character;
                break;
            case 7:
                boardGame[2][0] = character;
                break;
            case 8:
                boardGame[2][2] = character;
                break;
            case 9:
                boardGame[2][4] = character;
                break;
            default:
                break;
            }
        printBoardGame(boardGame);
    }

    public static void printBoardGame(char[][] boardGame) {

        for (char[] row : boardGame) {
            for (char collumn : row) {
                System.out.print(collumn);
            }
            System.out.println();
        }
    }

    public static boolean checkWinner(char[][] boardGame) {

        boolean winner = false;
        // verificar linhas
        for (int i = 0; i < boardGame.length; i++){
            if ( boardGame[i][0] == boardGame[i][2] && boardGame[i][2] == boardGame[i][4]){
                winner = true;
            }
        }
        // verificar colunas
        for (int j = 0; j < 3; j+=2){
            if ( boardGame[0][j] == boardGame[1][j] && boardGame[1][j] == boardGame[2][j]){
                winner = true;
            }
        }
        // Verificar diagonal principal e secundária
        if ( ( boardGame[0][0] == boardGame[1][2] && boardGame[1][2] == boardGame[2][4] ) ||
                ( boardGame[2][0] == boardGame[1][2] && boardGame[1][2] == boardGame[0][4] )) {
            winner = true;
        }

        return winner;
    }


}
