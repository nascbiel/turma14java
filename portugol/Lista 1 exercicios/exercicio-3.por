programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro tempoSegundos, //horas, minutos, segundos 
		escreva("Digite o tempo do evento em segundos: ")
		leia(tempoSegundos) 

//segundo
//1 hora - 60 minutos - 1 minuto tem 60 segundos = quantos segundos tem 1 hora: 3600 1 hora tem 3.600 segundos
//1 minuto - 60 segundos 
// segundo é segundo

 		//processamentos
 		
		/*horas = tempoSegundos / 3600 //downcasting
		escreva("\nHora[s]: ", horas)
		minutos = (tempoSegundos % 3600)/60
		escreva("\nMinuto[s]: ", minutos)
		segundos = (tempoSegundos % 3600)%60
		escreva("\nsegundos[s]: ", segundos)
		*/

		escreva("Hora[s]: ",(tempoSegundos / 3600), " -minuto[s]: ",(tempoSegundos % 3600)/60, " segundo[s]: ", (tempoSegundos % 3600)%60))


		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 99; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */