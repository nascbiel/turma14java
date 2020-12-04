programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		
		/*
		 * Elabore um programa que calcule o que deve ser pago por um produto, 
		 * considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
		 * Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida 
		 * e efetuar o cálculo adequado. 
		Código Condição de pagamento 
		1 À vista em dinheiro ou cheque, recebe 20% de desconto 
		2 À vista no cartão de crédito, recebe 15% de desconto 
		3 Em duas vezes, preço normal de etiqueta sem juros 
		4 Em três vezes, preço normal de etiqueta mais juros de 10%
		 */

		const real DESCONTODEVINTE = 0.20
		const real DESCONTOQUINZE = 0.15
		const real JUROS = 1.1
		real etiqueta, descontoDinheiro, descontoCartao, duasVezes, tresVezes
		caracter condicao

		escreva("\nDigite o valor da etiqueta: ")
		leia(etiqueta)
		
		escreva("\nDigite a forma de pagamento escolhida de acordo com o número desejado")
		escreva("\n[1]-Á vista no dinheiro/cheque")
		escreva("\n[2]-Á vista no cartão de crédito")
		escreva("\n[3]-se for em duas vezes")
		escreva("\n[4]-se for em três vezes: ") 
		leia(condicao)

		se(condicao == '1')
		{
			limpa()
				descontoDinheiro = etiqueta * DESCONTODEVINTE
				descontoDinheiro = etiqueta - descontoDinheiro
				
				escreva("O valor a ser pago é de: ",descontoDinheiro, "pois você teve desconto de 20%")
				
		}
		senao se(condicao == '2')
		{
			limpa()
			descontoCartao = etiqueta * DESCONTOQUINZE
			descontoCartao = etiqueta - descontoCartao
				escreva("O valor a ser pago no cartão é de: ",descontoCartao," pois você teve desconto de 15%")
				 
		}	
		senao se(condicao == '3')
		{
			limpa()
			duasVezes = etiqueta
				escreva("O valor a ser pago em 2x é de: ",duasVezes," você não obteve desconto.")
				
		}
		senao se(condicao == '4')
		{	
			limpa()
			tresVezes = etiqueta * JUROS
			escreva("O valor a ser pago em 3x é de: ",mat.arredondar(tresVezes,2)," pois você obteve juros de 10%")
			
		}
		
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1970; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */