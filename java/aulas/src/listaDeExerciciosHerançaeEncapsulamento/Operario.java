package listaDeExerciciosHeran�aeEncapsulamento;

public class Operario extends Pessoa{
	
	/* valorProducao(que corresponde ao valor monet�rio dos artigos efetivamente 
	 *  produzidos pelo oper�rio) e comissao (que corresponde � porcentagem 
	 *  do valorProducao que ser� adicionado ao vencimento base do oper�rio). 
	 */
	
	private double valorProducao;
	private double comissao;
	
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	

}
