package lista2ex;

import java.util.Scanner;

public class ex2 {
		public static void main(String[] args)
		{
			Scanner ler = new Scanner(System.in);
			
			/*
			 * Elabore um sistema que leia as vari�veis C e N, 
			 * respectivamente c�digo e n�mero de horas trabalhadas 
			 * de um oper�rio. E calcule o sal�rio sabendo-se que 
			 * ele ganha R$ 10,00 por hora. Quando o n�mero de horas 
			 * exceder a 50 calcule o excesso de pagamento armazenando-o 
			 * na vari�vel E, caso contr�rio zerar tal vari�vel. 
			 * A hora excedente de trabalho vale R$ 20,00. No final do 
			 * processamento imprimir o sal�rio total e o sal�rio excedente.
			 */
			
			int codigo, horasTrabalhadas;
			double calculo,salarioTotal;
			System.out.println("Digite o c�digo: ");
			codigo = ler.nextInt();
			System.out.println("Digite as horas trabalhadas: ");
			horasTrabalhadas = ler.nextInt();
			if(horasTrabalhadas>=0)
			{
				if(horasTrabalhadas>50)
				{
				calculo=(horasTrabalhadas-50)*20.00;
				salarioTotal=50*10.00+calculo;
				System.out.println("O salario total � "+salarioTotal+" o sal�rio excedente foi: "+calculo);
				}
				else 
				{
				salarioTotal=horasTrabalhadas*10.00;
			
				System.out.println("O seu sal�rio � de "+salarioTotal+" sem sal�rio excedente");
			
				}
			
			}
			else
			{
				System.out.println("Valor digitado inv�lido");
			}
			
		}
}
