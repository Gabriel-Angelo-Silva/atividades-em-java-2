public class Main
{
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Gabriel";
		p1.ValorEmConta = 0;
		p1.Banco = "Inter";
		p1.ExibirDados(p1.nome,p1.Banco,p1.ValorEmConta);
	}
}
