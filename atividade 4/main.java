public class Main {
    public static void main(String[] args) {
        Estudante e1 = new Estudante("Amelia", 20, "Feminino", "Fisica");
        Professor p1 = new Professor("Dr. Who", 5000, "Masculino", "Fisica");

        e1.apresentar();
        e1.estudar();
        e1.realizarAtividade();

        System.out.println();

        p1.apresentar();
        p1.ensinar();
        p1.realizarAtividade();
    }
}
