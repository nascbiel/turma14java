package bancos;

import java.util.Scanner;

public class BancoTesteED {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		char op;//visivel em todo o programa - escopo
		char saida,debCred,simNao;
		int numeroConta=0; //escopo global
		double valorSolicitado;
		
		System.out.println("BANCO DO ED!!!");
		do
		{
			System.out.println("1 - Abertura de conta: ");
			System.out.println("2 - Acesso a uma conta existente: ");
			System.out.println("3 - Sair: ");
			op = leia.next().charAt(0);
			if (op == '1')
			{
				System.out.println("1 - Conta Poupança");
				System.out.println("2 - Conta Corrente");
				System.out.println("3 - Conta Especial");
				System.out.println("4 - Conta Empresa");
				System.out.println("5 - conta Universitaria");
				System.out.print("Digite o numero de sua opção: ");
				char opconta = leia.next().charAt(0);
				numeroConta++;
				System.out.println("Digite o seu CPF:");
				String cpfConta = leia.next();
				switch (opconta)
				{
					case '1':
					{
						System.out.println("Digite a data de aniversario da conta: ");
						int dataAniversario = leia.nextInt();
						contaPoupanca poupanca = new contaPoupanca(numeroConta,cpfConta,dataAniversario);
						System.out.println("Digite a data atual:");
						int dataAtual=leia.nextInt();
						poupanca.correcaoPoupanca(dataAtual);
						
						System.out.println("O SALDO ATUAL:"+poupanca.getSaldo());
						System.out.println("Deseja fazer transação de [C] - Credito / [D] - Debito ?");
						System.out.println("Digite o comando desejado:");
						debCred=leia.next().toUpperCase().charAt(0);
						System.out.println("Digite o valor solicitado:");
						valorSolicitado=leia.nextDouble();
						if(debCred=='C')
						{
							poupanca.credito(valorSolicitado);
						}
						else if(debCred=='D')
						{
							poupanca.debito(valorSolicitado);
						}
						System.out.println("O SALDO ATUAL:"+poupanca.getSaldo());
						System.out.println("Deseja continuar as transações?");
						System.out.println("[S] - para SIM");
						System.out.println("[N] - para NÃO");
						simNao=leia.next().toUpperCase().charAt(0);
					}
				break;	
				case '2':
				{
					System.out.println("conta corrente");
				}
				break;
				case '3':
				{
					ContaEspecial especial = new ContaEspecial(numeroConta,cpfConta,2000);
					
					System.out.println("O SALDO ATUAL:"+especial.getSaldo());
					System.out.println("Deseja fazer transação de [C] - Credito / [D] - Debito ?");
					System.out.println("Digite o comando desejado:");
					debCred=leia.next().toUpperCase().charAt(0);
					System.out.println("Digite o valor solicitado:");
					valorSolicitado=leia.nextDouble();
					if(debCred=='C')
					{
						especial.credito(valorSolicitado);
					}
					else if(debCred=='D')
					{
						especial.debito(valorSolicitado);
					}
					especial.testarSaldo(valorSolicitado);
					especial.registraLimite();
				}
				break;
				case '4':
				{
					ContaEmpresa empresa = new ContaEmpresa(numeroConta,10000);
					
					System.out.println("O SALDO ATUAL:"+empresa.getSaldo());
					System.out.println("Deseja fazer transação de [C] - Credito / [D] - Debito ?");
					System.out.println("Digite o comando desejado:");
					debCred=leia.next().toUpperCase().charAt(0);
					System.out.println("Digite o valor solicitado:");
					valorSolicitado=leia.nextDouble();
					if(debCred=='C')
					{
						empresa.credito(valorSolicitado);
					}
					else if(debCred=='D')
					{
						empresa.debito(valorSolicitado);
					}
					
					System.out.println("O SALDO ATUAL:"+empresa.getSaldo());
					System.out.println("O emprestimo da empresa é "+empresa.getEmprestimoEmpresa());
					System.out.println("Deseja acessar o emprestimo?");
					System.out.println("[S] para SIM   /   [N] para NÃO");
					System.out.println("Digite o comando desejado:");
					simNao=leia.next().toUpperCase().charAt(0);
					if(simNao=='S')
					{
						System.out.println("Digite o valor de emprestimo:");
						double valorEmprestimo=leia.nextDouble();
						empresa.emprestar(valorEmprestimo);
					}
					else if(simNao=='N')
					{
						System.out.println(empresa.getSaldo());
					}
					else {
						System.out.println("DIGITO INVÁLIDO");
					}
					
					System.out.println("Deseja continuar as transações?");
					System.out.println("[S] - para SIM");
					System.out.println("[N] - para NÃO");
					simNao=leia.next().toUpperCase().charAt(0);
					
				}
				case '5':
				{
					System.out.println("Conta universitária");
				}
				break;
			}
				
			}
			
			else if (op == '2')
			{
				System.out.println("wip");
			}
			
			else
			{
				
			}
			System.out.println("Continua S/N");
			saida = leia.next().toUpperCase().charAt(0);
			if (saida == 'N') {
				break;
			}
		
		} while(true);
				
	}	
}
