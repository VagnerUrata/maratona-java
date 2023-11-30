package academy.devdojo.maratonajava.javacore.Dconstutores.test;

import academy.devdojo.maratonajava.javacore.Dconstutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime( "Pokemon", "TV", 12, "Fantasia", "Confort");
        anime.imprime();
    }
}
