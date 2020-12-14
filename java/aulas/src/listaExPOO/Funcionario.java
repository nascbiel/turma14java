package listaExPOO;

public class Funcionario {
	int identificacaoNumero;
	String dataAdmissão;
	String cargoFuncao;
	double remuneracao;
	String localTrabalho;
	String ferias;
	char acidenteTrabalho;

	public Funcionario() {
		
	}
	public Funcionario(int identificacaoNumero, String dataAdmissão, String cargoFuncao,double remuneracao,String localTrabalho,String ferias,char acidenteTrabalho)
	{
		this.identificacaoNumero=identificacaoNumero;
		this.dataAdmissão=dataAdmissão;
		this.cargoFuncao=cargoFuncao;
		this.remuneracao=remuneracao;
		this.localTrabalho=localTrabalho;
		this.ferias=ferias;
		this.acidenteTrabalho=acidenteTrabalho;
	}
	
	public void acontecerAcidente(char acidenteTrabalho)
	{
		String aconteceu = null;
		if(acidenteTrabalho=='S')
		{
			System.out.println("Sim,houve um acidente no trabalho comunique imediato seu supervisor");
		}
		else if(acidenteTrabalho=='N')
		{
			System.out.println("Não houve acidente");
		}
		else {
			System.out.println("Digito Inválido");
		}
	}
	
}
