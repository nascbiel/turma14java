package lista3ex;

import java.util.Scanner;

public class Ex2Enquanto {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		/*
		 * 2- Obtenha um n�mero digitado pelo usu�rio e repita a 
		 * opera��o de multiplicar ele por tr�s  (imprimindo o novo valor) 
		 * at� que ele seja maior do que 100. Ex.: se o usu�rio digita 5,  
		 * deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.
		 */
		
		int digito;
		
		System.out.println("Digite um n�mero:");
		digito=ler.nextInt();
		
		while(digito<=100)
		{			
			digito=digito*3;
			System.out.println("multiplicado por 3: "+digito);
		}
		
		
	}
}
