package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

import javax.xml.xpath.XPathExpressionException;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco= new Endereco();
        endereco.setRua("Padre Joao Antonio Andreoni");
        endereco.setCep("03475-130");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Bruno");
        pessoa.setCpf("03113215155");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Jorge");
        funcionario.setCpf("12839741");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("-------------");
        funcionario.imprime();
    }
}
