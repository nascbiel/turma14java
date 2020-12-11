package banco;

import java.util.Random;
import java.util.Scanner;

public class BancoDemanda2 {
	public static void main(String[] args){
		
		int contaUm = 0, numeroConta, debCred;
		double saldo = 0.0, debito = 0.0, credito = 0.0, creditoTotal = 0.0, debitoTotal = 0.0;
		
		int conta [] = new int [40]; //contas individuais
		int tipoConta [] = new int [40]; //1-5
		String nome [] =  {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho",
				"Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","Fernanda Agapito","Fernanda Barbosa Ferraz",
				"Francisco José Pires","Gabriel Enrique Cabral Silva","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","Gilson Amorim de Matos","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
				"Heloisa Beatriz de Oliveira Costa","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão",
				"Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da Silva","Luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva",
				"Tiago dos Santos Martins","Verônica Navarro Almena","Vinicius Alves Miranda"};
		char sexo [] =  {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M','M'};
		int movimento [] = new int [10];
		char tipoMovimento [];
		double saldoConta [] = new double [40];
		Random randomico = new Random();
		char opcaoContinuar = 'A';

		
		do {
		
			int menu = menuPrincipal();
			Scanner ler = new Scanner(System.in);
			
			switch(menu) {
			
				case 1:
					//LENDO A CONTA, GERANDO NUMEROS DE 1 A 5 E APRESENTANDO MENSAGEM + NUMERO DA CONTA
					System.out.print("\nInsira o número da sua conta: ");
					numeroConta = ler.nextInt();
					
					for(int x = 0; x < 40; x++) {
						tipoConta[x] = (x+1);
						tipoConta[x] = randomico.nextInt(5)+1;	
					}
					
					
					
					if(numeroConta >=41) {
						System.out.println("Você não está cadastrado no banco.");
						break;
					}
					else {
						System.out.println("\n");
						genero(numeroConta-1);
						System.out.println("\n" + "Sua conta: " + numeroConta + "\n");
					}
					//FIM
					
					
					//CHECHANDO O TIPO DE CONTA E FAZENDO OPERAÇÕES
					if(tipoConta[numeroConta] == 1) {
						linha();
						System.out.println("\nSUA CONTA É: CONTA POUPANÇA");
						System.out.println("\n");
						
						
						
						for(int x = 0; x < 10; x++) {
							System.out.printf("Dia %d \n", x+1);
							System.out.println("[1] - CRÉDITO\n[2] - DÉBITO");
							System.out.println("QUAL A OPÇÃO DESEJADA?");
							debCred = ler.nextInt();
							if(debCred == 1) {
								System.out.println("QUAL O VALOR?");
								credito = ler.nextDouble();
								creditoTotal += credito;
								System.out.println("SALDO TOTAL: " + creditoTotal);
							}
							else if(debCred == 2) {
								System.out.println("QUAL O VALOR?");
								debito = ler.nextDouble();
								debitoTotal = creditoTotal - debito;
								if(debitoTotal < 0) {
									System.out.println("\nTRANSAÇÃO INDISPONÍVEL.\n");
									
								}
								else {
								creditoTotal -= debito;
								System.out.println("SALDO TOTAL: " + creditoTotal);
								}
							}
							else {
								System.out.println("VALOR INVÁLIDO.");
							}
							
							System.out.println("Deseja continuar [S][N]?");
							opcaoContinuar = ler.next().toUpperCase().charAt(0);
							
							if(opcaoContinuar == 'S') {
								
							}
							else {
								System.out.println("Volte sempre! :D");
								break;
							}
							
						}
						
						
						
						
						
						
						break;
					}
					else if(tipoConta[numeroConta] == 2) {
						linha();
						System.out.println("\nSUA CONTA É: CONTA CORRENTE");
						System.out.println("\n");
						
						
						
						for(int x = 0; x < 10; x++) {
							System.out.printf("Dia %d \n", x+1);
							System.out.println("[1] - CRÉDITO\n[2] - DÉBITO");
							System.out.println("QUAL A OPÇÃO DESEJADA?");
							debCred = ler.nextInt();
							if(debCred == 1) {
								System.out.println("QUAL O VALOR?");
								credito = ler.nextDouble();
								creditoTotal += credito;
								System.out.println("SALDO TOTAL: " + creditoTotal);
							}
							else if(debCred == 2) {
								System.out.println("QUAL O VALOR?");
								debito = ler.nextDouble();
								debitoTotal = creditoTotal - debito;
								if(debitoTotal < 0) {
									System.out.println("\nTRANSAÇÃO INDISPONÍVEL.\n");
									
								}
								else {
								creditoTotal -= debito;
								System.out.println("SALDO TOTAL: " + creditoTotal);
								}
							}
							else {
								System.out.println("VALOR INVÁLIDO.");
							}
							
							System.out.println("Deseja continuar [S][N]?");
							opcaoContinuar = ler.next().toUpperCase().charAt(0);
							
							if(opcaoContinuar == 'S') {
								
							}
							else {
								System.out.println("Volte sempre! :D");
								break;
							}
							
							
							
						}
						
						
						
						break;
					}
					else if(tipoConta[numeroConta] == 3) {
						linha();
						System.out.println("\nSUA CONTA É: CONTA ESPECIAL");
						System.out.println("\n");
						
						
						
						for(int x = 0; x < 10; x++) {
							System.out.printf("Dia %d \n", x+1);
							System.out.println("[1] - CRÉDITO\n[2] - DÉBITO");
							System.out.println("QUAL A OPÇÃO DESEJADA?");
							debCred = ler.nextInt();
							if(debCred == 1) {
								System.out.println("QUAL O VALOR?");
								credito = ler.nextDouble();
								creditoTotal += credito;
								System.out.println("SALDO TOTAL: " + creditoTotal);
							}
							else if(debCred == 2) {
								System.out.println("QUAL O VALOR?");
								debito = ler.nextDouble();
								debitoTotal = creditoTotal - debito;
								if(debitoTotal < 0) {
									System.out.println("\nTRANSAÇÃO INDISPONÍVEL.\n");
									
								}
								else {
								creditoTotal -= debito;
								System.out.println("SALDO TOTAL: " + creditoTotal);
								}
							}
							else {
								System.out.println("VALOR INVÁLIDO.");
							}
							
							
							System.out.println("Deseja continuar [S][N]?");
							opcaoContinuar = ler.next().toUpperCase().charAt(0);
							
							if(opcaoContinuar == 'S') {
								
							}
							else {
								
								System.out.println("Volte sempre! :D");
								break;
							}
							
						}
	
						break;
						
					}
					else if(tipoConta[numeroConta] == 4) {
						linha();
						System.out.println("\nSUA CONTA É: CONTA EMPRESARIAL");
						System.out.println("\n");
						
						
						
						for(int x = 0; x < 10; x++) {
							System.out.printf("Dia %d \n", x+1);
							System.out.println("[1] - CRÉDITO\n[2] - DÉBITO");
							System.out.println("QUAL A OPÇÃO DESEJADA?");
							debCred = ler.nextInt();
							if(debCred == 1) {
								System.out.println("QUAL O VALOR?");
								credito = ler.nextDouble();
								creditoTotal += credito;
								System.out.println("SALDO TOTAL: " + creditoTotal);
							}
							else if(debCred == 2) {
								System.out.println("QUAL O VALOR?");
								debito = ler.nextDouble();
								debitoTotal = creditoTotal - debito;
								if(debitoTotal < 0) {
									System.out.println("\nTRANSAÇÃO INDISPONÍVEL.\n");
									
								}
								else {
								creditoTotal -= debito;
								System.out.println("SALDO TOTAL: " + creditoTotal);
								}
							}
							else {
								System.out.println("VALOR INVÁLIDO.");
							}
							
							System.out.println("Deseja continuar [S][N]?");
							opcaoContinuar = ler.next().toUpperCase().charAt(0);
							
							if(opcaoContinuar == 'S') {
								
							}
							else {
								
								System.out.println("Volte sempre! :D");
								break;
							}
							
						}
						
						
						
						break;
					}
					else if(tipoConta[numeroConta] == 5) {
						linha();
						System.out.println("\nSUA CONTA É: CONTA UNIVERSITÁRIA");
						System.out.println("\n");
						
						
						
						for(int x = 0; x < 10; x++) {
							System.out.printf("Dia %d \n", x+1);
							System.out.println("[1] - CRÉDITO\n[2] - DÉBITO");
							System.out.println("QUAL A OPÇÃO DESEJADA?");
							debCred = ler.nextInt();
							if(debCred == 1) {
								System.out.println("QUAL O VALOR?");
								credito = ler.nextDouble();
								creditoTotal += credito;
								System.out.println("SALDO TOTAL: " + creditoTotal);
							}
							else if(debCred == 2) {
								System.out.println("QUAL O VALOR?");
								debito = ler.nextDouble();
								debitoTotal = creditoTotal - debito;
								if(debitoTotal < 0) {
									System.out.println("\nTRANSAÇÃO INDISPONÍVEL.\n");
									
								}
								else {
								creditoTotal -= debito;
								System.out.println("SALDO TOTAL: " + creditoTotal);
								}
							}
							else {
								System.out.println("VALOR INVÁLIDO.");
							}
							
							System.out.println("Deseja continuar [S][N]?");
							opcaoContinuar = ler.next().toUpperCase().charAt(0);
							
							if(opcaoContinuar == 'S') {
								
							}
							else {
								
								System.out.println("Volte sempre! :D");
								break;
							}
							
							
							
						}
						
						
						break;
					}
					//FIM
					
				case 2:
					break;
					
				case 3:
					System.out.println("Volte sempre! :D");
					break;	
					
			}
	
		
		
	}while(opcaoContinuar == 'S');
		
	
	}
	
	
		//FUNCAO LINHA
		public static void linha(){
			int valor = 80;
			for(int x=0;x<valor;x++) {
				System.out.print("█");
			}
		}
		//FIM FUNCAO LINHA
		
		//FUNCAO GENERO
		static int genero(int numeroConta) {
			int seuGenero = 0;
			char tipo [] =  {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M','M'};
			String nome [] =  {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho",
					"Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","Fernanda Agapito","Fernanda Barbosa Ferraz",
					"Francisco José Pires","Gabriel Enrique Cabral Silva","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","Gilson Amorim de Matos","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
					"Heloisa Beatriz de Oliveira Costa","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão",
					"Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da Silva","Luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva",
					"Tiago dos Santos Martins","Verônica Navarro Almena","Vinicius Alves Miranda"};
			
			
				if(tipo[numeroConta] == 'F') {
					System.out.println("Seja bem vinda ao BANCO-G8, sra " + nome[numeroConta] + "!");
				}
				else if(tipo[numeroConta] == 'M'){
					System.out.println("Seja bem vindo ao BANCO-G8, sr " + nome[numeroConta] + "!");
				}
				else {
					System.out.println("Valores inválidos! Tente novamente.");
				}
			
			return seuGenero;
		}
		//FIM FUNÇAO GENERO
		
		
		//FUNÇAO MENU
		 static int menuPrincipal() {
			Scanner ler = new Scanner(System.in);
			char leiaMenu;
			int menu;
			linha();
			System.out.println();
			System.out.println("                    █     BEM VINDO AO BANCO-G8    █");
			System.out.println("                    █     AQUI SEU DINHEIRO RENDE  █");
			linha();
			System.out.print("\n");
			System.out.println("                    █     SERVIÇOS DISPONÍVEIS     █");
			System.out.println("                    █   [1] - MOVIMENTAÇÃO         █");
			System.out.println("                    █   [2] - SALDO                █");
			System.out.println("                    █   [3] - SAIR                 █");
			linha();
			System.out.print("\n                         QUAL OPÇÃO ESCOLHIDA?   ");
			menu = ler.nextInt();
			return menu;
		}
		
}