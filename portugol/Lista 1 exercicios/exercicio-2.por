programa
{
	
	funcao inicio()
	{
		inteiro tempoDias

		escreva("Digite o tempo em dias: ")
		leia(tempoDias)
		escreva("\n")
		// ano = (tempoDias/365)
		// mes = (tempoDias%365)/30
		// dias = (tempoDias%365)%30

		escreva("Ano(s): ",(tempoDias/365)," mes(es): ",((tempoDias%365)/30), " e ",((tempoDias%365)%30)," dias"))

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 324; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */