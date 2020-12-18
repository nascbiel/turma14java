package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteLoja {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		//usar uma interface
		
		//String produto[]={"Batom","perfume","shampoo","condicionador","base","delineador","Lápis de olho","primer","sombra paleta","corretivo"};
		//int precoUnitarios[] = {14,140,11,9,18,14,13,16,70,22};	
		
		int qtdeEstoque = 10;
		
		List<Produto> prodlista = new ArrayList<>();
		
		prodlista.add(new Produto("Batom","UIA-001",14,qtdeEstoque));
		prodlista.add(new Produto("Perfume","UIA-002",140,qtdeEstoque));
		prodlista.add(new Produto("Shampoo","UIA-003",11,qtdeEstoque));
		prodlista.add(new Produto("Condicionador","UIA-004",9,qtdeEstoque));
		prodlista.add(new Produto("Base","UIA-005",18,qtdeEstoque));
		prodlista.add(new Produto("Delineador","UIA-006",14,qtdeEstoque));
		prodlista.add(new Produto("Lápis de olho","UIA-007",13,qtdeEstoque));
		prodlista.add(new Produto("Primer","UIA-008",16,qtdeEstoque));
		prodlista.add(new Produto("Sombra Paleta","UIA-009",70,qtdeEstoque));
		prodlista.add(new Produto("Corretivo","UIA-010",22,qtdeEstoque));
		
		System.out.println("PRODUTOS PARA COMPRA");
		System.out.println("CODIGO\t\tPRODUTO\t\tQTDE/ESTOQUE\tVALOR UNITARIO");
		for (Produto visao : prodlista) 
		{
			System.out.println(visao.getCodigo()+"\t"+visao.getNomeProduto()+"\t\t\t"+visao.getQtdeProdutoEstoque()+"\t"+visao.getPrecoUnitario());
			
		}
		System.out.println("Digite o codigo do produto desejado:");
		String codigo=teclado.next().toUpperCase();
		
		System.out.println("O produto escolhido:"+prodlista.indexOf(codigo));
		
	}

}
