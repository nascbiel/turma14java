package lista4ex;

import java.util.Random;
import java.util.Scanner;

public class Ex02Vetor {
		public static void main(String[] args)
		{
			
			/*
			 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
			 * Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor.
			 * A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, 
			 * contabilize e apresente tamb�m quantas foram as ocorr�ncias 
			 * da maior pontua��o.
			 */
			
			Scanner teclado = new Scanner(System.in);
			Random numero = new Random();
			final int TAMANHO=10;
			int contabilizador=0;
			int maiorNumero=0;
			int lancamentos[] = new int[TAMANHO];
			double soma=0;
			
			for (int indice=0;indice<TAMANHO;indice++)
			{
				System.out.println("valor de 1-6");
				lancamentos[indice]=numero.nextInt(6)+1;
				soma+=lancamentos[indice];		
			}
			for (int indice=0;indice<TAMANHO;indice++)
			{
				if(lancamentos[indice]>maiorNumero)
				{
					maiorNumero=lancamentos[indice];
				}
			}
			for (int indice=0;indice<TAMANHO;indice++)
			{
				if(lancamentos[indice]==maiorNumero)
				{
					contabilizador++;
				}
			}
			System.out.println("A m�dia �: "+(soma/TAMANHO));
			System.out.println("A maior pontua��o: "+maiorNumero);
			System.out.println("Quantas vezes ele se repetiu: "+contabilizador);
			
		}
}
