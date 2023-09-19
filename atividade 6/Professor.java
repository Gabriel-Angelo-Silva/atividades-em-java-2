public class Professor extends Pessoa implements Comportamento {
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
    public void realizarAcao() {
        System.out.println(getNome() + " está dando uma aula na disciplina de " + disciplina + ".");
    }

    @Override
    public void apresentar() {
        System.out.println("Professor:");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Disciplina: " + disciplina);
    }
}
