package academy.DevDojo.javaoneforall.javacore.BintroductionMetodos.testes;

import academy.DevDojo.javaoneforall.javacore.BintroductionMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros2(20,0));
        calculadora.imprimeDivisao(20,0);

    }

}
