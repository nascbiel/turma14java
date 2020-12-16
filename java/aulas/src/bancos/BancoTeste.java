package bancos;

import java.util.Scanner;

public class BancoTeste {

	public static void main(String[] args) 
	{
		ContaEmpresa conta1 = new ContaEmpresa(1,10000.00);
		Scanner teclado = new Scanner(System.in);
		conta1.setCpf("555.333.888-22");
		char simNao = 0;
		
		
		conta1.credito(300);
		conta1.debito(200);
		System.out.println("O SALDO ATUAL:"+conta1.getSaldo());
		System.out.println("O emprestimo da empresa é "+conta1.getEmprestimoEmpresa());
		System.out.println("Deseja acessar o emprestimo?");
		System.out.println("[S] para SIM   /   [N] para NÃO");
		System.out.println("Digite o comando desejado:");
		simNao=teclado.next().toUpperCase().charAt(0);
		if(simNao=='S')
		{
			conta1.emprestar(200);
		}
		else if(simNao=='N')
		{
			System.out.println(conta1.getSaldo());
		}
		else {
			System.out.println("DIGITO INVÁLIDO");
		}
	}

}
