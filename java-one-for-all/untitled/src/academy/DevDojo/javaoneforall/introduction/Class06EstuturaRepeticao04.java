package academy.DevDojo.javaoneforall.introduction;

public class Class06EstuturaRepeticao04 {
    public static void main(String[] args) {
        double car = 30000;
        double valorFinal = 0;
        for (int parcelas = 1; parcelas < car; parcelas++) {
            valorFinal = car / parcelas;
            if (valorFinal >=1000){
                System.out.println("valor das parcelas é de " + valorFinal + " Quantidade de parcelas "+ parcelas);
            }
            else {
                break;
            }

        }

    }
}
