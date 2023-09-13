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

    @Override
    public void realizarAtividade() {
        System.out.println(getNome() + " está dando uma aula na disciplina de " + disciplina + ".");
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Disciplina: " + disciplina);
    }
}
