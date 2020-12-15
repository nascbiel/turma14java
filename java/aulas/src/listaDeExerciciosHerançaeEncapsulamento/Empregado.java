package listaDeExerciciosHeran�aeEncapsulamento;

public class Empregado extends Pessoa {
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	/*
	 * Valor do seu sal�rio bruto recebido mensalmente;
		Valor do INSS multiplicado pela Al�quota.
		Com essas informa��es, basta utilizar a seguinte f�rmula:

		Imposto de Renda retido na fonte = [(Sal�rio bruto � dependentes � INSS) X al�quota] � dedu��o
	 */
	public void calcularSalario()
	{
		if(this.salarioBase<=1903.98)
		{
			this.imposto=0.075;
			this.salarioBase=(this.salarioBase)*this.imposto;
			System.out.println("INSS: "+this.salarioBase);
		}
		else if(this.salarioBase>=1903.99 && this.salarioBase<=2826.65)
		{
			this.imposto=0.09;
			this.salarioBase=(this.salarioBase-0.075)*this.imposto;
			System.out.println("INSS: "+this.salarioBase);
		}
		else if(this.salarioBase>=2089.61 && this.salarioBase<=3134.40)
		{
			this.imposto=0.12;
			this.salarioBase=(this.salarioBase-0.15)*this.imposto;
			System.out.println("INSS: "+this.salarioBase);
		}
		else if(this.salarioBase>=3134.41 && this.salarioBase<=6101.06)
		{
			this.imposto=0.14;
			this.salarioBase=(this.salarioBase-0.225)*this.imposto;
			System.out.println("INSS: "+this.salarioBase);
		}	
	}
	
}
