package academy.DevDojo.javaoneforall.javacore.BintroductionMetodos.testes;

import academy.DevDojo.javaoneforall.javacore.BintroductionMetodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Luizin";
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        estudante02.nome = "Fabiana";
        estudante02.idade = 25;
        estudante02.sexo = 'F';

        estudante01.imprimir();
        estudante02.imprimir();
    }
}
