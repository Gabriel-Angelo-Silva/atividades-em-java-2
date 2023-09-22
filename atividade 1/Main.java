public class Main
{
	public static void main(String[] args) {
		System.out.println("Primeira Conta:");
		Pessoa p1 = new Pessoa();
		p1.nome = "Gabriel";
		p1.ValorEmConta = 0;
		p1.Banco = "Inter";
		p1.ExibirDados(p1.nome,p1.Banco,p1.ValorEmConta);
		
		System.out.println();
		
		System.out.println("Segunda Conta:");
		Pessoa p2 = new Pessoa();
		p2.nome = "Bolsonaro";
		p2.ValorEmConta = 1000000000;
		p2.Banco = "SuiçaCorp";
		p2.ExibirDados(p2.nome,p2.Banco,p2.ValorEmConta);
	}
}
