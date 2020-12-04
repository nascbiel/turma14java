programa
{
	funcao inicio()
	{
		cadeia alunos [] = {"Bárbara Liboni Guerra", "Laís Lima Santos", "Juliana Santos André", "Guilherme Gonçalves da Silva", "Gabriel Sérgio Nascimento Santos Gonçalves"}
		caracter generos [] = {'F', 'F', 'F', 'M', 'M'}
		cadeia matriculas [5]
		real notas [5]
		cadeia aluno
		caracter genero
		caracter deseja
		para(inteiro x = 0; x < 5; x++){
			matriculas[x] = "G8-"+(x+1)	
		}
		para(inteiro x = 0; x < 5; x++){
			escreva("\nMatricula: ", matriculas[x], " - ",alunos[x], ", ", generos[x])
		}
		escreva("\nEscolha um aluno pela matricula:" )
		leia(aluno)
		escreva("\nQual o gênero dele [F][M]?")
		leia(genero)
		para(inteiro x = 0; x < 5; x++){
			se(aluno == matriculas[x] e genero == generos[x]){
				escreva(alunos[x], " ", generos[x])
			}
		}
		para(inteiro x = 0; x < 1; x++){
			escreva("\nInsira uma nota: ")
			leia(notas[x])	
		se(notas[x] >= 0 e notas[x] <= 5 e generos[x] == 'F' ou generos[x] == 'f'){
			escreva("Você está reprovada com nota ", notas[x])
		}
		senao se(notas[x] >= 0 e notas[x] <= 5 e generos[x] == 'M' ou generos[x] == 'm'){
			escreva("Você está reprovado com nota ", notas[x])
		}
		senao se(notas[x] > 5 e notas[x] <= 8 e generos[x] == 'F' ou generos[x] == 'f'){
			escreva("Você está de recuperação com nota ", notas[x])
		}
		senao se(notas[x] > 5 e notas[x] <= 8 e generos[x] == 'M' ou generos[x] == 'm'){
			escreva("Você está de recuperação com nota ", notas[x])
		}
		senao se(notas[x] > 8 e notas[x] <= 10 e generos[x] == 'F' ou generos[x] == 'f'){
			escreva("Você está aprovada com nota ", notas[x])
		}	
		senao se(notas[x] > 8 e notas[x] <= 10 e generos[x] == 'M' ou generos[x] == 'm'){
			escreva("Você está aprovado com nota ", notas[x])
		}
		senao{
			escreva("Dados incorretos");
		}
			escreva("\nDeseja continuar [S][N] ");
			leia(deseja)
			se(deseja == 'S' ou deseja == 's'){
				escreva("\nEscolha um aluno pela matricula:" )
				leia(aluno)
			para(x = 0; x < 5; x++){
				se(aluno == matriculas[x]){
				escreva(alunos[x])
				}
			}
			para(x = 0; x < 1; x++){
				escreva("\nInsira uma nota: ")
				leia(notas[x])	
			}	
		}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2133; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */