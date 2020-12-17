package loja;

import java.util.Scanner;

public class Cliente extends Pessoa {

	private String cpf;

	public Cliente(String nome, char genero, int anoNascimento, String cpf) 
	{
		super(nome, genero, anoNascimento);
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	
	public void corrigeCpf(String novoCPF)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o novo cpf:");
		String cpfNovo=teclado.next();
		if(novoCPF==null)
		{
			this.cpf=cpfNovo;
		}
		else
		{
			System.out.println("CPF Inválido");
		}
		
	}		
}
