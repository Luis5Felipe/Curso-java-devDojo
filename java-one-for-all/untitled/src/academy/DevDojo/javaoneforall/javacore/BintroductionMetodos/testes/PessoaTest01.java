package academy.DevDojo.javaoneforall.javacore.BintroductionMetodos.testes;

import academy.DevDojo.javaoneforall.javacore.BintroductionMetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Jiraya";
        //pessoa.idade = -1;
        pessoa.setIdade(50);
        pessoa.setNome("Fer");
       // pessoa.imprimir();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }

}
