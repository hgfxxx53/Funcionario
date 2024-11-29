package com.alfinhe;

public class Funcionario {
      private String nome;
    private double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;

}
    public double getSalarioMensal() {
        return salarioMensal;
    }
}
