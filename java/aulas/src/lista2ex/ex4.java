package lista2ex;

import java.util.Scanner;

public class ex4 {
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			/*
			 * Fa�a um sistema que leia um n�mero inteiro 
			 * e mostre uma mensagem indicando se este n�mero 
			 * � par ou �mpar, e se � positivo ou negativo.
			 */
			
			int numero;
			
			System.out.println("Digite um n�mero inteiro: ");
			numero=leia.nextInt();
			
			if(numero%2==0)
			{
				System.out.println("Este n�mero � par!!!");
			}
			else if(numero%2!=0)
			{
				System.out.println("Este n�mero � �mpar!!!");
			}
			if(numero<0)
			{
				System.out.println("Este n�mero � negativo!!");
			}
			else if(numero>=0)
			{
				System.out.println("Este n�mero � positivo!!");
			}
			
			
		}
}
