package academy.DevDojo.javaoneforall.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodes = {1,2,3,4,5,6,7,8,9,10,11,12};

    public Anime() {
        for(int episode: this.episodes){
            System.out.print(episode + " ");
        }
    }
}
