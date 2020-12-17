package bancos;

public abstract class Conta {

	private int numeroConta;
	protected double saldo;
	private String cpf;
	
	
	public Conta(int numeroConta) {
		this.numeroConta=numeroConta;
	}
	
	public Conta(int numeroConta, String cpf) {
		super();
		this.numeroConta = numeroConta;
		this.cpf = cpf;
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
	
	
	public boolean testarSaldo(double valor) 
	{
		
		boolean teste;
		if (valor <= this.saldo) {
			teste = true;
		} else {
			teste = false;
		}
		
		return teste;
	}
	
	
	public void debito(double valorDebito) 
	{
		if(valorDebito>this.saldo) {
			System.out.println("TRANSA��O INV�LIDA");
		}
		else {
			this.saldo = this.saldo - valorDebito;
			System.out.println("SALDO DA TRANSA��O: "+this.saldo);
		}
	}
	
	public void credito (double valorCredito) 
	{
		this.saldo = this.saldo + valorCredito;
	}
	
	
}
