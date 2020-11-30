programa
{
	
	funcao inicio()
	{
		/*
		 *  João Papo-de-Pescador, homem de bem, comprou um microcomputador para 
		 *  controlar o rendimento diário de seu trabalho. Toda vez que ele traz 
		 *  um peso de tomate maior que o estabelecido pelo regulamento do estado 
		 *  de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
		 *  
		 *  João precisa que você faça um sistema que leia a variável P (peso de tomates) 
		 *  e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M 
		 *  o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o 
		 *  conteúdo ZERO.
		 *
		 */

		 real pesoDeTomate, E, M
		 const real multaPorQuilo = 4.0

		 escreva("Digite o peso do tomate: ")
		 leia(pesoDeTomate)

		se (pesoDeTomate>=0){	
		 	se(pesoDeTomate>50){
		 		E = pesoDeTomate - 50
		 		M = multaPorQuilo * E
		 	
		 		escreva("Houve um excesso de peso: ", E , " a multa em cima desde excesso: ",M, " reais")
		 	
		 	}

		 	senao {
		 		escreva("Não houve excesso de peso e não precisa pagar nenhuma multa ")
		 	}

		
		}
		senao{
			escreva("Valor Inválido.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1153; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */