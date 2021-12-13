package com.letscode.example.aula6;

public class Main {
}

class Cliente {
    String nome;
    int idade;

    // Compra
    // Troca
}

/*
class Funcionario {
    String nome;
    int idade;

    // Vende
    // Troca
}
*/
interface Funcionario {
    boolean troca();
}

class Gerente implements Funcionario{
    String nome;
    int idade;

    @Override
    public boolean troca() {
        return false;
    }
    // Vende
    // Troca
}

class Vendedor implements Funcionario {

    @Override
    public boolean troca() {
        return false;
    }
}

