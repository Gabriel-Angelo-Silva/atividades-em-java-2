import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner EntradaInt = new Scanner(System.in);
        
        Caneta c1 = new Caneta();
        c1.tinta = 100;
        c1.cor = "azul";
        c1.marca = "bic";
        
        System.out.println("Informe a quantidade de folhas que o papel tinha:");
        int paginasV = EntradaInt.nextInt();
        Papel p1 = new Papel("Papel Comum", paginasV);
        
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Carrapato frenético";
        pessoa.caneta = c1;
        pessoa.papel = p1;

        System.out.println(pessoa.nome + " está escrevendo...");
        pessoa.caneta.escrever();

        System.out.println("Informe a quantidade de papel usado:");
        int papelUsado = EntradaInt.nextInt();
        p1.setPapelU(papelUsado);
        
        int paginasRestantes = p1.preencher_Papel();
        System.out.println("Total de páginas ainda disponíveis:");
        System.out.println(pessoa.nome + " usou " + papelUsado + " páginas. Restam " + paginasRestantes + " páginas.");
        
        EntradaInt.close();
    }
}
