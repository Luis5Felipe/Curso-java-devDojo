package academy.DevDojo.javaoneforall.introduction;

public class Class06EstuturaRepeticao05 {
    public static void main(String[] args) {
        double car = 30000;
        double valorFinal = 0;
        for (int parcelas = (int) car; parcelas >= 1 ; parcelas--) {
            valorFinal = car / parcelas;
            if(valorFinal < 1000){
                continue;
            }
            System.out.println("valor das parcelas é de " + valorFinal + " Quantidade de parcelas "+ parcelas);
        }

    }
}
