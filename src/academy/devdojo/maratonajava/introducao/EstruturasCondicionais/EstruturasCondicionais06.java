package academy.devdojo.maratonajava.introducao.EstruturasCondicionais;

public class EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia útil ou fds
        // Considerando 1 como domingo

        byte dia = 7;
        //char, int, byte, short, enum, String
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
