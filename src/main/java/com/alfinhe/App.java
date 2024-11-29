package com.alfinhe;

public class App {
   public static void main( String[] args ) {
        Empresa empresa = new Empresa ( );

        Funcionario funcionario1 = new Funcionario ( "João", 2000.0 );
        Funcionario funcionario2 = new Funcionario ( "Maria", 2500.0 );
        Funcionario funcionario3 = new Funcionario ( "Pedro", 1800.0 );
        empresa.adicionarFuncionario (funcionario1);
        empresa.adicionarFuncionario (funcionario2);
        empresa.adicionarFuncionario (funcionario3);

        double valorMensal = empresa.calcularValorMensal ( );
        System.out.println("Valor mensal total dos funcionários: " + valorMensal);
    }
}

