package academy.DevDojo.javaoneforall.introduction;
import java.util.Scanner;
public class Class06Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario;
        System.out.println("Digite o seu salário anual");
        salario = scanner.nextDouble();
        double totalDeImpostos;
        double impostoUm = 0.0972;
        double impostodois = 0.3735;
        double impostotres = 0.4950;
        if(salario <= 34712){
            totalDeImpostos = salario * impostoUm;
        } else if (salario >  34712 && salario <=  68507) {
            totalDeImpostos = salario * impostodois;
        }
        else
            totalDeImpostos = salario * impostotres;
        System.out.println(totalDeImpostos);
    }
}
