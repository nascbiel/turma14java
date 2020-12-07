package desafioDosProgramadores;

import java.util.Scanner;
public class celsiusParaFahrenheint 
{
			public static void main(String args[]) 
			{
				Scanner leia = new Scanner(System.in);
				
				double celsius;
				
				System.out.println("Digite a temperatura em Celcius: ");
				celsius= leia.nextInt();
				
				//(0 °C × 9/5) + 32 = 32 °F

				System.out.println("A temperatura para F é: "+(celsius*(9/5)+32));
				
			}
		
}

