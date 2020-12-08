package lista2ex;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		/*
		 *  Elabore um sistema que dada a idade de um 
		 *  nadador classifique-o em uma das seguintes categorias:
		Infantil A = 5 a 7 anos
		Infantil B = 8 a 11 anos
		Juvenil A = 12 a 13 anos
		Juvenil B = 14 a 17 anos
		Adultos = Maiores de 18 anos
		 */
		int idade;
		System.out.println("Digite a idade do nadador:");
		idade=ler.nextInt();
		if(idade<=0)
		{
			System.out.println("Idade Inválida");
		}
		else if(idade>0 && idade<=4)
		{
			System.out.println("Não classificado");
		}
		else if(idade>=5 && idade<=7)
		{
			System.out.println("Infantil A");
		}
		else if(idade>=8 && idade<=11)
		{
			System.out.println("Infantil B");
		}
		else if(idade>=12 && idade<=13)
		{
			System.out.println("Juvenil A");
		}
		else if(idade>=14 && idade<=17)
		{
			System.out.println("Juvenil B");
		}
		else if(idade>=18)
		{
			System.out.println("Adultos");
		}
	}
}
