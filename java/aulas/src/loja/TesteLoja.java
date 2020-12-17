package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteLoja {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		//usar uma interface
		List<Produto> prodlista = new ArrayList<>();
		
		prodlista.add(new Produto("Batom","UIA-001",14));
		prodlista.add(new Produto("Perfume","UIA-002",140));
		prodlista.add(new Produto("Shampoo","UIA-003",11));
		prodlista.add(new Produto("Condicionador","UIA-004",9));
		prodlista.add(new Produto("Base","UIA-005",18));
		prodlista.add(new Produto("Delineador","UIA-006",14));
		prodlista.add(new Produto("Lápis de olho","UIA-007",13));
		prodlista.add(new Produto("Primer","UIA-008",16));
		prodlista.add(new Produto("Sombra Paleta","UIA-009",70));
		prodlista.add(new Produto("Corretivo","UIA-010",22));
		
		System.out.println("PRODUTOS PARA COMPRA");
		System.out.println("CODIGO\t\tPRODUTO\t\t\tVALOR UNITARIO");
		for (Produto visao : prodlista) 
		{
			System.out.println(visao.getCodigo()+"\t"+visao.getNomeProduto()+"\t\t\t"+visao.getPrecoUnitario());
		}
		System.out.println("Digite o codigo do produto desejado:");
		String codigo=teclado.next().toUpperCase();
		
		System.out.println("O produto escolhido:"+prodlista.indexOf(codigo));
		
		
	}

}
