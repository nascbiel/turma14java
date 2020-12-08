package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		char menu, genero;
		String nome;
		
		linha();
		System.out.println();
		System.out.println("UBULTICÁRIO");
		System.out.println("Análise");
		linha();
		System.out.println();
		System.out.println("Digite ");
		System.out.println("[1] - COMPRAR PRODUTOS");
		System.out.println("[2] - GERENCIAR ESTOQUE");
		System.out.println("[3] - SAIR");
		menu=ler.next().charAt(0);
	
		if(menu=='1')
		{
		System.out.println("Por favor informe seu nome: ");
		nome=ler.next().toUpperCase();
		
		System.out.println("Digite o genero que você se identifica como: [M]-Masculino [F]-Feminino [O]-Outros :");
		genero=ler.next().toUpperCase().charAt(0);
		System.out.println("");
		if(voltaGenero(genero)=="Masculino") 
		{
			System.out.println("Seja bem vindo a nossa loja, senhor "+nome);
		}
		else if(voltaGenero(genero)=="Feminino")
		{
			System.out.println("Seja bem vinda a nossa loja, senhora "+nome);
		}
		else if(voltaGenero(genero)=="Outros")
		{
			System.out.println("Seja bem vindx a nossa loja, senhorx "+nome);
		}
		else if(voltaGenero(genero)=="N/D")
		{
			System.out.println("Letra digitada errada "+nome);
		}
		
		}
		
		else if(menu=='2')
		{
			System.out.println("WIP");
		}
		else if(menu=='3')
		{
			System.out.println("Volte sempre, adoramos sua visita!!!");
		}
		
	
	
	}
	
	 public static String voltaGenero (char genero)
	{
		String tipo;
		if(genero=='M')
		{
			tipo = "Masculino";
		}
		else if(genero=='F')
		{
			tipo = "Feminino";
		}
		else if(genero=='O')
		{
			tipo = "Outros";
		}	
		else
		{
			tipo = "N/D";
		}
		return tipo;
	}

	public static void linha()
	{
		int valor = 80;
		for(int x=0;x<valor;x++) {
			System.out.print("-");
		}
	}
	
}
