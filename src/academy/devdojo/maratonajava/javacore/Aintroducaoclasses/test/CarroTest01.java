package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Honda";
        carro.modelo = "Civic";
        carro.ano = 2017;

        carro2.nome = "Volkswagen";
        carro2.modelo = "Gol";
        carro2.ano = 1989;

        System.out.println("Nome: " + carro.nome + ", Modelo: " + carro.modelo + ", Ano: " + carro.ano);
        System.out.println("Nome: " + carro2.nome + ", Modelo: " + carro2.modelo + ", Ano: " + carro2.ano);


    }


}
