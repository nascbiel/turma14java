package lista2ex;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		/*
		 *  A Secretaria de Meio Ambiente que controla o índice 
		 *  de poluição mantém 3 grupos de indústrias que são altamente 
		 *  poluentes do meio ambiente. O índice de poluição aceitável 
		 *  varia de 0,05 até 0,25. Se o índice sobe para 0,3 
		 *  as indústrias do 1º grupo são intimadas a suspenderem suas 
		 *  atividades, se o índice crescer para 0,4 as industrias 
		 *  do 1º e 2º grupo são intimadas a suspenderem suas atividades, 
		 *  se o índice atingir 0,5 todos os grupos devem ser notificados 
		 *  a paralisarem suas atividades. Faça um sistema que leia o índice 
		 *  de poluição medido e emita a notificação adequada aos diferentes 
		 *  grupos de empresas.
		 */
		
		double indicePoluicao;
		
		System.out.println("Digite o Índice de poluição em decimal");
		System.out.println("exemplo(0,2):");
		indicePoluicao=leia.nextDouble();
		
		if(indicePoluicao>0.05 && indicePoluicao<=0.25)
		{
			System.out.println("Tudo normal");
		}
		else if(indicePoluicao>0.25 && indicePoluicao<=0.3)
		{
		//as indústrias do 1º grupo são intimadas a suspenderem suas atividades
		System.out.println("Indústrias do 1º grupo, suspender suas atividades");
		}
		else if(indicePoluicao>0.3 && indicePoluicao<=0.4)
		{
		//as industrias 1º e 2º grupo são intimadas a suspenderem suas atividades
		System.out.println("Indústrias do 1º e 2º grupo, suspender suas atividades");
		}
		else if(indicePoluicao>0.4 && indicePoluicao<=0.5)
		{
		//se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades
		System.out.println("Indústrias todos os grupos, suspender suas atividades");
		}
		else
		{
			System.out.println("Indice digitado errado");
		}
	}
}
