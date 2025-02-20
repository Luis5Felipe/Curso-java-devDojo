package academy.DevDojo.javaoneforall.javacore.BintroductionMetodos.testes;

import academy.DevDojo.javaoneforall.javacore.BintroductionMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Chico";
        funcionario.salarios = new double [] {1200,1500,3500};
        funcionario.idade = 25;
        funcionario.imprimir();
        funcionario.mediasalario();
    }
}
