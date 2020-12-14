package listaExPOO;

public class Aviao {

	/*
	 * 2) Crie uma classe avi�o e apresente os atributos e m�todos 
	 * referentes esta classe, em seguida crie um objeto avi�o, 
	 * defina as instancias deste objeto e apresente as informa��es 
	 * deste objeto no console.
	 */
	
	String motor;
	String modelo;
	double velocidadeMaxima;
	double velocidadeAtual;
	
	void liga() {
		System.out.println("O avi�o est� ligando..");
	}
	void acelera(double quantidade)
	{
		double velocidadeNova=this.velocidadeAtual+quantidade;
		this.velocidadeAtual=velocidadeNova;
	}
	String decolar() {
		char chegada = 0;
		if(velocidadeAtual<0) 
		{
			return "ligarAviao";
		}
		if(velocidadeAtual>=0 && velocidadeAtual<280)
		{
			return "preparandoParaDecolar";
		}
		if(velocidadeAtual>=280 && velocidadeAtual<300)
		{
			return "DecolandoAviao";	
		}
		if(velocidadeAtual>=300 && velocidadeAtual<850)
		{
			return "voando";
		}
		if(velocidadeAtual==850 && chegada=='P')
		{
			return "prepararPouso";
		}
		return "checarParametros";
	}
	
	
	
	
}
