package listaExPOO;

import java.util.Scanner;

public class teste1 {
	public static void main(String[] args) 
	{
		Cliente cliente1 = new Cliente();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		cliente1.nome=teclado.next().toUpperCase();
		System.out.println("Digite de acordo com seu g�nero M-masculino, F-feminino e O-outros:");
		cliente1.genero=teclado.next().toUpperCase().charAt(0);
		System.out.println("Qual o ano do seu nascimento:");
		cliente1.anoNascimento=teclado.nextInt();
		System.out.println("O seu cpf:");
		cliente1.cpf=teclado.next();
		System.out.println("Regi�o onde mora:");
		cliente1.regiao=teclado.next().toUpperCase();
	
		cliente1.meninoMenina(cliente1.genero);
		cliente1.retornaIdade(2020);
		System.out.println(cliente1.nome+", a sua idade:"+cliente1.idade+" com o cpf: "+cliente1.cpf);
		System.out.println("Mora na Regi�o de: "+cliente1.regiao);
		System.out.println("Digite [C]-cart�o [D]-dinheiro");
		System.out.println("Digite a forma de pagamento:");
		cliente1.tipoPagamento=teclado.next().toUpperCase().charAt(0);
		cliente1.retornarPagamento(cliente1.tipoPagamento);
		
	}

}
