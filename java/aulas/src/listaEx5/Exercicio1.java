package listaEx5;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Elabore um programa que calcule o que deve ser pago por um produto, 
		 * considerando o preço normal de etiqueta e a escolha da condição de 
		 * pagamento. Utilize os códigos da tabela a seguir para ler qual a condição 
		 * de pagamento escolhida e efetuar o cálculo adequado. 
			Código Condição de pagamento 
			1 À vista em dinheiro ou cheque, recebe 20% de desconto 
			2 À vista no cartão de crédito, recebe 15% de desconto 
			3 Em duas vezes, preço normal de etiqueta sem juros 
			4 Em três vezes, preço normal de etiqueta mais juros de 10%
		 */
		
		Scanner teclado = new Scanner(System.in);

		double etiqueta=00.00,total=00.00;
		char tabela;
		linha();
		System.out.println();
		System.out.println("Digite o preço da etiqueta:");
		etiqueta=teclado.nextDouble();
		linha();
		System.out.println();
		System.out.println("OPÇÃO DE PAGAMENTO");
		System.out.println("[1] - À vista no dinheiro ou cheque");
		System.out.println("[2] - À vista no cartão de crédito");
		System.out.println("[3] - Em duas vezes");
		System.out.println("[4] - Em três vezes");
		System.out.println("DIGITE O COMANDO DE ACORDO COM A OPÇÃO:");
		tabela=teclado.next().charAt(0);
		
		if(tabela=='1') //recebe 20% de desconto 
		{
			total= etiqueta*0.20;
			total= etiqueta-total;
			System.out.println("Você recebe desconto de 20%. o total fica: "+total+" R$");
		}
		else if(tabela=='2')//recebe 15% de desconto
		{
			total= etiqueta*0.15;
			total= etiqueta-total;
			System.out.println("Você recebe desconto de 15%. o total fica: "+total+" R$");
		}
		else if(tabela=='3')//preço normal de etiqueta sem juros 
		{
			total= etiqueta;
			System.out.println("Preço normal de etiqueta sem juros. o total fica: "+total+" R$");
		}
		else if(tabela=='4')//preço normal de etiqueta mais juros de 10%
		{
			total= etiqueta*0.10;
			total= etiqueta+total;
			System.out.println("Preço normal de etiqueta mais juros de 10%. o total fica: "+total+" R$");
		}
	}
	
	static void linha()
	{ 
		int valor=80;
		for(int x=1;x<=80;x++) 
		{
			System.out.print("=");
		}
		
	}

}
