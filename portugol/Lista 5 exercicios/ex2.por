programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 * O IMC – Índice de Massa Corporal é um critério da Organização Mundial 
		 * de Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. 
		 * A fórmula é IMC = peso / ( altura )2 
		Elabore um programa que leia o peso e a altura de um adulto e mostre sua 
		condição de acordo com a tabela abaixo. 
		IMC em adultos Condição 
		Abaixo de 18,5 Abaixo do peso 
		Entre 18,5 e 25 Peso normal 
		Entre 25 e 30 Acima do peso 
		Acima de 30 obeso
		 */

		 real peso=0.0,altura=0.0,condicao=0.0

		 escreva("\nDigite seu peso: ")
		 leia(peso)
		 escreva("\nDigite sua altura: ")
		 leia(altura)

		 condicao=peso/(altura*altura)

		 se (condicao<=0)
		 {
		 	escreva("O número inserido é inválido")
		 }senao
		 {	
		 	se(condicao<18.5)
		 	{
		 		escreva("\nSeu IMC é:",mat.arredondar(condicao,2)," Abaixo do peso ")
		 	}
		 	senao se(condicao>=18.5 e condicao<25)
		 	{
		 		escreva("\nSeu IMC é:",mat.arredondar(condicao,2)," Peso normal ")
		 	}
		 	senao se(condicao>=25 e condicao<30)
		 	{
		 		escreva("\nSeu IMC é:",mat.arredondar(condicao,2)," Acima do peso ")
		 	}
		 	senao se(condicao>=30)
		 	{
		 		escreva("\nSeu IMC é:",mat.arredondar(condicao,2)," obeso ")
		 	}
		 }	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1083; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */