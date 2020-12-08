package lista2ex;

import java.util.Scanner;

public class ex1 {
	public static void main (String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		/*
		 * 1) João Papo-de-Pescador, homem de bem, comprou um 
		 * microcomputador para controlar o rendimento diário 
		 * de seu trabalho. Toda vez que ele traz um peso de 
		 * tomate maior que o estabelecido pelo regulamento do 
		 * estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 
		 * por quilo excedente. João precisa que você faça um sistema que leia 
		 * a variável P (peso de tomates) e verifique se há excesso. Se houver,
		 *  gravar na variável E (Excesso) e na variável M o valor da multa 
		 *  que João deverá pagar. Caso contrário mostrar tais variáveis com 
		 *  o conteúdo ZERO.
		 */
		
		double peso,excesso, multa;
		
		System.out.println("Digite o peso dos tomates: ");
		peso=teclado.nextDouble();
		
		if(peso>50)
		{
			excesso=peso-50;
			multa=excesso*4.00;
			System.out.println("Houve um excesso de "+excesso+" o valor da multa é de "+multa+" R$");
		}
		else {
			System.out.println("Não houve excesso, não precisa pagar nenhuma multa!!");
		}
		
	}

}
