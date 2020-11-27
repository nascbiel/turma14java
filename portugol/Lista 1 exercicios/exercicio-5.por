programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real nota1, nota2, nota3, media

		escreva("Qual a primeira nota: ")
		leia(nota1)

		escreva("\n")

		escreva("Qual a segunda nota: ")
		leia(nota2)

		escreva("\n")

		escreva("Qual a terceira nota: ")
		leia(nota3)

		escreva("\n")

		media = (nota1*2+nota2*3+nota3*5)/(2+3+5)

		
		escreva("\nA sua média final é "+mat.arredondar(media,2)+"!")
		


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 352; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */