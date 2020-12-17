package BancoFinalizando;

public class ContaPoupanca extends Conta {

	private int dataAniversarioConta;
	
	public ContaPoupanca(int numeroConta, String cpf, int dataAniversarioConta) {
		super(numeroConta, cpf);
		this.dataAniversarioConta = dataAniversarioConta;
	}
	
	public ContaPoupanca(int numeroConta, int dataAniversarioConta) {
		super(numeroConta);
		this.dataAniversarioConta = dataAniversarioConta;
	}
	
	public int getDataAniversarioConta() {
		return dataAniversarioConta;
	}

	

	public void setDataAniversarioConta(int dataAniversarioConta) {
		this.dataAniversarioConta = dataAniversarioConta;
	}
	
	public void correcaoPoupanca(int dataAtual) {
		
		if (dataAtual == this.dataAniversarioConta) {
			super.credito((super.getSaldo()*0.005));
		}
	}
}
