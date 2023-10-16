package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Carlos";
        funcionario.idade = 39;
        funcionario.salarios = new double[]{2500, 3200, 4500};

        funcionario.imprime();
    }
}
