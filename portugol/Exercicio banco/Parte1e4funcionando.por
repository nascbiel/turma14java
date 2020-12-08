programa
{
	
	funcao inicio()
	{
		caracter menu, opcao
		real saldo=0.0,debitoMovimentacao=0.0,creditoMovimentacao=0.0,creditoSoma=0.0,emprestimo=0.0
		real emprestimoEmpresa=10000.00
		inteiro diaAniversario, diaAtual

		escreva("\nAqui é o menu")
		escreva("\n[1] - para Conta Poupança")
		escreva("\n[2] - para Conta Especial")
		escreva("\n[3] - para Conta Universitária")
		escreva("\n[4] - para Conta Emprestimo empresa: ")
		leia(menu)
	se(menu == '1')
		{
			escreva("\nData de aniversário:")
          	leia(diaAniversario)
         	 	escreva("Digite o dia de hoje:")
         		leia(diaAtual)
				se(diaAniversario == diaAtual)
            		{
            			escreva("\nQuanto você deseja depositar? ")
            			leia(creditoMovimentacao)
            			escreva("Feliz Aniversário, você recebeu um acrescimo de 0,5% na sua conta!!!")
            			creditoSoma = creditoMovimentacao * (0.5 / 100)
            			creditoMovimentacao += creditoSoma
            			escreva("\nSeu credito agora  de:",creditoMovimentacao)
               	}
				escreva("\nDigite [1] para debito")
				escreva("\nDigite [2] para credito: ")
				leia(opcao)
				se(opcao == '1')
				{
					escreva("\nDigite o débito da movimentação: ")
					leia(debitoMovimentacao)
					se(debitoMovimentacao>saldo ou debitoMovimentacao<0)
					{
						escreva("Transação não autorizada")
					}
					senao
					{
						saldo -= debitoMovimentacao				
					}
				}
				senao se (opcao == '2')
				{	
					escreva("\nDigite o credito da movimentação: ")
					leia(creditoMovimentacao)
					se(creditoMovimentacao>0)
					{	
						saldo += creditoMovimentacao
					}
					senao
					{
						escreva("Transação não autorizada")				
					}
				}	
					escreva("\nO total da transação do dia foi: ",saldo," R$")
               		
		}
		senao se(menu == '2')
		{
			escreva("2") 
		}
		senao se(menu == '3')
		{
			escreva("3")
		}
		senao se(menu == '4')
		{
				escreva("\nDigite [1] para debito")
				escreva("\nDigite [2] para credito: ")
				leia(opcao)
				se(opcao == '1')
				{
					escreva("\nDigite o débito da movimentação: ")
					leia(debitoMovimentacao)
					se(debitoMovimentacao>saldo ou debitoMovimentacao<0)
					{
						escreva("Transação não autorizada")
					}
					senao
					{
						saldo -= debitoMovimentacao				
					}
				}
				senao se (opcao == '2')
				{	
					escreva("\nDigite o credito da movimentação: ")
					leia(creditoMovimentacao)
					se(creditoMovimentacao>0)
					{	
						saldo += creditoMovimentacao
					}
					senao
					{
						escreva("Transação não autorizada")				
					}
				}	
					escreva("\nO total da transação do dia foi: ",saldo," R$")
		
				escreva("\nSolicite um emprestimo: ")
				leia(emprestimo)
			se (emprestimo<=emprestimoEmpresa)
			{
				escreva("\nO emprestimo da empresa é de: ",emprestimoEmpresa)
				emprestimoEmpresa -= emprestimo
				saldo += emprestimo
				escreva("\nO seu saldo ficou: ",saldo)
				escreva("\nO que restou foi: ", emprestimoEmpresa)		
				escreva("\n")
			}
			senao
			{
				escreva("\nEmprestimo solicitado invalido!\n")
				
			}
		}
		senao
		{
			escreva("Escolha Inválida")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1851; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */