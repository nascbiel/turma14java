package desafioDosProgramadores;

import java.util.Scanner;

public class MatriculaNome {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String alunos[] = { "Allen de Lima Vieira", "Andr� de Brito Silva da Costa","B�rbara Liboni Guerra",	
				"Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli",
				"Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
				"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira",
				"Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco Jos� Pires",
				"Gabriel S�rgio Nascimento Santos Gon�alves", "Gide�o da Silva Idelfonso",
				"GILSON AMORIM DE MATOS","Guilherme Gon�alves da Silva","Gustavo Rabelo Teles",
				"HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama",
				"Jackeline Akemi de Moura","Jos� Jorge Hauck J�nior","Juliana Santos Andr�",
				"K�lven Cleiton de Ara�jo Brand�o","La�s Lima Santos","Lucas anseloni barros",
				"Lucas Gon�alves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalh�es",
				"Marcos Eduardo Gomes Gon�alves","Micaely da Silva Lima","Rafaela Oliveira Silva",
				"Tiago dos Santos Martins","Ver�nica Navarro Almenara","Vinicius Alves Miranda", "Gabriel Enrique Cabral Silva"};
		int matriculas[] = new int[40];
		char sexoAlunos[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F',
				'F','M','F','M','F','M','M','M','M','M','F','F','M','F','M','M'};
		for(int indice=0;indice<40;indice++)
		{
			System.out.println("A matricula "+(indice+1));
			if(sexoAlunos[indice]=='M')
			{
				System.out.println("O nome do aluno: "+alunos[indice]);
			}
			else
			{
				System.out.println("O nome do aluna: "+alunos[indice]);
			}
		}
	}
}
