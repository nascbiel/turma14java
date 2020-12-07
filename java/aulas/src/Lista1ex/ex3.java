package Lista1ex;

import java.util.Scanner;

public class ex3 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		/*
		 * 3. Faça um sistema que leia o tempo de duração 
		 * de um evento em uma fábrica expressa em segundos 
		 * e mostre-o expresso em horas, minutos e segundos.
		 */
		
		int tempoDuracao;
		
		System.out.println("Digite o tempo de duração do evento em segundos: ");
		tempoDuracao = leia.nextInt();
		
		System.out.println(tempoDuracao/3600+" horas,"+tempoDuracao/60+" minutos e "+(tempoDuracao%3600)%60+" segundos");
		
		
	}

}
