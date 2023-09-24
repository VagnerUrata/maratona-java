package academy.devdojo.maratonajava.introducao.EstruturasCondicionais;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria juvenil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade > 15 categoria adulto

        int idade = 17;
        String categoria;

        if (idade < 15){
            categoria = "Categoria Infantil";
        } else if (idade >=15 && idade <18) {
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
