package lista2ex;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		/*
		 * Receber valores de base e altura de um tri�ngulo 
		 * e verificar se s�o valores v�lidos (positivos maiores que zero). 
		 * Em caso afirmativo, calcular a �rea do tri�ngulo.
		 */
		
		int base,altura, area;
		
		System.out.println("Digite o valor da base do tri�ngulo:");
		base=leia.nextInt();
		System.out.println("Digite o valor da altura do tri�ngulo:");
		altura=leia.nextInt();
		
		if(base%2==0 && base>0)
		{
			if(altura%2==0 && altura>0)
			{
				area=(base*altura)/2;
				System.out.println("A area do tri�ngulo �: "+area);
			}
		}
		else {
			System.out.println("Valores Inv�lidos!");
		}
	}
}
