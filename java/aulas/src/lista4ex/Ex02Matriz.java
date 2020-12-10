package lista4ex;

import java.util.Scanner;

public class Ex02Matriz {
		public static void main(String[] args)
		{
			
			/*
			 * Crie um programa que receba valores do usuário para preencher 
			 * uma matriz 3X3, e em seguida, exiba a soma dos valores dela e 
			 * a soma dos valores da primeira diagonal, ou seja, diagonal principal.
			 */
			
			Scanner teclado = new Scanner(System.in);
			
			int matriz[][] = new int[3][3];
			int soma=0;
			int diagonal=0;
			
			System.out.println("MATRIZ [3][3]");
			
			for(int linha=0;linha<3;linha++)
			{
				for(int coluna=0;coluna<3;coluna++)
				{
					System.out.printf("Digite o valor [%d][%d]\n",linha+1,coluna+1);
					matriz[linha][coluna]=teclado.nextInt();
				}
			}
			for(int linha=0;linha<3;linha++)
			{
				for(int coluna=0;coluna<3;coluna++)
				{
					soma+=matriz[linha][coluna];
					if(linha==coluna)
					{
						diagonal+=matriz[linha][coluna];
					}
				}
			}
			System.out.println("A soma é: "+soma);
			System.out.println("A soma da diagonal principal é: "+diagonal);
		}
}
