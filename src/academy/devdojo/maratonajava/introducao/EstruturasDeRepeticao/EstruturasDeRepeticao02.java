package academy.devdojo.maratonajava.introducao.EstruturasDeRepeticao;

public class EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os n[umeros pares de 0 a 1000000
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0)
                System.out.println("Exercicio " + i);
        }
    }
}

