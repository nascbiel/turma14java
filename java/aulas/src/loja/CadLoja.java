package loja;



import java.util.Scanner;

import exemplos.Funcionario;


public class CadLoja {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		char menu, genero,opcao='S';
		String codigos[]= new String[10];
		//String produto[]={"Batom","perfume","shampoo","condicionador","base","delineador","Lápis de olho","primer","sombra paleta","corretivo"};
		//int precoUnitarios[] = {14,140,11,9,18,14,13,16,70,22};	
		String escolha;
		int escolhido=0;
	do 
	{
		linha();
		System.out.println();
		System.out.println("UBULTICÁRIO");
		System.out.println("Análise");
		linha();
		System.out.println();
		System.out.println("Digite de acordo com o comando ");
		System.out.println("[1] - COMPRAR PRODUTOS");
		System.out.println("[2] - GERENCIAR ESTOQUE");
		System.out.println("[3] - SAIR");
		System.out.println("DIGITE O COMANDO: ");
		menu=ler.next().charAt(0);
		linha();
		System.out.println();
		if(menu=='1')
		{
		System.out.println("Por favor informe seu nome: ");
		String nome=ler.next().toUpperCase();
		System.out.println("Digite o genero que você se identifica como: [M]-Masculino [F]-Feminino [X]-Outros :");
		genero=ler.next().toUpperCase().charAt(0);
		System.out.println();
		
		System.out.println("Deseja continuar S/N?");
		opcao=ler.next().toUpperCase().charAt(0);
		}
		else if(menu=='2')
		{
			System.out.println("WIP");
			System.out.println("Deseja continuar S/N?");
			opcao=ler.next().toUpperCase().charAt(0);
		}
		else if(menu=='3')
		{
			opcao='N';
			break;
		}
	}while(opcao=='S');
	
	System.out.println("Volte sempre, adoramos sua visita!!!");

	}

	public static void linha()
	{
		int valor = 80;
		for(int x=0;x<valor;x++) {
			System.out.print("=");
		}
	}
	
}
