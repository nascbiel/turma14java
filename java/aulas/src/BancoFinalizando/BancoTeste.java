package BancoFinalizando;

import java.util.Scanner;

public class BancoTeste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		char op;
		char saida = 0;
		int numeroConta=0; 
		int debCred;
		double credito = 0, creditoTotal = 0, debito = 0, debitoTotal = 0;
		
		do{
			
			System.out.println("\n");
			System.out.println("                    ██████████████████████████████████████████");
			System.out.println("                    █         BEM VINDO AO BANCO-G8          █");
			System.out.println("                    █         AQUI SEU DINHEIRO RENDE        █");
			System.out.println("                    █                                        █");
			System.out.println("                    █                                        █");
			System.out.println("                    █          SERVIÇOS DISPONÍVEIS          █");
			System.out.println("                    █   [1] - ABERTURA DE CONTA              █");
			System.out.println("                    █   [2] - ACESSO A UMA CONTA EXISTENTE   █");
			System.out.println("                    █   [3] - SAIR                           █");
			System.out.println("                    █                                        █");
			System.out.println("                    ██████████████████████████████████████████");
			System.out.print("\n                              QUAL OPÇÃO ESCOLHIDA?   ");
			op = leia.next().charAt(0);
			
			switch(op) {
			
				case '1':
					
					System.out.println("                    ██████████████████████████████████████████"); 
					System.out.println("                    █										 █");
					System.out.println("                    █           CONTAS DISPONÍVEIS           █");
					System.out.println("                    █   [1] - CONTA POUPANÇA                 █");
					System.out.println("                    █   [2] - CONTA CORRENTE                 █");
					System.out.println("                    █   [3] - CONTA ESPECIAL                 █");
					System.out.println("                    █   [4] - CONTA EMPRESA                  █");
					System.out.println("                    █   [5] - CONTA UNIVERSITÁRIA            █");
					System.out.println("                    █                                        █");
					System.out.println("                    ██████████████████████████████████████████");
					System.out.print("\n                              QUAL OPÇÃO ESCOLHIDA?   ");
					char opconta = leia.next().charAt(0);
					numeroConta++;
					
					switch (opconta){
					
						case '1':
							movimentacaoPoupanca();
						break;
						
						
						case '2':
							movimentacaoCorrente();
							break;
							
							
						case '3':
							movimentacaoEspecial();
							break;
							
							
						case '4':
							movimentacaoEmpresa();
							break;
							
							
						case '5':
							movimentacaoUniversitaria();
							break;
					}
					break;

				case '2':
					System.out.println("Work in Progress");
					break;
					
					
				case '3':
					System.out.println("Continuar [S][N]?");
					saida = leia.next().toUpperCase().charAt(0);
					if (saida == 'N') {
						break;
					}
			} 	
				
	} while(saida == 'S');
  }
	
	
	
	//FUNÇÃO 10 MOVIMENTOS POUPANCA
	static void movimentacaoPoupanca() {
		
		int debCred;
		double credito = 0, creditoTotal = 0, debito = 0, debitoTotal = 0;
		Scanner leia = new Scanner(System.in);
		int numeroConta=0; 
		numeroConta++;
		
		System.out.println("Digite o seu CPF:");
		String cpfConta = leia.next();
		System.out.println("Digite a data de aniversario da conta: ");
		int dataAniversario = leia.nextInt();
		ContaPoupanca poupanca = new ContaPoupanca(numeroConta, cpfConta, dataAniversario);
		
		for(int x = 0; x < 10; x++) {
			System.out.printf("Dia %d \n", x+1);
			System.out.println("[1] - CRÉDITO\n[2] - DÉBITO");
			System.out.println("QUAL A OPÇÃO DESEJADA?");
			debCred = leia.nextInt();
			
			if(debCred == 1) {
				System.out.println("QUAL O VALOR?");
				credito = leia.nextDouble();
				poupanca.credito(credito);
			}
			
			else if(debCred == 2) {
				System.out.println("QUAL O VALOR?");
				debito = leia.nextDouble();
				poupanca.debito(debito);
			}
			
		}
		
		System.out.println("Qual o dia de hoje?");
		int diaDeHoje = leia.nextInt();
		poupanca.setDataAniversarioConta(dataAniversario);

		if(dataAniversario != diaDeHoje) {
			System.out.println("Não houveram alterações na conta!");	
		}
		
		else {
			poupanca.correcaoPoupanca(diaDeHoje);
		}
	}
	//FIM FUNÇÃO 10 MOVIMENTOS POUPANCA
	
	//FUNÇÃO 10 MOVIMENTOS CORRENTE
	static void movimentacaoCorrente() {
		
		int debCred;
		double credito = 0, creditoTotal = 0, debito = 0, debitoTotal = 0;
		Scanner leia = new Scanner(System.in);
		int talaoDeCheque = 3;
		int numeroConta = 0;
		
		System.out.println("Digite o seu CPF:");
		String cpfConta = leia.next();
		
		
		ContaCorrente corrente = new ContaCorrente(numeroConta, talaoDeCheque);
		
		
		for(int x = 0; x < 10; x++) {
			System.out.printf("Dia %d \n", x+1);
			System.out.println("[1] - CRÉDITO\n[2] - DÉBITO");
			System.out.println("QUAL A OPÇÃO DESEJADA?");
			debCred = leia.nextInt();
			
			if(debCred == 1) {
				System.out.println("QUAL O VALOR?");
				credito = leia.nextDouble();
				corrente.credito(credito);
			}
			
			else if(debCred == 2) {
				System.out.println("QUAL O VALOR?");
				debito = leia.nextDouble();
				corrente.debito(debito);
			}
			
		}
		corrente.talao(talaoDeCheque, 3);
		
		
	}
	//FIM FUNÇÃO 10 MOVIMENTOS CORRENTE
	
	//FUNÇÃO 10 MOVIMENTOS ESPECIAL
		static void movimentacaoEspecial() {
			
			int debCred;
			double credito = 0, creditoTotal = 0, debito = 0, debitoTotal = 0;
			Scanner leia = new Scanner(System.in);
			int numeroConta = 0;
			
			System.out.println("Digite o seu CPF:");
			String cpfConta = leia.next();
			
			ContaEspecial especial = new ContaEspecial(numeroConta, 20000);
			especial.setValorLimite(20000);
			
			for(int x = 0; x < 10; x++) {
				System.out.printf("Dia %d \n", x+1);
				System.out.println("[1] - CRÉDITO\n[2] - DÉBITO");
				System.out.println("QUAL A OPÇÃO DESEJADA?");
				debCred = leia.nextInt();
				
				if(debCred == 1) {
					System.out.println("QUAL O VALOR?");
					credito = leia.nextDouble();
					especial.credito(credito);
					especial.testarSaldo(credito);
					especial.registraLimite();
					especial.devolverLimite();
					
				}
				
				else if(debCred == 2) {
					System.out.println("QUAL O VALOR?");
					debito = leia.nextDouble();
					especial.debito(debito);
					especial.testarSaldo(debito);
					especial.registraLimite();
					especial.devolverLimite();
				}
				
			}	
		}
		//FIM FUNÇÃO 10 MOVIMENTOS ESPECIAL
		
		//FUNÇÃO 10 MOVIMENTOS EMPRESA
		static void movimentacaoEmpresa() {
			
			int debCred;
			double credito = 0, debito = 0, saldo=0;
			Scanner leia = new Scanner(System.in);
			int numeroConta = 0;
			
			System.out.println("Digite o seu CPF:");
			String cpfConta = leia.next();
			
			ContaEmpresa empresa = new ContaEmpresa(numeroConta, 20000);
			ContaCorrente donoEmpresa = new ContaCorrente(numeroConta, 20);
			
			for(int x = 0; x < 10; x++) {
				System.out.printf("Dia %d \n", x+1);
				System.out.println("[1] - CRÉDITO\n[2] - DÉBITO");
				System.out.println("QUAL A OPÇÃO DESEJADA?");
				debCred = leia.nextInt();
				
				if(debCred == 1) {
					System.out.println("QUAL O VALOR?");
					credito = leia.nextDouble();
					empresa.credito(credito);
					empresa.emprestar(credito);
				}
				
				else if(debCred == 2) {
					System.out.println("QUAL O VALOR?");
					debito = leia.nextDouble();
					empresa.debito(debito);
					empresa.emprestar(debito);
				}
			}	
		}
		//FIM FUNÇÃO 10 MOVIMENTOS EMPRESA
				
		//FUNÇÃO 10 MOVIMENTOS UNIVERSITARIA
		static void movimentacaoUniversitaria() {			
			int debCred;
			double credito = 0, creditoTotal = 0, debito = 0, debitoTotal = 0;
			Scanner leia = new Scanner(System.in);
			int numeroConta = 0;
						
			System.out.println("Digite o seu CPF:");
			String cpfConta = leia.next();
						
			ContaUniversitaria universitaria = new ContaUniversitaria(numeroConta, 10000);
						
			for(int x = 0; x < 10; x++) {
				System.out.printf("Dia %d \n", x+1);
				System.out.println("[1] - CRÉDITO\n[2] - DÉBITO");
				System.out.println("QUAL A OPÇÃO DESEJADA?");
				debCred = leia.nextInt();
							
				if(debCred == 1) {
					System.out.println("QUAL O VALOR?");
					credito = leia.nextDouble();
					universitaria.credito(credito);	
					universitaria.emprestar(credito);
				}
						
				else if(debCred == 2) {
					System.out.println("QUAL O VALOR?");
					debito = leia.nextDouble();
					universitaria.debito(debito);
					universitaria.emprestar(debito);
				}
			}
		}
		//FIM FUNÇÃO 10 MOVIMENTOS UNIVERSITARIA
	
}