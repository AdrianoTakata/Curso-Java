package com.letscode.example.aula6;

public class BancoMain {
    public static void main(String[] args) {

        Conta conta1 = new Conta("Adriano", 123);
        conta1.setSaldo(100.00);

        System.out.println(conta1);

        Conta conta2 = new Conta("Rafael", 124);
        conta2.setSaldo(-40);
    }
}
