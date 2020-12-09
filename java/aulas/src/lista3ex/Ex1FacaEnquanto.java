package lista3ex;

public class Ex1FacaEnquanto {
	public static void main(String[] args) 
	{
		/*
		 * 1- Faça um programa que mostre uma contagem 
		 * na tela de 233 a 456, só que contando de 3 em 3 
		 * quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
		 */
		int cont=233;
		do{
			cont++;
			if(cont>=300 && cont<=400)
			{
				cont=cont+3;
			}
			else 
			{
				cont=cont+5;
			}
			System.out.println(cont);
		}while(cont<=456);
		
	}
}
