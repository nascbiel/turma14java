package desafioDosProgramadores;

public class Terceiro extends Funcionario {
    private double valorTerceiro;
    
   
    public Terceiro(String nome, int horasMensais, double valorHora, double valorTerceiro) {
		super(nome, horasMensais, valorHora);
		this.valorTerceiro = valorTerceiro;
	}
    
	@Override
    public double pagamentoSalario()
    {
  	  double salario;
  	  salario = (super.getValorHora() * super.getHorasMensais())+this.valorTerceiro;
  	  return salario;
    } 
    public double getValorTerceiro() {
		return valorTerceiro;
	}

	public void setValorTerceiro(double valorTerceiro) {
		this.valorTerceiro = valorTerceiro;
	}


}
