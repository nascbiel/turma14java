package BancoFinalizando;

public class ContaEspecial extends ContaCorrente {

	private double valorLimite;
	private double valorCadastroLimite;


	public ContaEspecial(int numeroConta, double valorLimite) {
		super(numeroConta);
		this.valorLimite = valorLimite;
	}
	
	public ContaEspecial(int numeroConta, String cpf, int valorLimite) {
		super(numeroConta);
		this.valorLimite = valorLimite;
	}

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	
	
	@Override
	public boolean testarSaldo(double valor) {
		
		boolean teste;
		if (valor <= super.getSaldo()) {
			teste = true;
		} 
		else if (valor <= (this.valorLimite+super.getSaldo())){
			double valorCredito=valor - super.getSaldo();
			super.credito(valorCredito);
			this.valorLimite = this.valorLimite - valorCredito;
			teste = true;
		}
		else{
			teste = false;
		}
		
		return teste;
	}
	
	public void registraLimite(){
		if(valorLimite<=0){
			 System.err.println("Valor zerado, impossivel realizar");
			}
		else {
			this.valorCadastroLimite = this.valorLimite;
			}	
	}
	
	
	public void devolverLimite(){
		if (this.valorCadastroLimite != this.valorLimite)
		{
			double diferenca;
			diferenca = this.valorCadastroLimite - this.valorLimite;
			this.valorLimite += diferenca;
		}
	}
	
}
