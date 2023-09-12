public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String genero, String disciplina) {
        super(nome, idade, genero);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void ensinar() {
        System.out.println(getNome() + " está ensinando a disciplina de " + disciplina + ".");
    }

    @Override
    public void realizarAtividade() {
        System.out.println(getNome() + " está dando uma aula.");
    }
}
