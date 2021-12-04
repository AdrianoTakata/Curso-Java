package com.letscode.example.aula3;

public class Aula3 {

    public static void main(String[] args) {

        boolean par = 4 % 2 == 0;
        String name = "Adriano";
        int[] list = {1,2,3};
        int age = 30;
        float height = 1.70f;

        System.out.printf("O número 4 é par: %b %n", par);
        System.out.printf("Meu nome é %s \n", name);
        System.out.printf("Tenho %d anos\n", age);
        System.out.printf("A minha altura é %.2f \n", height);
        System.out.printf("%10s %n", "bueldung");
        System.out.printf("%2.2s", "Hi there!");
    }
}
