package Lista1ex;

import java.util.Scanner;

public class ex3 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		/*
		 * 3. Fa�a um sistema que leia o tempo de dura��o 
		 * de um evento em uma f�brica expressa em segundos 
		 * e mostre-o expresso em horas, minutos e segundos.
		 */
		
		int tempoDuracao;
		
		System.out.println("Digite o tempo de dura��o do evento em segundos: ");
		tempoDuracao = leia.nextInt();
		
		System.out.println(tempoDuracao/3600+" horas,"+tempoDuracao/60+" minutos e "+(tempoDuracao%3600)%60+" segundos");
		
		
	}

}
