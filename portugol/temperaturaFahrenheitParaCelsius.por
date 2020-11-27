programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real temperaturaCelsius , temperaturaFahrenheit 

		escreva("Digite a temperatura em Fahrenheit:")
		leia (temperaturaFahrenheit)
		escreva("\n")
		
		
		temperaturaCelsius  = (temperaturaFahrenheit - 32) * 5/9
 
		escreva("a temperatura em Celsius é:" +Matematica.arredondar(temperaturaCelsius,2)+ " C°")
		

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 362; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */