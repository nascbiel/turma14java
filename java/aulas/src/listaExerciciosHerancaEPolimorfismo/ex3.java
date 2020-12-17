package listaExerciciosHerancaEPolimorfismo;

import java.util.ArrayList;
import java.util.Collection;

public class ex3 {
	
	/*
	 * Crie uma um programa para trabalhar com estoque de uma loja, 
	 * o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, 
	 * o programa deverá atender as seguintes funcionalidades:
	 * Armazenar dados da List
		Atualizar dados da list.
	
	 * 
	 */
		public static void main(String[] args) {
			
			Collection<String> nomes = new ArrayList();
			
			nomes.add("spyke");
			nomes.add("Pe De Pano");
			nomes.add("Bob");
			
			System.out.println("Contém o nome Pe De Pano?"+nomes.contains("Pe De Pano"));
			System.out.println("Lista: "+nomes);
			System.out.println("Lista de nomes:"+nomes);
			nomes.remove("Pe De Pano");
			System.out.println("Contém o nome Pe De Pano?"+nomes.contains("Pe De Pano"));
			System.out.println("Lista de nomes:"+nomes);
			System.out.println("Lista vazia...");
			
		
		}
}
