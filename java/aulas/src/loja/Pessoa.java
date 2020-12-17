package loja;

import java.util.Scanner;

public abstract class Pessoa {
	private String nome;
	private char genero; 
	private int anoNascimento;

public Pessoa(String nome, char genero, int anoNascimento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}


	public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}


public char getGenero() {
	return genero;
}

public void setGenero(char genero) {
	this.genero = genero;
}

public int getAnoNascimento() {
	return anoNascimento;
}

public void setAnoNascimento(int anoNascimento) 
{
	this.anoNascimento = anoNascimento;
}


	public void voltaIdade(int anoNascimento)
	{
		int idade;
		Scanner teclado= new Scanner(System.in);
		
		if(anoNascimento <= 0 || anoNascimento<1900)
		{
			System.out.println("Ano de Nascimento Inválido");
		}
		else
		{
			System.out.println("Digite o ano atual:");
			int anoAtual = teclado.nextInt();
			
			if(anoAtual<=0 || anoAtual<2000)
			{
				System.out.println("Ano Inválido");
			}
			else
			{
				idade= anoAtual - anoNascimento;
				System.out.println("Sua idade é: "+idade);
			}
		}
	}

public String voltaGenero (char genero)
	{
		String tipo;
		if(genero=='M')
		{
			tipo = "BEM VINDO A NOSSA LOJA SENHOR";
		}
		else if(genero=='F')
		{
			tipo = "BEM VINDA A NOSSA LOJA SENHORA";
		}
		else if(genero=='X')
		{
			tipo = "BEM VINDX A NOSSA LOJA SENHORX";
		}	
		else
		{
			tipo = "N/D";
		}
		return tipo;
	}
	
	
}
