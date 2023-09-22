public class Pessoa{
    int ValorEmConta;
    String nome, Banco;
    
    public void ExibirDados(String nome, String Banco, int ValorEmConta){
       System.out.println("Nome: "+ nome);
       System.out.println("Banco: "+ Banco);
       System.out.println("Valor na Conta: "+ ValorEmConta);
    }    
}
