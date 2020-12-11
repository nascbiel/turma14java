package listaEx5;

import java.util.Scanner;

public class Exercicio5 {
		public static void main(String[] args)
		{
			/*
			 * Faça um programa que leia um vetor de 5 posições para 
			 * números reais e, depois, um código inteiro. Se o código for zero, 
			 * finalize o programa; se for 1, mostre o vetor na ordem direta; 
			 * se for 2, mostre o vetor na ordem inversa. Caso, o código for 
			 * diferente de 1 e 2, escreva uma mensagem informando que o código 
			 * inválido.
			 */
			Scanner teclado = new Scanner(System.in);
			double vetor[] = new double[5];
			int codigo;
			for(int x=0;x<5;x++)
			{
				System.out.println("Digite a posição "+(x+1)+": ");
				vetor[x]=teclado.nextDouble();	
			}
			System.out.println("Digite o codigo: ");
			codigo=teclado.nextInt();
			
			if(codigo==0)
			{
				System.out.println("Fim de programa!");
			}
			else if(codigo==1)
			{
				for(int x=0;x<5;x++)
				{
					System.out.println(" | "+vetor[x]+" | ");
				}
			}else if(codigo==2)
			{
				for(int x=4;x>=0;x--)
				{
					System.out.println(" | "+vetor[x]+" | ");
				}
			}
			else if(codigo!=1 && codigo!=2)
			{
				System.out.println("Código inválido.");
			}
			
			
			
		}
}
