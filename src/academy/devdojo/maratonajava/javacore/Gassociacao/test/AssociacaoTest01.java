package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Robson", 12);
        Professor professor = new Professor("Edson", "Geografia");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Mapa Mundi", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminario(seminariosDisponiveis);
        professor.imprime();
    }
}
