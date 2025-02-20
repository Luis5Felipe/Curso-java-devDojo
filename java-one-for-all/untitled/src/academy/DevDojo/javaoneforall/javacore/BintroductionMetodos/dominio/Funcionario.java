package academy.DevDojo.javaoneforall.javacore.BintroductionMetodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimir(){
        System.out.println("nome " + this.nome );
        System.out.println("Idade " + this.idade);
        for (double salario : salarios){
            System.out.println(salario);
        }

    }
    public void mediasalario(){
        double media = 0;
        for (double salario : salarios){
            media += salario;
        }
        media = media / 3;
        System.out.println(media);
    }
}
