package academy.DevDojo.javaoneforall.introduction;

public class Class07Arrays02 {
    public static void main(String[] args) {
        String [] nomes = new String[4];
        nomes[0] = "Song";
        nomes[1] = "Solo";
        nomes[2] = "Levin";
        for (String nome : nomes) {
            System.out.println(nome);
        }
        // nomes = new String[5];
    }
}
