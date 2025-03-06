package academy.DevDojo.javaoneforall.Exercicio.test;

import academy.DevDojo.javaoneforall.Exercicio.Aluno;
import academy.DevDojo.javaoneforall.Exercicio.Local;
import academy.DevDojo.javaoneforall.Exercicio.Professor;
import academy.DevDojo.javaoneforall.Exercicio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Luffy", 18);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde está one Piece", alunosParaSeminario, local );
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();

    }
}
