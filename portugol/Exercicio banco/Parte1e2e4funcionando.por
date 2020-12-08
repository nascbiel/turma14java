programa
{
	
	funcao inicio()
	{
		caracter menu, opcao, simNao, opcaoMenu
		real saldo=0.0,debitoMovimentacao=0.0,creditoMovimentacao=0.0,creditoSoma=0.0,emprestimo=0.0
		real emprestimoEmpresa=10000.00,emprestimoEstudante=500.00
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

				escreva("\nSolicite um emprestimo da sua conta especial: ")
				leia(emprestimo)
			se (emprestimo<=emprestimoEmpresa)
			{
				escreva("\nO emprestimo da sua é de: ",emprestimoEmpresa)
				emprestimoEmpresa -= emprestimo
				saldo += emprestimo
				escreva("\nO seu saldo ficou: ",saldo)
				escreva("\nO que restou foi: ", emprestimoEmpresa)
				se(emprestimoEmpresa<0)
				{
					escreva("Deseja usar seu limite? [S] [N] ");
            			leia(simNao)
            			se(simNao == 'S' ou simNao == 's')
            			{
            				emprestimoEmpresa -= saldo
            				escreva("Você está utilizando um limite de R$1000")
            			}
            			senao se(simNao == 'N' ou simNao == 'n')
            			{
            				escreva("Volte sempre!")         
            			}		
				}
				escreva("\n")
			}
			senao
			{
				escreva("\nEmprestimo solicitado invalido!\n")
				
			}
					
		}
		senao se(menu == '3')
		{
			escreva("\nConta Univertária")
			escreva ("\nDigite a opção desejada: ")
			escreva ("\nDeseja saber seu saldo? Digite 1 ")
          	escreva ("\nPara consultar empréstimo digite 2: ")
          	escreva ("\nPara realizar saque digite 3: ")
            	escreva ("\nPara realizar depósito digite 4: ")
          	leia (opcaoMenu)
          
          se (opcaoMenu =='1')
          {          		
            	escreva ("Olá, seu saldo atual é de: R$", saldo)
          }	
          senao se (opcaoMenu == '2')
          {
            	escreva ("Olá, seu limite para emprestimos é: R$", emprestimoEstudante)
          }
          senao se (opcaoMenu == '3')
          {
            		escreva ("Olá, digite o valor do saque: ")
            		leia (debitoMovimentacao)
            	se (debitoMovimentacao<saldo) 
            	{
            		escreva ("O saldo da conta é insuficiente, seu saldo atual é ", saldo)
            	}
            	senao  
            	{
            		saldo = emprestimoEstudante-debitoMovimentacao
            		escreva("Saque realizado no valor de: ",debitoMovimentacao, " saldo atual é de ",saldo)
            	}
          }
         	senao se (opcaoMenu == '4')
         	{
			escreva ("Digite o valor que deseja depositar: ")
			leia (creditoMovimentacao)
			saldo = creditoMovimentacao+emprestimoEstudante
			escreva ("Realizado depósito no valor de ",creditoMovimentacao, " seu saldo atual é de ", saldo)
		}	
                escreva("\nObrigado e retorne sempre!! :D\n")
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
 * @POSICAO-CURSOR = 491; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */