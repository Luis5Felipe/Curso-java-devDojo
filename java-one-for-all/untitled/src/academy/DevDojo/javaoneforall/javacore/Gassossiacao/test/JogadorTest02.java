package academy.DevDojo.javaoneforall.javacore.Gassossiacao.test;

import academy.DevDojo.javaoneforall.javacore.Gassossiacao.dominio.Jogador;
import academy.DevDojo.javaoneforall.javacore.Gassossiacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jagador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");
        jagador1.setTime(time);
        jagador1.imprime();
    }
}
