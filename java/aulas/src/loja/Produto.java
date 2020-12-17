package loja;

public class Produto {
	
	private String nomeProduto;
	private String codigo;
	private double precoUnitario;
	private int qtdeProdutoEstoque;
	
	
	public Produto(String nomeProduto, String codigo, double precoUnitario) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
	}

	public Produto(String nomeProduto, String codigo, double precoUnitario, int qtdeProdutoEstoque) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}

	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQtdeProdutoEstoque() {
		return qtdeProdutoEstoque;
	}	
	/*
	 *  - tiraEstoque(int saida): void
 		+ adicionaEstoque( int entrada): void
 		- venda(int qtdeVendida): double
 		+ testarEstoque(int valor): boolean
	 */
	public void tiraEstoque(int valorSaidaEstoque)
	{
		//estoqueAtual = estoqueAtual - valorSaidaEstoque
		if(testarEstoque(valorSaidaEstoque))
		{
		this.qtdeProdutoEstoque-=valorSaidaEstoque;
		}
		else {
			System.out.println("ESTOQUE ZERADO");
		}
	}
	public void adicionaEstoque( int entrada)
	{
		//estoqueatual = estoqueAtual + valorSaidaEstoque
		this.qtdeProdutoEstoque+=entrada;
	}
	public boolean testarEstoque(int valor)
	{
		if(valor > this.qtdeProdutoEstoque || valor <=0) 
		{
			return false;
		}
		else if(valor==0 || this.qtdeProdutoEstoque==0)
		{
			return false;
		}
		else {
			return true;
		}
	}

	public double venda(int qtdeVendida)
	{
		//ajuste no estoque - tiraEstoque*
		if(testarEstoque(qtdeVendida))
		{
			tiraEstoque(qtdeVendida);
			return qtdeVendida * this.precoUnitario;
		}
		else {
			System.out.println("VENDA INDISPONÍVEL");
			return 0;
		}
		
	}
	
	
	
	
}
