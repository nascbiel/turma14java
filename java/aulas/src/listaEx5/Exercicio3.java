package listaEx5;

import java.util.Scanner;

public class Exercicio3 
{
		public static void main(String[] args)
		{
			/*
			 * Escrever um programa que leia uma quantidade desconhecida de números
			 *  e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50]
			 *  ,[51-75] e [76-100]. A entrada de dados deve terminar quando for 
			 *  lido um número negativo.
			 */
			Scanner teclado=new Scanner(System.in);
			int numero,contabiliza=0,contabiliza2=0,contabiliza3=0,contabiliza4=0,contabiliza5=0;
			
			System.out.println("Digite o numero:");
			numero=teclado.nextInt();
			if(numero<0) {
				System.out.println("fim de programa valor negativo");
			}
			else 
			{
			while(numero>0)
			{
					System.out.println("Digite o numero:");
					numero=teclado.nextInt();
				if(numero>=0 && numero<=25)
				{
					contabiliza++;
				}
				else if(numero>=26 && numero<=50)
				{
					contabiliza2++;
				}
				else if(numero>=51 && numero<=75)
				{
					contabiliza3++;
				}
				else if(numero>=76 && numero<=100)
				{
					contabiliza4++;
				}
				else if(numero>100)
				{
					contabiliza5++;
				}
				
			}
			System.out.println("Números entre [0-25] teve: "+contabiliza);
			System.out.println("Números entre [26-50] teve: "+contabiliza2);
			System.out.println("Números entre [51-75] teve: "+contabiliza3);
			System.out.println("Números entre [76-100] teve: "+contabiliza4);
			System.out.println("Números acima de 100 teve: "+contabiliza5);
			}
		}
}
