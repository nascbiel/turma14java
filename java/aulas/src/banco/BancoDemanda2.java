package banco;
import java.util.Scanner;
public class BancoDemanda2 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		char leiaMenu;
		int menu;
		linha();
		System.out.println();
		System.out.println("                    |     BEM VINDO AO BANCO-G8    |");
		System.out.println("                    |     AQUI SEU DINHEIRO RENDE  |");
		linha();
		System.out.print("\n");
		linha();
		System.out.println("                    |     SERVIÇOS DISPONÍVEIS     |");
		linha();
		System.out.print("\n");
		System.out.println("                    |   [1] - CONTA POUPANÇA       |");
		System.out.println("                    |   [2] - CONTA CORRENTE       |");
		System.out.println("                    |   [3] - CONTA ESPECIAL       |");
		System.out.println("                    |   [4] - CONTA EMPRESA        |");
		System.out.println("                    |   [5] - CONTA UNIVERSITÁRIA  |");
		System.out.println("                    |   [6] - SAIR                 |");
		linha();
		System.out.println("\n                         QUAL OPÇÃO ESCOLHIDA?   ");
		menu = ler.nextInt();
		switch(menu) {
		case 1:
			poupanca(menu);
		}
	}
	//FUNCAO LINHA
			public static void linha(){
		int valor = 80;
		for(int x=0;x<valor;x++) {
			System.out.print("█");
		}
	}
	//FIM FUNCAO LINHA
	//FUNCAO CONTA CORRENTE
	public static int poupanca(int menu) {
		int contaUm = 0, numeroConta, debCred;
		double saldo = 0.0, debito = 0.0, credito = 0.0, creditoTotal = 0.0, debitoTotal = 0.0;
		Scanner ler = new Scanner(System.in);
		System.out.print("\nInsira o número da sua conta: ");
		numeroConta = ler.nextInt();
		System.out.println("\nSeu saldo atual é de R$ " + saldo);
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
					System.out.println("TRANSAÇÃO INDISPONÍVEL.");
					break;
				}
				else {
				creditoTotal -= debito;
				System.out.println("SALDO TOTAL: " + creditoTotal);
				}
			}
			else {
				System.out.println("VALOR INVÁLIDO.");
				break;
			}
		}
		return contaUm;
	}
	//FIM CONTA CORRENTE 
}
