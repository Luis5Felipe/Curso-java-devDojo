package academy.DevDojo.javaoneforall.javacore.Gassossiacao.test;

import academy.DevDojo.javaoneforall.javacore.Gassossiacao.dominio.Escola;
import academy.DevDojo.javaoneforall.javacore.Gassossiacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi sensei");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Konoha", professores);
        escola.imprime();


    }
}
