package banco;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		char menu,leiaMenu,genero;
		String nome;
		
		linha();
		System.out.println();
		System.out.println("BEM VINDO AO BANCO-G8");
		System.out.println("AQUI SEU DINHEIRO RENDE");
		linha();
		System.out.println();
		System.out.println("[1] - Tipos de conta");
		System.out.println("[2] - sair");
		System.out.println("Digite:");
		menu=ler.next().charAt(0);
		
		if(menu=='1')
		{
			System.out.println("Olá, digite seu nome por favor: ");
			nome=ler.next().toUpperCase();
			System.out.println("Digite o genero que você se identifica [M] - Masculino [F] - Feminino [O] - Outros: ");
			genero=ler.next().toUpperCase().charAt(0);
			if(voltaGenero(genero)=="Masculino")
			{
				System.out.println("Seja bem vindo ao nosso banco, senhor "+nome);
			}
			else if(voltaGenero(genero)=="Feminino")
			{
				System.out.println("Seja bem vinda ao nosso banco, senhora "+nome);
			}
			else if(voltaGenero(genero)=="Outros")
			{
				System.out.println("Seja bem vindx ao nosso banco, senhorx "+nome);
			}
			else if(voltaGenero(genero)=="N/D")
			{
				System.out.println("Digito errado, senhorx "+nome);
			}
			
			System.out.println();
			System.out.println("[1] - para Conta Poupança");
			System.out.println("[2] - para Conta Especial");
			System.out.println("[3] - para Conta Universitária");
			System.out.println("[4] - para Emprestimo empresa");
			System.out.println("Digite:");
			leiaMenu=ler.next().charAt(0);
			
			
		}
		else if(menu=='2')
		{
			System.out.println("Até mais, Volte sempre!!");
		}
		
		
	}
	

	public static void linha()
	{
		int valor = 80;
		for(int x=0;x<valor;x++) {
			System.out.print("-");
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
}
