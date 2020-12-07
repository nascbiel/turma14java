package Lista1ex;

import java.util.Scanner;

public class ex2 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		/*
		 * 2. Faça um sistema que leia a idade de uma 
		 * pessoa expressa em dias e mostre-a expressa em anos, 
		 * meses e dias. 
		 */
		
		//variaveis
			int tempoDias;
				
				
			System.out.println("Digite o tempo em dias: ");
			tempoDias = leia.nextInt();
				
			System.out.println(tempoDias/365+" ano(s)");
			System.out.println((tempoDias%365)/30+" meses");
			System.out.println((tempoDias%365)%30+" dias");
		
		
	}
	

}
