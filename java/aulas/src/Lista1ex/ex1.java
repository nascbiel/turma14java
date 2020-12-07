package Lista1ex;

import java.util.Scanner;

public class ex1 {
	public static void main(String agrs[]) {
		Scanner leia = new Scanner(System.in); //instanciar - criar
		/*
		 * 1. Faça um sistema que leia a idade de 
		 * uma pessoa expressa em anos, meses e dias 
		 * e mostre-a expressa apenas em dias. 
		 */
		
		//variaveis
		int tempoDias,ano,mes,dia;
		
		
		System.out.println("Digite o ano do seu nascimento: ");
		ano = leia.nextInt();
		System.out.println("Digite o mes do seu nascimento: ");
		mes = leia.nextInt();
		System.out.println("Digite o dia do seu nascimento: ");
		dia = leia.nextInt();
		
		tempoDias =(ano*365)+(mes*30) + dia ;
		
		System.out.println("Você viveu "+tempoDias+" dias");
	
	}
	
}
