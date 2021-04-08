package Objetos;

import java.util.ArrayList;

public class Aluno {

    private static final String primeiro = null;

    // CONSTRUTOR
    public Aluno() {
        this.nomeAluno = nomeAluno;
        this.rgm = rgm;
        this.disciplinas = disciplinas;
    }

    // ATRIBUTOS
    public String nomeAluno;
    public int rgm;
    public ArrayList<String> disciplinas = new ArrayList();

    // GETTERS E SETTERS
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getRgm() {

        return rgm;
    }

    public void setRgm(int rgm) {
        this.rgm = rgm;
    }

    public ArrayList<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Aluno(String nomeAluno, int rgm, ArrayList<String> disciplinas) {
        this.nomeAluno = nomeAluno;
        this.rgm = rgm;
        this.disciplinas = disciplinas;
    }

    public String getDados() {
        return "Nome: " + this.nomeAluno + "\n Materia: " + this.disciplinas + "\n Matricula: " + this.rgm;
    }

}

public class Rgm {

}
