programa
{
	
	funcao inicio()
	{
		/*
		 * - SOLICITAR UM EMPRESTIMO DEFINI O VALOR POSSIVEL E 
		 * SE SIM COLOCAR SALDO
		 */

		//variaveis
		const inteiro TAMANHO = 2
		real movimentacao[TAMANHO], emprestimoEmpresa=10000.00, credito=0.0, debito=0.0
		real saldo=0, emprestimo=0.0, saldoTotal=0.0
		inteiro = x
		caracter acesso, opcao
		
			linha()
			escreva("\n  SEJA BEM VINDO AO BANCO G8\n")
			linha()
			escreva("\nO número da conta é: 01")
			escreva("\nSeu saldo atual: 0.00 R$")
			escreva("\nO seu CPF é: 444555666-88")
			escreva("\nO emprestimo da empresa é de: ",emprestimoEmpresa)
			faca{
				para(x=0;x<TAMANHO;x++)
				{
				escreva("\nDigite [1] para debito")
				escreva("\nDigite [2] para credito: ")
				leia(opcao)
				se(opcao == '1')
				{
				escreva("\nDigite o débito da movimentação: ")
				leia(debito)
					se(debito>saldo ou debito<0)
					{
						escreva("Transação não autorizada")
					}
					senao 
					{
						saldo = saldo - debito
						movimentacao[x]= saldo					
					}
					
				}
				senao se (opcao == '2')
				{	
					escreva("\nDigite o credito da movimenteção: ")
					leia(credito)
					se(credito>0)
					{	
						saldo = saldo+credito
						movimentacao[x]= saldo
					}
					senao 
					{
						escreva("Transação não autorizada")
					}
				}	
				escreva("\nO total da transação foi: ",saldo," R$")
				escreva("\n")
			}	
			
			escreva("\nSolicite um emprestimo: ")
			leia(emprestimo)

			se (emprestimo<=emprestimoEmpresa)
			{
				emprestimoEmpresa = emprestimoEmpresa - emprestimo
				saldoTotal = saldo + emprestimo
				
				escreva("\nO saldo total depois do emprestimo ficou: ",saldoTotal)
				escreva("\nO que restou foi: ", emprestimoEmpresa)	
							
				escreva("\n")
				
			}
			senao
			{
				escreva("\nEmprestimo solicitado invalido!\n")
				
			}
			
			
			
			escreva("\nDeseja continuar?")
			escreva("\nDigite [S] para SIM")
			escreva("\nDigite [N] para NÃO")
			escreva("\nDigite a letra desejada: ")
			leia(acesso)
		}enquanto(acesso == 'S' ou acesso == 's' )
			
	
			
				/*se (acesso == 'S' ou acesso == 's' )
				{
				limpa()
				
				
				}	
				senao se (acesso == 'N' ou acesso == 'n')
				{
				limpa()
				escreva("\nObrigado e retorne sempre!! :D\n")
				}*/
	
	}
	
	funcao linha()
	{
		escreva("===============================")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1444; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */