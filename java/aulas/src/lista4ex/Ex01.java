package lista4ex;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa que crie um vetor por leitura com 5 valores 
		 * de pontua��o de uma atividade e o escreva em seguida. 
		 * Encontre ap�s a maior pontua��o e a apresente. 
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		int valores[] = new int[5];
		int maiorPontuacao=0;
		
		for(int indice = 0;indice<5;indice++)
		{
			System.out.println("Digite o valor do "+(indice+1)+" :");
			valores[indice]=teclado.nextInt();
		}
		for(int indice = 0;indice<5;indice++)
		{
			if(valores[indice]>maiorPontuacao) {
				maiorPontuacao=valores[indice];
				System.out.println("A maior pontua��o: "+maiorPontuacao);
			}
		}
		
	}
}
