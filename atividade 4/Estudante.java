public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, int idade, String genero, String curso) {
        super(nome, idade, genero);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void estudar() {
        System.out.println(getNome() + " está estudando no curso de " + curso + ".");
    }

    @Override
    public void realizarAtividade() {
        System.out.println(getNome() + " está participando de uma aula.");
    }
}
