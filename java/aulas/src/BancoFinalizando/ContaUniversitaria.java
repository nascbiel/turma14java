package BancoFinalizando;

public class ContaUniversitaria extends Conta{

	private double emprestimoUniversitario;

	public double getEmprestimoUniversitario() {
		return emprestimoUniversitario;
	}

	public void setEmprestimoUniversitario(double emprestimoUniversitario) {
		this.emprestimoUniversitario = emprestimoUniversitario;
	}
	
	public ContaUniversitaria(int numeroConta, String cpf, double emprestimoUniversitario) {
		super(numeroConta, cpf);
		this.emprestimoUniversitario = emprestimoUniversitario;
	}
	
	public ContaUniversitaria(int numeroConta, double emprestimoUniversitario) {
		super(numeroConta);
		this.emprestimoUniversitario = emprestimoUniversitario;
	}
	
	public void emprestar(double valorEmprestimo){
		if(valorEmprestimo<=this.emprestimoUniversitario){
			this.emprestimoUniversitario = this.emprestimoUniversitario-valorEmprestimo;
			this.saldo=this.saldo+valorEmprestimo;
			System.out.println("RESTANTE DO EMPRÉSTIMO: R$ "+ this.emprestimoUniversitario);
			System.out.println("SALDO ATUAL: R$ "+this.saldo);
			System.out.println("\n");
		}
		else{
		}	
	}
}
