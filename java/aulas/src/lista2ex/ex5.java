package lista2ex;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		/*
		 *  A Secretaria de Meio Ambiente que controla o �ndice 
		 *  de polui��o mant�m 3 grupos de ind�strias que s�o altamente 
		 *  poluentes do meio ambiente. O �ndice de polui��o aceit�vel 
		 *  varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 
		 *  as ind�strias do 1� grupo s�o intimadas a suspenderem suas 
		 *  atividades, se o �ndice crescer para 0,4 as industrias 
		 *  do 1� e 2� grupo s�o intimadas a suspenderem suas atividades, 
		 *  se o �ndice atingir 0,5 todos os grupos devem ser notificados 
		 *  a paralisarem suas atividades. Fa�a um sistema que leia o �ndice 
		 *  de polui��o medido e emita a notifica��o adequada aos diferentes 
		 *  grupos de empresas.
		 */
		
		double indicePoluicao;
		
		System.out.println("Digite o �ndice de polui��o em decimal");
		System.out.println("exemplo(0,2):");
		indicePoluicao=leia.nextDouble();
		
		if(indicePoluicao>0.05 && indicePoluicao<=0.25)
		{
			System.out.println("Tudo normal");
		}
		else if(indicePoluicao>0.25 && indicePoluicao<=0.3)
		{
		//as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades
		System.out.println("Ind�strias do 1� grupo, suspender suas atividades");
		}
		else if(indicePoluicao>0.3 && indicePoluicao<=0.4)
		{
		//as industrias 1� e 2� grupo s�o intimadas a suspenderem suas atividades
		System.out.println("Ind�strias do 1� e 2� grupo, suspender suas atividades");
		}
		else if(indicePoluicao>0.4 && indicePoluicao<=0.5)
		{
		//se o �ndice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades
		System.out.println("Ind�strias todos os grupos, suspender suas atividades");
		}
		else
		{
			System.out.println("Indice digitado errado");
		}
	}
}
