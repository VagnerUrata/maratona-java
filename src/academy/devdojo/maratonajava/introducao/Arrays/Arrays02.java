package academy.devdojo.maratonajava.introducao.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] nomes = new String[4];
        nomes[0] = "Claudio";
        nomes[1] = "Joao";
        nomes[2] = "Robson";
        nomes[3] = "Jorge";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }
    }

}
