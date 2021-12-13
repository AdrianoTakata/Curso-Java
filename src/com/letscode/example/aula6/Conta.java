package com.letscode.example.aula6;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta {

    // Atributos
    private String nomeCliente;
    private long numero;
    private double saldo;

    //Construtor
    public Conta(String nomeCliente, long numero) {
        this.nomeCliente = nomeCliente;
        this.numero = numero;
    }

    // Getter and Setter
    public String getNomeCliente() {
        return nomeCliente;
    }

    public long getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido!");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && isSaldoSuficiente(valor)) {
            this.saldo -= valor;
            return false;
        } else {
            System.out.println("Saldo insuficiente!");
            return true;
        }
    }

    private boolean isSaldoSuficiente(double valor) {
        if (this.saldo >= valor) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
