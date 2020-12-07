package Lista1ex;

import java.util.Scanner;

public class ex8 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		/*
		 *O custo ao consumidor de um carro novo é a 
		 *soma do custo de fábrica com a percentagem do 
		 *distribuidor e dos impostos (aplicados ao custo de fábrica). 
		 *Supondo que a percentagem do distribuidor seja de 28% 
		 *e os impostos de 45%, escrever um sistema que leia o 
		 *custo de fábrica de um carro e escreva o custo ao consumidor. 
		 */
		
		double custodeFabrica,custoConsumidor;
		
		System.out.println("Digite o custo de fábrica do carro:");
		custodeFabrica=leia.nextDouble();
		
		custoConsumidor=custodeFabrica/(0.45+0.28);
		
		System.out.println("O custo ao consumidor:"+custoConsumidor);
		
		
		
		
		
		
	}

}
