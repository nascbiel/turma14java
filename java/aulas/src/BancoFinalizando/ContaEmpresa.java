package BancoFinalizando;

public class ContaEmpresa extends Conta {
	private double emprestimoEmpresa;
	
	public ContaEmpresa(int numeroConta,double emprestimoEmpresa)
	{
		super(numeroConta);
		this.emprestimoEmpresa=emprestimoEmpresa;
		
	}
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}
	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	public void emprestar(double valorEmprestimo)
	{
		if(valorEmprestimo<=this.emprestimoEmpresa)
		{
			this.emprestimoEmpresa=this.emprestimoEmpresa-valorEmprestimo;
			this.saldo=this.saldo+valorEmprestimo;
			System.out.println("RESTANTE DO EMPRÉSTIMO: R$ "+this.emprestimoEmpresa);
			System.out.println("SALDO ATUAL: R$ "+this.saldo);
			System.out.println("\n");
		}
		else
		{
			System.out.println("OPERAÇÃO INVÁLIDA");
		}
		
		
	}
	
	
}