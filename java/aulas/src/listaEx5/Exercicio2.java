package listaEx5;

import java.util.Scanner;

public class Exercicio2 {
		public static void main(String[] args)
		{
			/*
			 * O IMC � �ndice de Massa Corporal � um crit�rio da Organiza��o Mundial
			 *  de Sa�de para dar uma indica��o sobre a condi��o de peso de uma 
			 *  pessoa adulta. A f�rmula � IMC = peso / ( altura )2 
			Elabore um programa que leia o peso e a altura de um adulto 
			e mostre sua condi��o de acordo com a tabela abaixo. 
			IMC em adultos Condi��o 
			Abaixo de 18,5 Abaixo do peso 
			Entre 18,5 e 25 Peso normal 
			Entre 25 e 30 Acima do peso 
			Acima de 30 obeso
			 */
			Scanner teclado = new Scanner(System.in);
			double peso,altura,imc=00.00;

			System.out.println("Digite seu peso:");
			peso=teclado.nextDouble();
			System.out.println("Digite sua altura:");
			altura=teclado.nextDouble();
			//IMC = peso / ( altura )2
			imc=peso/((altura)*(altura));
			/*
		    Abaixo de 18,5 Abaixo do peso 
			Entre 18,5 e 25 Peso normal 
			Entre 25 e 30 Acima do peso 
			Acima de 30 obeso
			*/
			
			if(imc<18.5)
			{
				System.out.println("Abaixo do peso, IMC:"+imc);
			}
			else if(imc>=18.5 && imc<25)
			{
				System.out.println("Peso normal, IMC:"+imc);
			}
			else if(imc>=25 && imc<30)
			{
				System.out.println("Acima do peso, IMC:"+imc);
			}
			else if(imc>=30)
			{
				System.out.println("Obeso, IMC:"+imc);
			}
		}
}
