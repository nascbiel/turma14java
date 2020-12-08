package lista2ex;

import java.util.Scanner;

public class ex2 {
		public static void main(String[] args)
		{
			Scanner ler = new Scanner(System.in);
			
			/*
			 * Elabore um sistema que leia as variáveis C e N, 
			 * respectivamente código e número de horas trabalhadas 
			 * de um operário. E calcule o salário sabendo-se que 
			 * ele ganha R$ 10,00 por hora. Quando o número de horas 
			 * exceder a 50 calcule o excesso de pagamento armazenando-o 
			 * na variável E, caso contrário zerar tal variável. 
			 * A hora excedente de trabalho vale R$ 20,00. No final do 
			 * processamento imprimir o salário total e o salário excedente.
			 */
			
			int codigo, horasTrabalhadas;
			double calculo,salarioTotal;
			System.out.println("Digite o código: ");
			codigo = ler.nextInt();
			System.out.println("Digite as horas trabalhadas: ");
			horasTrabalhadas = ler.nextInt();
			if(horasTrabalhadas>=0)
			{
				if(horasTrabalhadas>50)
				{
				calculo=(horasTrabalhadas-50)*20.00;
				salarioTotal=50*10.00+calculo;
				System.out.println("O salario total é "+salarioTotal+" o salário excedente foi: "+calculo);
				}
				else 
				{
				salarioTotal=horasTrabalhadas*10.00;
			
				System.out.println("O seu salário é de "+salarioTotal+" sem salário excedente");
			
				}
			
			}
			else
			{
				System.out.println("Valor digitado inválido");
			}
			
		}
}
