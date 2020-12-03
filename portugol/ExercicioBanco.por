programa
{
	
	funcao inicio()
	{
		/*
		 * - SOLICITAR UM EMPRESTIMO DEFINI O VALOR POSSIVEL E 
		 * SE SIM COLOCAR SALDO
		 */

		//variaveis
		const inteiro TAMANHO = 10
		real vetor[TAMANHO], emprestimoEmpresa=10000.00, credito=0.0, debito=0.0
		real saldo=0, emprestimo=0.0, saldoTotal=0.0
		inteiro = x
		caracter acesso
		
			linha()
			escreva("\n  SEJA BEM VINDO AO BANCO G8\n")
			linha()
			escreva("\nO número da conta é: 01")
			escreva("\nSeu saldo atual: 0.00 R$")
			escreva("\nO seu CPF é: 444555666-88")
			escreva("\nO emprestimo da empresa é de: ",emprestimoEmpresa)

			para(x=0;x<TAMANHO;x++)
			{
				se(x>=0)
				{
				escreva("\nDigite o débito do dia ",x+1,": ")
				leia(debito)
				escreva("\nDigite o credito do dia ",x+1,": ")
				leia(credito)
				saldo = debito-credito
				escreva("O total do dia ",x+1," foi: ",saldo," R$")
				escreva("\n")
				}	
				senao
				{
					escreva("\nSaldo Negativo!")
					pare
				}
			}
			saldoTotal = saldoTotal + saldo
			
			escreva("\nSolicite um emprestimo: ")
			leia(emprestimo)

			se (emprestimo<=emprestimoEmpresa)
			{
				saldo = emprestimoEmpresa - emprestimo
				saldoTotal = saldoTotal + emprestimo

				
				escreva("\nO saldo total depois do emprestimo ficou: ",saldoTotal)
				escreva("\nO que restou foi: ", saldo)				
				escreva("\n")
				
			}
			senao{
				escreva("\nEmprestimo solicitado invalido!\n")
				
			}
			
			
			
			escreva("\nDeseja continuar?")
			escreva("\nDigite [S] para SIM")
			escreva("\nDigite [N] para NÃO")
			escreva("\nDigite a letra desejada: ")
			leia(acesso)
			se (acesso == 'S' ou acesso == 's' )
			{
				limpa()
				linha()
			escreva("\n  SEJA BEM VINDO AO BANCO G8\n")
			linha()
			escreva("\nO número da conta é: 01")
			escreva("\nSeu saldo atual: 0.00 R$")
			escreva("\nO seu CPF é: 444555666-88")
			escreva("\nO emprestimo da empresa é de: ",emprestimoEmpresa)

			para(x=0;x<TAMANHO;x++)
			{
				se(x>=0)
				{
				escreva("\nDigite o débito do dia ",x+1,": ")
				leia(debito)
				escreva("\nDigite o credito do dia ",x+1,": ")
				leia(credito)
				saldo = debito-credito
				escreva("O total do dia ",x+1," foi: ",saldo," R$")
				escreva("\n")
				}	
				senao
				{
					escreva("\nSaldo Negativo!")
					pare
				}
			}
			saldoTotal = saldoTotal + saldo
			
			escreva("\nSolicite um emprestimo: ")
			leia(emprestimo)

			se (emprestimo<=emprestimoEmpresa)
			{
				saldo = emprestimoEmpresa - emprestimo
				saldoTotal = saldoTotal + emprestimo

				
				escreva("\nO saldo total depois do emprestimo ficou: ",saldoTotal)
				escreva("\nO que restou foi: ", saldo)				
				escreva("\n")
				
			}
			senao{
				escreva("\nEmprestimo solicitado invalido!\n")
				
			}
			
			
			
			escreva("\nDeseja continuar?")
			escreva("\nDigite [S] para SIM")
			escreva("\nDigite [N] para NÃO")
			escreva("\nDigite a letra desejada: ")
			leia(acesso)
			}	
			senao se (acesso == 'N' ou acesso == 'n')
			{
				limpa()
				escreva("\nObrigado e retorne sempre!! :D\n")
			}
	
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
 * @POSICAO-CURSOR = 261; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */