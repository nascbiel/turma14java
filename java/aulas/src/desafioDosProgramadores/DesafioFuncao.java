package desafioDosProgramadores;

import java.util.Scanner;

public class DesafioFuncao {
		public static void main(String[] args) 
		{
			Scanner teclado = new Scanner(System.in);
			/*
			 * OBJETIVO � SOLICITAR AO USUARIO O ANO DE NASCIMENTO. 
				CRIAR UMA FUN��O QUE RETORNE AO PROGRAMA A IDADE DO 
				USUARIO EM NUMERO INTEIRO.
				EXIBA ESTA IDADE NO PROGRAMA PRINCIPAL.
			 */
			int anoNascimento;
			
			System.out.println("Digite o ano do seu nascimento: ");
			anoNascimento = teclado.nextInt();
			
			idadeUsuario(anoNascimento);
					
			if (idadeUsuario(anoNascimento)<0)
			{
				System.out.println("Idade digitada � invalida");
			}
			else if (idadeUsuario(anoNascimento)<18)
			{
				System.out.println("Voc� � Infarto-Juvenil");
			}
			else if(idadeUsuario(anoNascimento)>=18 && idadeUsuario(anoNascimento)<60)
			{
				System.out.println("Voc� � Adulto");
			}
			else if(idadeUsuario(anoNascimento)>=60)
			{
				System.out.println("Voc� � Idoso");
			}
			
			
			
			System.out.println("Voc� tem: "+idadeUsuario(anoNascimento)+" anos");
			
		}
	
	public static int idadeUsuario(int anoNascimento)
	{
		int idade;	
		idade=2020-anoNascimento;		
		return idade;
	}
			
}
