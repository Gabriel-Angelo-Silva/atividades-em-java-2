public class Estudante extends Pessoa {
    private String disciplina;

    public Estudante(String nome, int idade, String genero, String disciplina) {
        super(nome, idade, genero);
        this.disciplina = disciplina;
    }

    public String getdisciplina() {
        return disciplina;
    }

    public void setdisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void realizarAtividade() {
        System.out.println(getNome() + " está estudando na disciplina de " + disciplina + ".");
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Disciplina: " + disciplina);
    }
}
