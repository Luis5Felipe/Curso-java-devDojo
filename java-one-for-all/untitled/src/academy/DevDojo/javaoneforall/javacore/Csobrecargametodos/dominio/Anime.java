package academy.DevDojo.javaoneforall.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int epsodios;
    private String nome;
    private String genero;


    public void init(String nome, String tipo, int epsodios){
        this.nome = nome;
        this.tipo = tipo;
        this.epsodios = epsodios;
    }

    public void init(String nome, String tipo, int epsodios, String genero){
        this.init(nome, tipo,epsodios);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEpsodios() {
        return this.epsodios;
    }

    public void setEpsodios(int epsodios) {
        this.epsodios = epsodios;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.epsodios);
        System.out.println(this.nome);
        System.out.println(this.genero);
    }
}
