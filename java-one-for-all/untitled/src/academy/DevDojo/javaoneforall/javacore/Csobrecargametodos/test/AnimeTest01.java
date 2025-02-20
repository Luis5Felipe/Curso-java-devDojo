package academy.DevDojo.javaoneforall.javacore.Csobrecargametodos.test;

import academy.DevDojo.javaoneforall.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("One Piece","TV",50,"Ação");
        anime.imprime();
    }

}
