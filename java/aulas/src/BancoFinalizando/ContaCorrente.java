package BancoFinalizando;

import java.util.Scanner;

public class ContaCorrente extends Conta {
	
	 private int qtdTalao;
	    public int getQtdTalao() {
	        return qtdTalao;
	    }
	    
	    public ContaCorrente(int numeroConta) {
	        super(numeroConta);
	    }
	    
	    public ContaCorrente(int numeroConta, int qtdTalao) {
	        super(numeroConta);
	        this.qtdTalao = qtdTalao;
	        
	    }
	    
	    public ContaCorrente(String CPF, int numeroConta, int qtdTalao) {
	        super(numeroConta);
	        this.qtdTalao = qtdTalao;
	        
	    }
	    public void talao(int talao, int totalTalao) {
	        char opcao;
	        do {
	            Scanner leia = new Scanner(System.in);
	            System.out.println("Voc� deseja imprimir tal�o? S/N ");
	            opcao = leia.next().toUpperCase().charAt(0);
	            while (opcao != 'S' && opcao != 'N') {
	                System.out.println("\nOp��o inv�lida. Deseja continuar? S/N");
	                opcao = leia.next().toUpperCase().charAt(0);
	            }
	            if (opcao == 'S') {
	                System.out.println("Digite a quantidade que deseja: (At� 3 tal�es por m�s)");
	                qtdTalao = leia.nextInt();
	                while (qtdTalao < 0 || qtdTalao > 3) {
	                    System.out.printf("\nQuantidade inv�lida. Voc� pode resgatar at� %d tal�es\nDigite a quantidade:", talao);
	                    qtdTalao = leia.nextInt();
	                }
	                while (qtdTalao > talao) {
	                    System.out.printf("Erro! Quantidade dispon�vel: %d. Digite a quantidade:", talao);
	                    qtdTalao = leia.nextInt();
	                }
	                talao = talao - qtdTalao;
	                totalTalao = totalTalao + qtdTalao;
	                if (talao == 0) {
	                    talao = 3;
	                }
	                System.out.printf("Quantidade di�ria impressa: %d\n", qtdTalao);
	                System.out.printf("Quantidade total impressa: %d\n", totalTalao);
	                System.out.println("Deseja continuar? \n[S]-Sim \n[N]-N�o");
	                opcao = leia.next().toUpperCase().charAt(0);
	            }
	        } while (opcao == 'S');
	    }
	
}