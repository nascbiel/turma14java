package lista2ex;

import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		/*
		 * Desenvolva um sistema em que:
		Leia 4 (quatro) números;
		Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for >= 1000, 
		imprima-o e finalize;
		Caso contrário, imprima os valores lidos e seus respectivos 
		quadrados.
		 */
		
		double a,b,c,d;
		
		System.out.println("Digite o valor de 1: ");
		a=teclado.nextInt();
		System.out.println("Digite o valor de 2: ");
		b=teclado.nextInt();
		System.out.println("Digite o valor de 3: ");
		c=teclado.nextInt();
		System.out.println("Digite o valor de 4: ");
		d=teclado.nextInt();
		
		a=Math.pow(a, 2);
		b=Math.pow(b, 2);
		c=Math.pow(c, 2);
		d=Math.pow(d, 2);
		
		if(c>=1000) {
			System.out.println("O resultado de 3 é "+c);
		}
		else {
			System.out.println("O resultado de 1 é "+a);
			System.out.println("O resultado de 2 é "+b);
			System.out.println("O resultado de 3 é "+c);
			System.out.println("O resultado de 4 é "+d);
		}
		
	}

}
