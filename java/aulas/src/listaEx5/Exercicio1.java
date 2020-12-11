package listaEx5;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Elabore um programa que calcule o que deve ser pago por um produto, 
		 * considerando o pre�o normal de etiqueta e a escolha da condi��o de 
		 * pagamento. Utilize os c�digos da tabela a seguir para ler qual a condi��o 
		 * de pagamento escolhida e efetuar o c�lculo adequado. 
			C�digo Condi��o de pagamento 
			1 � vista em dinheiro ou cheque, recebe 20% de desconto 
			2 � vista no cart�o de cr�dito, recebe 15% de desconto 
			3 Em duas vezes, pre�o normal de etiqueta sem juros 
			4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%
		 */
		
		Scanner teclado = new Scanner(System.in);

		double etiqueta=00.00,total=00.00;
		char tabela;
		linha();
		System.out.println();
		System.out.println("Digite o pre�o da etiqueta:");
		etiqueta=teclado.nextDouble();
		linha();
		System.out.println();
		System.out.println("OP��O DE PAGAMENTO");
		System.out.println("[1] - � vista no dinheiro ou cheque");
		System.out.println("[2] - � vista no cart�o de cr�dito");
		System.out.println("[3] - Em duas vezes");
		System.out.println("[4] - Em tr�s vezes");
		System.out.println("DIGITE O COMANDO DE ACORDO COM A OP��O:");
		tabela=teclado.next().charAt(0);
		
		if(tabela=='1') //recebe 20% de desconto 
		{
			total= etiqueta*0.20;
			total= etiqueta-total;
			System.out.println("Voc� recebe desconto de 20%. o total fica: "+total+" R$");
		}
		else if(tabela=='2')//recebe 15% de desconto
		{
			total= etiqueta*0.15;
			total= etiqueta-total;
			System.out.println("Voc� recebe desconto de 15%. o total fica: "+total+" R$");
		}
		else if(tabela=='3')//pre�o normal de etiqueta sem juros 
		{
			total= etiqueta;
			System.out.println("Pre�o normal de etiqueta sem juros. o total fica: "+total+" R$");
		}
		else if(tabela=='4')//pre�o normal de etiqueta mais juros de 10%
		{
			total= etiqueta*0.10;
			total= etiqueta+total;
			System.out.println("Pre�o normal de etiqueta mais juros de 10%. o total fica: "+total+" R$");
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
