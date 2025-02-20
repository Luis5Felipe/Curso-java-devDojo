package academy.DevDojo.javaoneforall.javacore.BintroductionMetodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDosNumeros(){
        System.out.println(21 - 2);
    }
    public void multiplicaDosNumeros(int num, int num2){
        System.out.println(num * num2);
    }
    public double divideDoisNumeros(double num, double num2){
        if (num2 == 0){
            return 0;
        }
        return num/num2;
    }
    public double divideDoisNumeros2(double num, double num2){
        if (num2 != 0){
            return num/num2;
        }
        return 0;
    }
    public void imprimeDivisao(double num, double num2){
        if (num2 == 0){
            System.out.println("Não existe divisão por zero");
        }else
            System.out.println(num/num2);
    }
    public void alteraDoisNumeros(int num, int num2){
        num = 99;
        num2 = 33;
        System.out.println("Dentro Das alterações do números");
        System.out.println("Num "+ num + "Num2"+ num2 );
    }
    public void ArrayList(int [] numeros){
       int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    public void Varargs(int... numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
