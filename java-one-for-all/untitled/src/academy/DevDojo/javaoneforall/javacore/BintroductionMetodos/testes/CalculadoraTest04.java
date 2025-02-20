package academy.DevDojo.javaoneforall.javacore.BintroductionMetodos.testes;

import academy.DevDojo.javaoneforall.javacore.BintroductionMetodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num,num2);
        System.out.println(num);
        System.out.println(num2);
    }
}
