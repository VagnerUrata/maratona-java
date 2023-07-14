package academy.devdojo.maratonajava.introducao;
/*
 Prática
 Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 Eu <nome>, morando no endereço <endereço>,
 confirmo que recebi o salário de <salario>, na data <data>
 */

public class TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Vagner Urata";
        String endereco = "Zacarias Alves de Melo";
        Double salario = 2500.00;
        String dataSalario = "20/10/1992";

        System.out.println("Eu " +nome + ", morando no endereço " +endereco + ", confirmo que recebi o salário de "
                + salario + ", na data " +dataSalario);
    }

}
