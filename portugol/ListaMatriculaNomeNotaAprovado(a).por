programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		cadeia alunos [] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima",
		"Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira",
		"Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires",
		"Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
		"HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior",
		"Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da Silva","Luis felipe da silva",
		"Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins",
		"Verônica Navarro Almena"}
		caracter generos [] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M',
		'M','M','M','F','F','M','F','M'}
		cadeia matriculas [39]
		real notas [38]
		inteiro aprovados=0,reprovados=0,aprovadas=0,reprovadas=0
		cadeia aluno
		caracter genero
		caracter deseja
		faca
		{
			para(inteiro x = 0; x < 38; x++){
				matriculas[x] = "G8-"+(x+1)	
			}
			para(inteiro x = 0; x < 38; x++){
				escreva("\nMatricula: ", matriculas[x], " - ",alunos[x], ", ", generos[x])
			}
				escreva("\nEscolha um aluno pela matricula:" )
				leia(aluno)
			para(inteiro x = 0; x < 38; x++){
				se(aluno == matriculas[x]){
				escreva(alunos[x], " ", generos[x])
				}
			}
			para(inteiro x = 0; x < 1; x++){
				notas[x] = Util.sorteia(0, 10)
			se(notas[x] >= 0 e notas[x] <= 5 e generos[x] == 'F' ou generos[x] == 'f'){
				escreva("\nVocê está reprovada com nota ", notas[x])
				escreva("\n--------------")
			}
			senao se(notas[x] >= 0 e notas[x] <= 5 e generos[x] == 'M' ou generos[x] == 'm'){
				escreva("\nVocê está reprovado com nota ", notas[x])
				escreva("\n--------------")
			}
			senao se(notas[x] > 5 e notas[x] < 8 e generos[x] == 'F' ou generos[x] == 'f'){
				escreva("\nVocê está de recuperação com nota ", notas[x])
				escreva("\n--------------")
			}
			senao se(notas[x] > 5 e notas[x] < 8 e generos[x] == 'M' ou generos[x] == 'm'){
				escreva("\nVocê está de recuperação com nota ", notas[x])
				escreva("\n--------------")
			}
			senao se(notas[x] >= 8 e notas[x] <= 10 e generos[x] == 'F' ou generos[x] == 'f'){
				escreva("\nVocê está aprovada com nota ", notas[x])
				escreva("\n--------------")
			}	
			senao se(notas[x] >= 8 e notas[x] <= 10 e generos[x] == 'M' ou generos[x] == 'm'){
				escreva("\nVocê está aprovado com nota ", notas[x])
				escreva("\n--------------")
			}
			senao{
				escreva("\nDados incorretos");
			}
				}
			para(inteiro x = 0; x<38 ;x++){
				notas[x] = Util.sorteia(0, 10)
				se((generos[x] == 'F' ou generos[x] == 'f') e notas[x] >=8 )
				{
					escreva("\nAPROVADA: ",alunos[x], ", do gênero F, com nota ",notas[x])
				}
				senao se((generos[x] == 'F' ou generos[x] == 'f') e notas[x] <5 )
				{
					escreva("\nREPROVADA: ",alunos[x], ", do gênero F, com nota ",notas[x])
				}
				senao se((generos[x] == 'M' ou generos[x] == 'm') e notas[x] >=8 )
				{
					escreva("\nAPROVADO: ",alunos[x],", do gênero M, com nota ",notas[x])
				}
				senao se((generos[x] == 'M' ou generos[x] == 'm') e notas[x] < 5 )
				{
					escreva("\nREPROVADO: ",alunos[x], ", do gênero M, com nota ",notas[x])
				}
			}
			para(inteiro x = 0; x < 38; x++){
				notas[x] = Util.sorteia(0, 10)
				se((generos[x] == 'F' ou generos[x] == 'f') e notas[x] >=8 )
				{
					escreva("\n----------------")
					escreva("\nAPROVADA: ",alunos[x], ", do gênero F, com nota ",notas[x])
				}
				senao se((generos[x] == 'F' ou generos[x] == 'f') e notas[x] <5 )
				{
					escreva("\n----------------")
					escreva("\nREPROVADA: ",alunos[x], ", do gênero F, com nota ",notas[x])
				}
			}
			escreva("\n----------------")
			para(inteiro x = 0; x < 38; x++){
				se((generos[x] == 'M' ou generos[x] == 'm') e notas[x] >=8 )
				{
					escreva("\n----------------")
					escreva("\nAPROVADO: ",alunos[x],", do gênero M, com nota ",notas[x])
				}
				senao se((generos[x] == 'M' ou generos[x] == 'm') e notas[x] < 5 )
				{
					escreva("\n----------------")
					escreva("\nREPROVADO: ",alunos[x], ", do gênero M, com nota ",notas[x])
				}
			}
				escreva("\n----------------")
			para(inteiro x = 0; x < 38; x++){
				se((generos[x] == 'F' ou generos[x] == 'f') e notas[x] >=8 )
				{
					escreva("\n----------------")
					escreva("\nAPROVADA: ",alunos[x], ", do gênero F, com nota ",notas[x])
				}
			}
			escreva("\n----------------")
			para(inteiro x = 0; x < 38; x++){
				se((generos[x] == 'F' ou generos[x] == 'f') e notas[x] < 5 )
				{
					escreva("\n----------------")
					escreva("\nREPROVADA: ",alunos[x], ", do gênero F, com nota ",notas[x])
				}
			}
			escreva("\n----------------")
			para(inteiro x = 0; x < 38; x++){
				se((generos[x] == 'M' ou generos[x] == 'm') e notas[x] >=8 )
				{
					escreva("\n----------------")
					escreva("\nAPROVADO: ",alunos[x], ", do gênero M, com nota ",notas[x])
				}
			}
			escreva("\n----------------")
			para(inteiro x = 0; x < 38; x++){
				se((generos[x] == 'M' ou generos[x] == 'm') e notas[x] < 5 )
				{
					escreva("\n----------------")
					escreva("\nREPROVADO: ",alunos[x], ", do gênero M, com nota ",notas[x])
				}
			}
				escreva("\nDeseja continuar [S][N] ");
				leia(deseja)
		}
		enquanto(deseja == 'S' ou deseja == 's')
			para(inteiro x = 0; x < 38; x++)
			{
				matriculas[x] = "G8-"+(x+1)	
			}
		}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5934; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */