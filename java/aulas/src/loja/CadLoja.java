package loja;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class CadLoja {
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		char menu, genero,opcao='S';
		//String produto[]={"Batom","perfume","shampoo","condicionador","base","delineador","Lápis de olho","primer","sombra paleta","corretivo"};
		//int precoUnitarios[] = {14,140,11,9,18,14,13,16,70,22};	
		final int qtdeProduto=10;
		char op;
		
	do 
	{
		linha();
		System.out.println();
		System.out.println("                                 UBULTICÁRIO");
		System.out.println("                    Aqueles produtinhos que te fazem mais feliz!");
		linha();
		System.out.println();
		System.out.println("                  Digite de acordo com o comando ");
		System.out.println("                     [1] - COMPRAR PRODUTOS");
		System.out.println("                     [2] - GERENCIAR ESTOQUE");
		System.out.println("                     [3] - SAIR");
		System.out.println("                     DIGITE O COMANDO: ");
		menu=ler.next().charAt(0);
		linha();
		System.out.println();
		if(menu=='1')
		{
		System.out.println("Por favor, se cadastre antes de comprar");
		System.out.println("Informe seu nome: ");
		String nome=ler.next().toUpperCase();
		System.out.println("Digite o genero que você se identifica como: [M]-Masculino [F]-Feminino [X]-Outros :");
		genero=ler.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano do seu nascimento:");
		int anoNascimento = ler.nextInt();
		System.out.println("Digite seu CPF:");
		String cpf=ler.next();
		Cliente cliente = new Cliente(nome,genero,anoNascimento,cpf);
		cliente.voltaIdade(anoNascimento); 
		System.out.println(cliente.voltaGenero(genero));
		System.out.println(cliente.getNome());
		linha();
		System.out.println();
		List<Produto> prodlista = new ArrayList<>();
		
		prodlista.add(new Produto("Batom","UIA001",14,qtdeProduto));
		prodlista.add(new Produto("Perfume","UIA002",140,qtdeProduto));
		prodlista.add(new Produto("Shampoo","UIA003",11,qtdeProduto));
		prodlista.add(new Produto("Condicionador","UIA004",9,qtdeProduto));
		prodlista.add(new Produto("Base","UIA005",18,qtdeProduto));
		prodlista.add(new Produto("Delineador","UIA006",14,qtdeProduto));
		prodlista.add(new Produto("Lápis de olho","UIA007",13,qtdeProduto));
		prodlista.add(new Produto("Primer","UIA008",16,qtdeProduto));
		prodlista.add(new Produto("Sombra Paleta","UIA009",70,qtdeProduto));
		prodlista.add(new Produto("Corretivo","UIA010",22,qtdeProduto));
		
		System.out.println();
		System.out.println("                  PRODUTOS PARA COMPRA");
		System.out.println("CODIGO\tPRODUTO\t\t\t\tQTDE/ESTOQUE\t\t\tVALOR UNITARIO");
		
		for(Produto prods : prodlista)
		{
			System.out.println(prods.getCodigo()+" ||\t"+prods.getNomeProduto()+"\t       ||\t\t"+prods.getQtdeProdutoEstoque()+" ||\t\t\t"+prods.getPrecoUnitario()+" R$");
		}
		
		System.out.println("Digite o codigo do produto desejado:");
		String codigo=ler.next().toUpperCase();
		System.out.println();
		for (Produto visao : prodlista) 
		{
			if(codigo.equals(visao.getCodigo())) 
			{
				System.out.println("Verificando produto...");
				System.out.println("Só 1 minuto");
				System.out.println();
				System.out.println("O produto escolhido:"+visao.getNomeProduto());
				System.out.println();
				System.out.println("Qual a quantidade que deseja do produto?");
				System.out.println("Digite a quantidade desejada aqui:");
				int qtdeDeseja=ler.nextInt();
				visao.testarEstoque(qtdeDeseja);
				visao.tiraEstoque(qtdeDeseja);
				System.out.println("O que sobrou em nosso estoque sobre este item: "+visao.getQtdeProdutoEstoque());
				System.out.println();
				System.out.println("Emitindo nota fiscal...");
				System.out.println();
				System.out.println("                   NOTA FISCAL");
				visao.venda(qtdeDeseja);
			}
		}
		
		System.out.println("Deseja continuar S/N?");
		opcao=ler.next().toUpperCase().charAt(0);
		}
		else if(menu=='2')
		{
			System.out.println("WIP");
			System.out.println("Deseja continuar S/N?");
			opcao=ler.next().toUpperCase().charAt(0);
		}
		else if(menu=='3')
		{
			opcao='N';
			break;
		}
	}while(opcao=='S');
	
	System.out.println("Volte sempre, adoramos sua visita!!!");

	}

	public static void linha()
	{
		int valor = 80;
		for(int x=0;x<valor;x++) {
			System.out.print("=");
		}
	}
	
}
