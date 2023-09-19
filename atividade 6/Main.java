public class Main {
    public static void main(String[] args) {
        Estudante e1 = new Estudante("Amelia", 20, "Feminino", "Fisica");
        Professor p1 = new Professor("Dr. Who", 5000, "Masculino", "Fisica");

        e1.apresentar();
        System.out.println();
        p1.apresentar();
        System.out.println();

        if (e1.getDisciplina().equals(p1.getDisciplina())) {
            System.out.println(e1.getNome() + " está tendo uma aula com o professor " + p1.getNome() + ".");
        } else {
            e1.realizarAcao();
            p1.realizarAcao();
        }
    }
}
