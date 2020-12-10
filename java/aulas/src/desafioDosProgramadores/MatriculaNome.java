package desafioDosProgramadores;

import java.util.Scanner;

public class MatriculaNome {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String alunos[] = { "Allen de Lima Vieira", "André de Brito Silva da Costa","Bárbara Liboni Guerra",	
				"Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli",
				"Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
				"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira",
				"Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires",
				"Gabriel Sérgio Nascimento Santos Gonçalves", "Gideão da Silva Idelfonso",
				"GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
				"HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama",
				"Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André",
				"Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros",
				"Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães",
				"Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva",
				"Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda", "Gabriel Enrique Cabral Silva"};
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
