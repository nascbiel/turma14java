package bancos;

public abstract class Conta {

	private int numeroConta;
	protected double saldo;
	private String cpf;
	
	
	public Conta(int numeroConta) {
		this.numeroConta=numeroConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	public void debito(double valorDebito) 
	{
		if(valorDebito>this.saldo) {
			System.out.println("TRANSAÇÃO INVÁLIDA");
		}
		else {
			this.saldo = this.saldo - valorDebito;
			System.out.println("SALDO DA TRANSAÇÃO: "+this.saldo);
		}
	}
	
	public void credito (double valorCredito) 
	{
		this.saldo = this.saldo + valorCredito;
	}
	
	
}
