package lista2ex;

import java.util.Scanner;

public class ex1 {
	public static void main (String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		/*
		 * 1) Jo�o Papo-de-Pescador, homem de bem, comprou um 
		 * microcomputador para controlar o rendimento di�rio 
		 * de seu trabalho. Toda vez que ele traz um peso de 
		 * tomate maior que o estabelecido pelo regulamento do 
		 * estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 
		 * por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia 
		 * a vari�vel P (peso de tomates) e verifique se h� excesso. Se houver,
		 *  gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa 
		 *  que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com 
		 *  o conte�do ZERO.
		 */
		
		double peso,excesso, multa;
		
		System.out.println("Digite o peso dos tomates: ");
		peso=teclado.nextDouble();
		
		if(peso>50)
		{
			excesso=peso-50;
			multa=excesso*4.00;
			System.out.println("Houve um excesso de "+excesso+" o valor da multa � de "+multa+" R$");
		}
		else {
			System.out.println("N�o houve excesso, n�o precisa pagar nenhuma multa!!");
		}
		
	}

}
