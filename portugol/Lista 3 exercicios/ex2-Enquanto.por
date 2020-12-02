programa
{
	
	funcao inicio()
	{
		/*
		 * Obtenha um número digitado pelo usuário e repi
		 * operação de multiplicar ele por três  (imprimindo o novo valor
		 * ) até que ele seja maior do que 100. Ex.: se o usuário digit
		 * a 5,  deveremos observar na tela a seguinte sequência: 5 15 45 135.
		 */

		inteiro usuario

		escreva("Digite um número: ")
		leia(usuario)

			
		enquanto(usuario<=100)
		{
				usuario = usuario*3
				escreva("\nSeu número multiplicado por 3: ",usuario)
          }
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 397; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */