programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro opcao
		real base=0, altura=0, raio=0, pi = 3.14, area =0.0
		escreva("Digite  1 - para círculo\n2 - para triângulo\n3 - para retângulo: ")
		leia(opcao)
	 	se (	opcao==1)
		{
		
				escreva("Digite o raio: ")
				leia(raio)
				area = pi * mat.arredondar(mat.potencia(raio,2),2))
				escreva("A área do círculo é: ",area, " cm²")
		
		}
		senao se (opcao ==2) 
		{
		
				escreva("Digite o valor da base: ")
				leia(base)
				escreva("Digite o valor da altura: ")
				leia(altura)
				area = (base*altura) / 2
				escreva("A area do triângulo é:" + area)
		}
		senao se(opcao == 3) 
		{
				escreva("Olá, digite a base do retângulo ")
				leia (base)
				escreva ("Olá, digite a altura do retângulo: ")
				leia (altura)
				area = (base*altura)
				escreva ("A área do retângulo é: ", area, "º")
		}
		senao
		{
			
				escreva("\nCódigo inválido.")
		
		}
	
		escreva("\n-------------------------------------")
		escreva("\nFim do Programa")
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 217; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */