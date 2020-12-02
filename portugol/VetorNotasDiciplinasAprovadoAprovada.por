programa
{
	
	funcao inicio()
	{

		/*
		 * 4 DISCIPLINAS – PORTUGUES, MATEMATICA, CIÊNCIAS, ARTES
		CADA DISCIPLINA RECEBE UMA NOTA ENTRE 0 E 10 (INTEIRO)
		PORTUGUES – NOTA: 6
		MATEMATICA – NOTA: 10
		MOSTRA AS NOTAS DO ALUNO MENOR OU IGUAL A 5 – 
		REPROVADO ACIMA APROVADO [REPROVADO, REPROVADA, APROVADO OU APROVADA], 
		TEM QUE PEDI O NOME DO ALUNO
		 */
		caracter sexoAluno
		cadeia alunoNome, disciplinas[4]
		inteiro notas[4]

		disciplinas[0]="PORTUGUES"
		disciplinas[1]="MATEMATICA"
		disciplinas[2]="CIÊNCIAS"
		disciplinas[3]="ARTES"

		notas[0]=0
		notas[1]=0
		notas[2]=0
		notas[3]=0
	
		escreva("\nEscolha entre [M] para masculino, [F] para feminino ou [O] para outros")
		escreva("\nDigite o seu sexo: ")
		leia(sexoAluno)
		escreva("\nDigite o nome do alune: ")
		leia(alunoNome)

		para (inteiro x = 0; x < 4; x++){
			escreva("\nDigite a nota de ",disciplinas[x], ": ")
			escreva("\n")
			leia(notas[x])
			
			se(notas[x]<=5){
				se(sexoAluno == 'M' ou sexoAluno == 'm'){
					escreva("Você foi reprovado")
				}
				senao se(sexoAluno == 'F' ou sexoAluno == 'f')
				{
					escreva("Você foi reprovada")
				}
				senao se(sexoAluno == 'O' ou sexoAluno == 'o')
				{
					escreva("Você foi reprovadx")	
				}
			}
			senao 
			{
				se (sexoAluno == 'M' ou sexoAluno == 'm')
				{
					escreva("Você foi aprovado")
				}
				senao se(sexoAluno=='F' ou sexoAluno=='f')
				{
					escreva("Você foi aprovada")
				}
				senao se(sexoAluno=='O' ou sexoAluno=='o')
				{
					escreva("Você foi aprovadex")
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
 * @POSICAO-CURSOR = 936; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */