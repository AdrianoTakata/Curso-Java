package com.letscode.example.aula2;

import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args) {
        Scanner attribulte = new Scanner(System.in);

        System.out.print("Digite o valor do comprimento = ");
        float weidth = attribulte.nextFloat();
        System.out.println("Digite o valor da altura = ");
        float height = attribulte.nextFloat();

        float areaQuadrado = weidth * height;
        float areaTriangulo = (weidth * height) / 2;

        System.out.println("A área do quadrado de weidth " + weidth + " e altura " + height + " = " + areaQuadrado );
        System.out.println("A área do quadrado de weidth " + weidth + " e altura " + height + " = " + areaTriangulo );

    }
}
