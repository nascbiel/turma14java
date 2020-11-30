programa
{
	
	funcao inicio()
	{

		/*
		 * Faça um sistema que leia um número inteiro e mostre uma mensagem 
		 * indicando se este número é par ou ímpar, e se é positivo ou negativo.
		 * 
		 */
		inteiro valorInteiro

		 escreva("Digite um valor: ")
		 leia(valorInteiro)

		 se (valorInteiro > 0){
			se (valorInteiro % 2 == 0){
				
				escreva("\nEste número é par!!")
			}
			senao {
				escreva("\nEste número é ímpar!!")
			}
		 	
		 	}   
		 	senao se (valorInteiro == 0) {
		 	
		 	escreva("\nEste valor é zero")
		 	
		 	} 
		 senao {
		 	
		 	escreva("\nVocê digitou um valor inválido")
		 }
		 se (valorInteiro<0){
		 	escreva("\nEste número é negativo")
		 }
		 senao {
		 	escreva("\nEste número é positivo")
		 }

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */