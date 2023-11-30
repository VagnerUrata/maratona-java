package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Jogador {
    private Time time;
    public void imprime() {
        System.out.println("Jogador: " + this.nome);
        if (time != null){
            System.out.println("Time: " + time.getNome());
        }
    }

    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
