package listaExerciciosHerancaEPolimorfismo;

import java.util.ArrayList;
import java.util.Collection;

public class ex3 {
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
			
		
		}
}
