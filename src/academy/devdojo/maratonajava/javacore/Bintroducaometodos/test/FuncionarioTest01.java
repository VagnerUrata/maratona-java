package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Carlos");
        funcionario.setIdade(39);
        funcionario.setSalarios(new double[] {2500, 3200, 4500});
        funcionario.imprime();
        System.out.println("Media " + funcionario.getMedia());
    }
}
