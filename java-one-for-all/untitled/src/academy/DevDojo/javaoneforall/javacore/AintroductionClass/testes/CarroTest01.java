package academy.DevDojo.javaoneforall.javacore.AintroductionClass.testes;

import academy.DevDojo.javaoneforall.javacore.AintroductionClass.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        carro.nome = "Byd";
        carro.ano = 2025;
        carro.modelo = "Seal";

        carro2.nome = "Cupra";
        carro2.ano = 2025;
        carro2.modelo = "Cupra snake";

        System.out.println("Nome: "+ carro.nome+" Modelo: "+carro.modelo+" Ano: "+carro.ano);
        System.out.println("Nome: "+ carro2.nome+" Modelo: "+carro2.modelo+" Ano: "+carro2.ano);
    }
}
