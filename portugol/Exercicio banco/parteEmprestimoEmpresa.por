programa
{
	
	funcao inicio()
	{

		const inteiro TAMANHO = 2
		caracter menu
		real conta, cpf
		
		real vetor[TAMANHO], emprestimoEmpresa=10000.00, credito=0.0, debito=0.0
		real saldo=0.0, emprestimo=0.0, saldoTotal=0.0
		inteiro x
		
		escreva("==================================")
		escreva("\n    SEJA BEM VINDO AO BANCO G8\n")
		escreva("==================================\n")

		escreva("\nDigite o número da sua conta: ")
		leia(conta)
		escreva("\nDigite seu CPF(sem os pontos): ")
		leia(cpf)

		escreva("\nOlá senhor(a) o saldo atual da sua conta é de: 0.00 R$")

		escreva("\nDigite a conta que deseja acessar")
		escreva("\n1 - Para Conta Poupança")
		escreva("\n2 - Para Conta Especial")
		escreva("\n3 - Para Conta Univertária")
		escreva("\n4 - Para Conta Empresa")
		escreva("\nDigite de acordo com o número que deseja: ")
		leia(menu)

		se(menu == '1')
		{
			escreva("Conta Poupança")
		}
		senao se(menu == '2')
		{
			escreva("Conta Especial")
		}
		senao se(menu == '3')
		{
			escreva("Conta ")
		}
		senao se(menu == '4')
		{
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
						debito=0
					}
					senao 
					{
						saldo = saldo - debito
						vetor[x]= saldo					
					}
					
				}
					senao se (opcao == '2')
					{	
					escreva("\nDigite o credito da movimenteção: ")
					leia(credito)
					se(credito>0)
					{	
						saldo = saldo+credito
						vetor[x]= saldo
					}
					senao 
					{
						escreva("Transação não autorizada")
						credito=0					
					}
					}	
						escreva("\nO total da transação foi: ",saldo," R$")
						escreva("\n")
				}	
			
			escreva("\nSolicite um emprestimo: ")
			leia(emprestimo)

			se (emprestimo<=emprestimoEmpresa)
			{
				escreva("\nO emprestimo da empresa é de: ",emprestimoEmpresa)
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
		}
		}
		
		senao
		{
			escreva("Número digitado Inválido")
		}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 95; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */