programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		 * Faça um programa que gere um vetor com os lançamentos, 
		 * escreva esse vetor. A seguir determine e imprima a média aritmética 
		 * dos lançamentos, contabilize e apresente também quantas foram as 
		 * ocorrências da maior pontuação.
		 */

		 inteiro dado[10], x ,soma=0, maiorNumero=0, media=0, contador=0

		 para(x=0;x<10;x++)
		 {
		 	dado[x]=Util.sorteia(1,6)
		 	escreva(dado[x]," ")
		 	pula()
		 }
		para(x=0;x<10;x++)
		{
			soma = dado[x]+soma
			
				se(dado[x]>maiorNumero)
				{
					maiorNumero = dado[x]
				}
			
		}
		para(x=0;x<10;x++)
		{
			se(dado[x] == maiorNumero)
			{
				contador++
			}
		}
		media=soma/10
		escreva("\nA soma de tudo: ",soma)
		escreva("\nA média de tudo é: ",media)
		escreva("\nMaior Pontuação que deu: ",maiorNumero)
		escreva("\nQuantas vezes deu o ",maiorNumero," foram: ",contador," vezes.")

 
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
 * @POSICAO-CURSOR = 984; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */