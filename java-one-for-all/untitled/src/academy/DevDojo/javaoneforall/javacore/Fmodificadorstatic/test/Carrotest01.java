package academy.DevDojo.javaoneforall.javacore.Fmodificadorstatic.test;

import academy.DevDojo.javaoneforall.javacore.Fmodificadorstatic.dominio.Carro;

public class Carrotest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("BYD", 255);
        Carro carro2 = new Carro("Corolla", 280);
        Carro carro3 = new Carro("Cadilac", 290);
        carro.setVelocidadeLimite(180);
        carro.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
