package bancos;

import java.util.Scanner;

public class BancoTeste {

	public static void main(String[] args) 
	{
		ContaEmpresa conta1 = new ContaEmpresa(1,10000.00);
		Scanner teclado = new Scanner(System.in);
		conta1.setCpf("555.333.888-22");
		char simNao = 0,debCred;
		double valorCredito=0.00;
		double valorDebito=0.00;
		double valorSolicitado=0.00;
		
		do {
			System.out.println("O SALDO ATUAL:"+conta1.getSaldo());
			System.out.println("Deseja fazer transação de [C] - Credito / [D] - Debito ?");
			System.out.println("Digite o comando desejado:");
			debCred=teclado.next().toUpperCase().charAt(0);
			System.out.println("Digite o valor solicitado:");
			valorSolicitado=teclado.nextDouble();
		
		if(debCred=='C')
		{
			conta1.credito(valorSolicitado);
		}
		else if(debCred=='D')
		{
			conta1.debito(valorSolicitado);
		}
		System.out.println("O SALDO ATUAL:"+conta1.getSaldo());
		System.out.println("O emprestimo da empresa é "+conta1.getEmprestimoEmpresa());
		System.out.println("Deseja acessar o emprestimo?");
		System.out.println("[S] para SIM   /   [N] para NÃO");
		System.out.println("Digite o comando desejado:");
		simNao=teclado.next().toUpperCase().charAt(0);
		if(simNao=='S')
		{
			System.out.println("Digite o valor de emprestimo:");
			double valorEmprestimo=teclado.nextDouble();
			conta1.emprestar(valorEmprestimo);
		}
		else if(simNao=='N')
		{
			System.out.println(conta1.getSaldo());
		}
		else {
			System.out.println("DIGITO INVÁLIDO");
		}
		
		System.out.println("Deseja continuar as transações?");
		System.out.println("[S] - para SIM");
		System.out.println("[N] - para NÃO");
		simNao=teclado.next().toUpperCase().charAt(0);
		}while(simNao=='S');
	}

}
