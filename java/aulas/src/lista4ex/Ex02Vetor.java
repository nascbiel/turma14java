package lista4ex;

import java.util.Random;
import java.util.Scanner;

public class Ex02Vetor {
		public static void main(String[] args)
		{
			
			/*
			 * Um dado é lançado 10 vezes e o valor correspondente é anotado. 
			 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
			 * A seguir determine e imprima a média aritmética dos lançamentos, 
			 * contabilize e apresente também quantas foram as ocorrências 
			 * da maior pontuação.
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
			System.out.println("A média é: "+(soma/TAMANHO));
			System.out.println("A maior pontuação: "+maiorNumero);
			System.out.println("Quantas vezes ele se repetiu: "+contabilizador);
			
		}
}
