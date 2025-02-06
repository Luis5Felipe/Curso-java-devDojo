package academy.DevDojo.javaoneforall.introduction;
import java.util.Scanner;
public class Class05EstuturaCondicinal06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia?");
        byte diautil = scanner.nextByte();
        switch (diautil){
            case 1:
                System.out.println("Domingo não é dia útil");
                break;
            case 2:
                System.out.println("Segunda Feira é dia útil");
                break;
            case 3:
                System.out.println("Terça Feira é dia útil");
                break;
            case 4:
                System.out.println("Quarta Feira é dia útil");
                break;
            case 5:
                System.out.println("Quinta Feira é dia útil");
                break;
            case 6:
                System.out.println("Sexta Feira é dia útil");
                break;
            case 7:
                System.out.println("Sábado não é dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
