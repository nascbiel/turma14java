programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um programa que crie um vetor por leitura com 
		 * 5 valores de pontuação de uma atividade e o escreva em seguida. 
		 * Encontre após a maior pontuação e a apresente. 
		 */
		inteiro vetor[5],x,maiorPontuacao=0

		para(x=0;x<5;x++)
		{
			escreva("Digite o valor da pontuação: ")
			leia(vetor[x])
		}
		limpa()
		linha()
		escreva("\n                   MAIOR PONTUAÇÃO")
		pula()
		linha()
		pula()
		
			para(x=0;x<5;x++)
			{
				se(vetor[x]>maiorPontuacao)
			{
				maiorPontuacao = vetor[x]

				escreva("\nMaior Pontuacao é: ",maiorPontuacao)
				pula()
			}
				
		}
		 
	}

	funcao linha(){
		escreva("-------------------------------------------------------")
	}
	funcao pula(){
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 620; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */