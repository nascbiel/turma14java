package lista2ex;

import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*
		 * Construa um sistema para ler uma vari�vel num�rica N 
		 * e imprimi-la somente se a mesma for maior que 100, caso 
		 * contr�rio imprimi-la com o valor zero.
		 */
		
		int N;
		
		System.out.println("Digite valor de N:");
		N=ler.nextInt();
		
		if(N>100) {
			System.out.println("O valor "+N+" � maior que 100!!");
		}
		else 
		{
			N=0;
			System.out.println("O valor � "+N);
		}
	}
}
