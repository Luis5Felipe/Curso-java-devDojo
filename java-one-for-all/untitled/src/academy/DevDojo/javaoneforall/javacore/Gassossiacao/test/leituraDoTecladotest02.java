package academy.DevDojo.javaoneforall.javacore.Gassossiacao.test;

import java.util.Scanner;

public class leituraDoTecladotest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite a  sua pergunta e eu respoderei sim ou não");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' '){
            System.out.println("Sim");
        }
        else
            System.out.println("Não");
    }

}
