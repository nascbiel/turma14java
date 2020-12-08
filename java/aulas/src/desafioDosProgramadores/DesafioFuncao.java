package desafioDosProgramadores;

import java.util.Scanner;

public class DesafioFuncao {
		public static void main(String[] args) 
		{
			Scanner teclado = new Scanner(System.in);
			/*
			 * OBJETIVO – SOLICITAR AO USUARIO O ANO DE NASCIMENTO. 
				CRIAR UMA FUNÇÃO QUE RETORNE AO PROGRAMA A IDADE DO 
				USUARIO EM NUMERO INTEIRO.
				EXIBA ESTA IDADE NO PROGRAMA PRINCIPAL.
			 */
			int anoNascimento;
			
			System.out.println("Digite o ano do seu nascimento: ");
			anoNascimento = teclado.nextInt();
			
			idadeUsuario(anoNascimento);
					
			if (idadeUsuario(anoNascimento)<0)
			{
				System.out.println("Idade digitada é invalida");
			}
			else if (idadeUsuario(anoNascimento)<18)
			{
				System.out.println("Você é Infarto-Juvenil");
			}
			else if(idadeUsuario(anoNascimento)>=18 && idadeUsuario(anoNascimento)<60)
			{
				System.out.println("Você é Adulto");
			}
			else if(idadeUsuario(anoNascimento)>=60)
			{
				System.out.println("Você é Idoso");
			}
			
			
			
			System.out.println("Você tem: "+idadeUsuario(anoNascimento)+" anos");
			
		}
	
	public static int idadeUsuario(int anoNascimento)
	{
		int idade;	
		idade=2020-anoNascimento;		
		return idade;
	}
			
}
