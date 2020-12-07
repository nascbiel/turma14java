package desafioDosProgramadores;

import java.util.Scanner;

public class fahrenheitParaCelsius {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		double temperaturaF,fahren;
		
		System.out.println("Digite a temperatura em Farenheint:");
		temperaturaF=leia.nextDouble();
		
		//(32 °F − 32) × 5/9 = 0 °C
		
		fahren=(5*(temperaturaF-32))/9;
		
		System.out.println("A temperatura para C é:"+fahren);
		
	}
}
