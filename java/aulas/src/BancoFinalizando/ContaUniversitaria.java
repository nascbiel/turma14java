package BancoFinalizando;

public class ContaUniversitaria extends Conta{

	private double emprestimoUniversitario;

	public double getEmprestimoUniversitario() {
		return emprestimoUniversitario;
	}
	
	public ContaUniversitaria(int numeroConta, String cpf, double emprestimoUniversitario) {
		super(numeroConta, cpf);
		this.emprestimoUniversitario = emprestimoUniversitario;
	}
	
	public ContaUniversitaria(int numeroConta, double emprestimoUniversitario) {
		super(numeroConta);
		this.emprestimoUniversitario = emprestimoUniversitario;
	}
	
	@Override
	public void debito(double valorDebito) 
	{
			this.setSaldo(this.getSaldo() - valorDebito);
			System.out.println("SALDO TOTAL: R$ " + this.getSaldo());
	}
	
	
	
	
	
	public void emprestar(double valorEmprestimo){
		if(valorEmprestimo<=this.emprestimoUniversitario)
		{
			this.emprestimoUniversitario -= valorEmprestimo;
			this.saldo += valorEmprestimo;
			System.out.println("RESTANTE DO EMPRÉSTIMO: R$ "+ this.emprestimoUniversitario);
			System.out.println("SALDO ATUAL: R$ "+this.saldo);
		}	
		else 
		{
			System.out.println("ACABOU SEU LIMITE DE EMPRESTIMO");
		}
	}
}