programa
{
	
	funcao inicio()
	{
		inteiro valorInteiro

		 escreva("Digite um valor: ")
		 leia(valorInteiro)

		 se (valorInteiro > 0){
			se (valorInteiro % 2 == 0){
				
				escreva("Este número é par!!")
			}
			senao {
				escreva("Este número é ímpar!!")
			}
		 	
		 } senao se (valorInteiro == 0) {
		 	
		 	escreva("Este valor é zero")
		 	
		 } senao {
		 	
		 	escreva("Você digitou um valor inválido")
		 }

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */