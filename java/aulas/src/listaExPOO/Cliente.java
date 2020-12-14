package listaExPOO;

public class Cliente {
	
	String nome;
	char genero;
	int anoNascimento;
	String cpf;
	int idade;
	String regiao;
	double pagamento;
	char tipoPagamento;
	
	public Cliente() {
	}
	public Cliente(String nome,char genero,int anoNascimento,String cpf, String regiao, double pagamento,char tipoPagamento) 
	{
		this.nome=nome;
		this.genero=genero;
		this.anoNascimento=anoNascimento;
		this.cpf=cpf;	
		this.regiao=regiao;
		this.pagamento=pagamento;
		this.tipoPagamento=tipoPagamento;
	}
	public void meninoMenina(char genero) 
	{
		if(genero=='M') 
		{
			System.out.println("BEM-VINDO SENHOR");
		}
		else if(genero=='F') 
		{
			System.out.println("BEM-VINDA SENHORA");
		}
		else if(genero=='O') 
		{
			System.out.println("BEM-VINDX SENHORX");
		}
		else {
			System.out.println("Genero Inválido");
		}
	}
	public void retornarPagamento(char tipoPagamento)
	{
		if(tipoPagamento=='C') {
			System.out.println("Pagamento cartão");
		}
		else if(tipoPagamento=='D') {
			System.out.println("Pagamento Dinheiro");
		}
		else {
			System.out.println("Digito inválido");
		}
	}
	
	public void retornaIdade(int anoAtual)
	{
		this.idade = anoAtual - this.anoNascimento;
	}
}
