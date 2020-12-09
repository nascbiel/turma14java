package lista3ex;

import java.util.Scanner;

public class Ex2Enquanto {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		/*
		 * 2- Obtenha um número digitado pelo usuário e repita a 
		 * operação de multiplicar ele por três  (imprimindo o novo valor) 
		 * até que ele seja maior do que 100. Ex.: se o usuário digita 5,  
		 * deveremos observar na tela a seguinte sequência: 5 15 45 135.
		 */
		
		int digito;
		
		System.out.println("Digite um número:");
		digito=ler.nextInt();
		
		while(digito<=100)
		{			
			digito=digito*3;
			System.out.println("multiplicado por 3: "+digito);
		}
		
		
	}
}
