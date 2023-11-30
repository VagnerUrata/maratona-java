package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Marcelinho Carioca");
        Jogador jogador2 = new Jogador("Rai");
        Time time = new Time("Corinthians");
        Time time2 = new Time("Sao Paulo");

        Jogador[] jogadores = {jogador, jogador2};
        jogador.setTime(time);
        jogador2.setTime(time2);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();
        jogador2.imprime();
        System.out.println("--- Time ---");
        time.imprime();
        time2.imprime();
    }


}
