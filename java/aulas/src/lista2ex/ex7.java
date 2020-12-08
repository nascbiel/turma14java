package lista2ex;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		/*
		 * Receber valores de base e altura de um triângulo 
		 * e verificar se são valores válidos (positivos maiores que zero). 
		 * Em caso afirmativo, calcular a área do triângulo.
		 */
		
		int base,altura, area;
		
		System.out.println("Digite o valor da base do triângulo:");
		base=leia.nextInt();
		System.out.println("Digite o valor da altura do triângulo:");
		altura=leia.nextInt();
		
		if(base%2==0 && base>0)
		{
			if(altura%2==0 && altura>0)
			{
				area=(base*altura)/2;
				System.out.println("A area do triângulo é: "+area);
			}
		}
		else {
			System.out.println("Valores Inválidos!");
		}
	}
}
