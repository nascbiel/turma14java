package lista2ex;

import java.util.Scanner;

public class ex4 {
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			/*
			 * Faça um sistema que leia um número inteiro 
			 * e mostre uma mensagem indicando se este número 
			 * é par ou ímpar, e se é positivo ou negativo.
			 */
			
			int numero;
			
			System.out.println("Digite um número inteiro: ");
			numero=leia.nextInt();
			
			if(numero%2==0)
			{
				System.out.println("Este número é par!!!");
			}
			else if(numero%2!=0)
			{
				System.out.println("Este número é ímpar!!!");
			}
			if(numero<0)
			{
				System.out.println("Este número é negativo!!");
			}
			else if(numero>=0)
			{
				System.out.println("Este número é positivo!!");
			}
			
			
		}
}
