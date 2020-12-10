package lista4ex;

import java.util.Random;
import java.util.Scanner;

public class Ex01Matriz {
		public static void main(String[] args)
		{
			
			/*
			 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
			 * a) Uma matriz M1 cujos elementos serão as somas dos elementos 
			 * de mesma posição das matrizes N1 e N2;
			 *
			 * b) Uma matriz M2 cujos elementos serão as diferenças dos 
 			 * elementos de mesma posição das matrizes N1 e N2.
			 */
			Scanner teclado= new Scanner(System.in);
			Random sortea = new Random();
			final int LINHA=4,COLUNA=6;
			
			int n1[][] = new int[LINHA][COLUNA];
			int n2[][] = new int[LINHA][COLUNA];
			int m1[][] = new int[LINHA][COLUNA];
			int m2[][] = new int[LINHA][COLUNA];
			
			
			System.out.println("DADOS DE N1");
			for(int linha=0;linha<LINHA;linha++)
			{
				for(int coluna=0;coluna<COLUNA;coluna++) 
				{
					n1[linha][coluna]=sortea.nextInt(6)+1;
					
					System.out.printf("\t%d",n1[linha][coluna]); 
				}
			}
			System.out.println();
			System.out.println("DADOS DE N2");
			for(int linha=0;linha<LINHA;linha++)
			{
				for(int coluna=0;coluna<COLUNA;coluna++) 
				{
					n2[linha][coluna]=sortea.nextInt(6)+1;
					
					System.out.printf("\t%d",n2[linha][coluna]); 
				}
			}
			System.out.println();
			System.out.println("DADOS DE M1");
			for(int linha=0;linha<LINHA;linha++)
			{
				for(int coluna=0;coluna<COLUNA;coluna++) 
				{
					m1[linha][coluna]=n1[linha][coluna]+n2[linha][coluna];
					System.out.printf("\t%d",m1[linha][coluna]); 
				}
			}
			System.out.println();
			System.out.println("DADOS DE M2");
			for(int linha=0;linha<LINHA;linha++)
			{
				for(int coluna=0;coluna<COLUNA;coluna++) 
				{
					m2[linha][coluna]=n1[linha][coluna]-n2[linha][coluna];
					System.out.printf("\t%d",m2[linha][coluna]); 
				}
			}
		}
}
