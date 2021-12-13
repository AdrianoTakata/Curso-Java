package com.letscode.example.aula6;

public class Encapsulamento {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Adriano");
//        pessoa.setNome("Adriano");
//        pessoa.nome = "Adriano";

//        System.out.println(pessoa.nome);
        System.out.println(pessoa.getNome());
    }
}
