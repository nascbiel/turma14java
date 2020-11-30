programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	/*Desenvolva um sistema em que:
 *Leia 4 (quatro) números; x
  Calcule o quadrado de cada um; 
  Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
  Caso contrário, imprima os valores lidos e seus respectivos quadrados.
     */
	real n1, n2, n3, n4 

	escreva("Digite o primeiro número: ")
	leia(n1)
	escreva("Digite o segundo número: ")
	leia(n2)
	escreva("Digite o terceiro número: ")
	leia(n3)
	escreva("Digite o quarto número: ")
	leia(n4)

	limpa()

	se (mat.potencia(n3,2) >= 1000){
		escreva("O Terceiro número: ",n3," tem o quadrado igual a:",mat.potencia(n3,2))
	}
	senao{
		escreva("\nO Primeiro número: ",n1," tem o quadrado igual a: ",mat.potencia(n1,2))
		escreva("\nO Segundo número: ",n2," tem o quadrado igual a: ",mat.potencia(n2,2))
		escreva("\nO Terceiro número: ",n3," tem o quadrado igual a: ",mat.potencia(n3,2))
		escreva("\nO Quarto número: ",n4," tem o quadrado igual a: ",mat.potencia(n4,2))
		
	}
	

	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1050; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */