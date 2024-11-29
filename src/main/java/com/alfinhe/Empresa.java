package com.alfinhe;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List <Funcionario> funcionarios;
    public Empresa() {
        this.funcionarios = new ArrayList <> ();
    }
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    public double calcularValorMensal() {
        double valorTotal = 0;
        for (Funcionario funcionario : funcionarios) {
            valorTotal += funcionario.getSalarioMensal();
        }
        return valorTotal;
    }
}
