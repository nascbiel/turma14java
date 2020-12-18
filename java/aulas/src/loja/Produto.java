package loja;

import java.util.Scanner;

public class Produto {
	
	private String nomeProduto;
	private String codigo;
	private int precoUnitario;
	private int qtdeProdutoEstoque;

	public Produto(String nomeProduto, String codigo, int precoUnitario, int qtdeProdutoEstoque) {
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

	public void setPrecoUnitario(int precoUnitario) {
		this.precoUnitario =  precoUnitario;
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
	public void tiraEstoque(int valorSaidaEstoque) //SE DER TRUE, O ESTOQUE DECREMENTA
	{
		//estoqueAtual = estoqueAtual - valorSaidaEstoque
		if(testarEstoque(valorSaidaEstoque))
		{
		this.qtdeProdutoEstoque-=valorSaidaEstoque;
		}
		else {
			System.out.println("ESTOQUE ZERADO, VOCÊ ESTÁ PEDINDO MAIS DO QUE TEM EM NOSSO ESTOQUE.");  //SE DER FALSE, APARECE ESSA MENSAGEM, POIS A QUANTIDADE Q A PESSOA QR EH MAIOR Q O ESTOQUE DISPONIVEL
		}
	}
	public void adicionaEstoque( int entrada)
	{
		
	}
	public boolean testarEstoque(int valor)   
	{
		if(valor > this.qtdeProdutoEstoque || valor < 0) 
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
		Scanner teclado = new Scanner(System.in);
		
		int op;
		double valor=0,parcela;
		final double imposto=0.09;
		/*
		 *  1 - PAGAMENTO A VISTA - 10%
			2 - DEBITO - VALOR SIMPLES
			3 - CREDITO COM 5% A MAIS
			4 - CREDITO [ATÉ 3 VEZES] COM JUROS DE 10% MOSTRA AS PARCELAS
			TODOS - 9% É IMPOSTO - MOSTRA NA NOTA
		 */
			
		//ajuste no estoque - tiraEstoque*
		if(testarEstoque(qtdeVendida))
		{
			tiraEstoque(qtdeVendida);
			System.out.println(" *\t\tDIGITE A OPÇÃO DE PAGAMENTO\t\t *");
			System.out.println(" ||\t\t[1] - PAGAMENTO Á VISTA\t\t  || ");
			System.out.println(" ||\t\t[2] - DEBITO\t\t          ||");
			System.out.println(" ||\t\t[3] - CREDITO\t\t          ||");
			System.out.println(" ||\t\t[4] - EM DUAS VEZES\t\t   ||");
			System.out.println(" ||\t\t[5] - EM TRÊZ VEZES\t\t   ||");
			System.out.println(" ||\t\t[0] - CANCELAR COMPRA\t\t  ||");
			System.out.println(" *\t\tDIGITE A OPÇÃO DESEJADA:\t\t  *");
			op=teclado.nextInt();
			if(op==1)
			{		//1 - PAGAMENTO A VISTA - 10%
				valor=this.precoUnitario*0.10*imposto;
				valor=this.precoUnitario-valor;
				valor=qtdeVendida*valor;
				System.out.println("Á VISTA, VALOR : "+Math.round(valor)+" R$");
				
				
			}
			else if(op==2)
			{		//2 - DEBITO - VALOR SIMPLES
				valor=this.precoUnitario*imposto;
				valor+=this.precoUnitario;
				valor=qtdeVendida*valor;	
				System.out.println("DEBITO, VALOR : "+Math.round(valor)+" R$");
			
			}
			else if(op==3)
			{		//3 - CREDITO COM 5% A MAIS
				valor=this.precoUnitario*0.05*imposto;
				valor+=this.precoUnitario;
				valor=qtdeVendida*valor;
				System.out.println("CREDITO, VALOR : "+Math.round(valor)+" R$");
				
			}
			else if(op==4)
			{		//4 - CREDITO [ATÉ 3 VEZES] COM JUROS DE 10% MOSTRA AS PARCELAS
				valor=this.precoUnitario*0.10*imposto;
				valor+=this.precoUnitario;
				valor=qtdeVendida*valor;
				parcela=valor/2;
				System.out.println("CREDITO 2 VEZES, VALOR: "+Math.round(valor)+" R$");
				System.out.println("PARCELA EM 2 X:"+Math.round(parcela)+" R$");
			
			}
			else if(op==5)
			{		//4 - CREDITO [ATÉ 3 VEZES] COM JUROS DE 10% MOSTRA AS PARCELAS
				valor=this.precoUnitario*0.10*imposto;
				valor+=this.precoUnitario;
				valor=qtdeVendida*valor;
				parcela=valor/3;
				System.out.println("CREDITO 3 VEZES, VALOR: "+Math.round(valor)+" R$");
				System.out.println("PARCELA EM 3 X:"+Math.round(parcela)+" R$");
			
			}
			else if(op==0)
			{		
				valor=0;
				System.out.println("COMPRA CANCELADA.");
			}
			return valor;
		}
		else {
			System.out.println("VENDA INDISPONÍVEL");
			return 0;
		}
		
	}
	
	
	
	
}
