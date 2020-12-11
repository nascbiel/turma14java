package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		char menu, genero,opcao='S';
		String nome;
		String codigos[]= new String[10];
		String produtos[]={"Batom","perfume","shampoo","condicionador","base","delineador","Lápis de olho","primer","sombra paleta","corretivo"};
		int precoUnitarios[] = {14,140,11,9,18,14,13,16,70,22};	
		int estoque[] = new int[10];
		int carrinho[] = new int[10];
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
		nome=ler.next().toUpperCase();
		System.out.println("Digite o genero que você se identifica como: [M]-Masculino [F]-Feminino [O]-Outros :");
		genero=ler.next().toUpperCase().charAt(0);
		System.out.println();
		linha();
		System.out.println();
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
			System.out.println("Genero digitado errado, "+nome);
		}
		System.out.println();
		System.out.printf("\tCÓDIGOS\tPREÇO\t\tESTOQUE\t\tPRODUTOS\n");
		linha();
		System.out.println();
				for(int x=0;x<10;x++)
				{
					estoque[x]=10;
					codigos[x]="UIA 0"+(x+1);
					System.out.printf("%s\t\t%d R$\t\t%d\t\t%s\n",codigos[x],precoUnitarios[x],estoque[x],produtos[x]);
				}
		linha();
		System.out.println();
		System.out.println("Digite o código do produto que deseja:");
		escolha=ler.next().toUpperCase();		
		/*for (int x=0; x<10; x++)
			{
			if (codigos[x].equals(escolha))
			{
				escolhido = x;
			}	
			}*/
		System.out.println("Produto escolhido: "+produtos[escolhido]);
			
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
			System.out.print("=");
		}
	}
	
}
