package Lista1ex;

import java.util.Scanner;

public class ex6 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		/*
		 * Construa um programa em c que, 
		 * tendo como dados de entrada dois pontos
		 *  quaisquer no plano, P(x1, y1) e P(x2, y2),
		 *   escreva a distância entre eles. A fórmula 
		 *   que efetua tal cálculo é: d=v-------- 2		2
		 *   								(x2-x1) + (y2-y1)   
		 */
		
		int x1,y1,x2,y2;
		double d,resultadox,resultadoy;
		
		System.out.println("Digite o valor de x1: ");
		x1=leia.nextInt();
		System.out.println("Digite o valor de x2: ");
		x2=leia.nextInt();
		System.out.println("Digite o valor de y1: ");
		y1=leia.nextInt();
		System.out.println("Digite o valor de y2: ");
		y2=leia.nextInt();
		
		
		resultadox=Math.pow(x2-x1,2);
		resultadoy=Math.pow(y2-y1,2);
		d=Math.sqrt(resultadox+resultadoy);
		
		System.out.printf("A distância é: "+d);
		
		
		
	}

}
