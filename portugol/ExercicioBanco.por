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
		real vetor[TAMANHO], emprestimoEmpresa=10000.00, credito=0.0, debito=0.0
		real saldo=0.0, emprestimo=0.0, saldoTotal=0.0, totalGasto = 0.0, conta=0.0,emprestimoEstudante=1000.00,dinheiroAcumulado=1000.00,creditoSoma, total
		cadeia alunos [] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima",
		"Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira",
		"Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires",
		"Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
		"HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior",
		"Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da Silva","Luis felipe da silva",
		"Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins",
		"Verônica Navarro Almena"}
		caracter generos [] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M',
		'M','M','M','F','F','M','F','M'}
		inteiro = x
        	inteiro cpf
        	inteiro diaAniversario
        	inteiro diaAtual
		caracter acesso, opcao, simNao, menu
		
			escreva("==================================")
			escreva("\n    SEJA BEM VINDO AO BANCO G8\n")
			escreva("==================================\n")
			escreva("\nO número da conta é: ")
			leia(conta)
			escreva("\nSeu saldo atual: 0.00 R$")
			escreva("\nO seu CPF é: 444555666-88")

			/*
			 * Conta Poupança
			Conta Empresa
			Conta Corrente
			Conta Especial
			conta universitária
			 */

			escreva("\nDigite 1- para Conta Poupança")
			escreva("\nDigite 2- para Conta Especial")
			escreva("\nDigite 3- para Conta Universitária")
			escreva("\nDigite 4- para Conta Empresa: ")
			leia(menu)
			
			
			se(menu == '4'){
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
			senao se(menu=='1'){
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
				escreva("\nO seu CPF é: " )
            		leia(cpf)
            		escreva("\nData de aniversário:")
            		leia(diaAniversario)
            		escreva("Digite o dia de hoje:")
            		leia(diaAtual)
            		para(x=1;x<=TAMANHO;x++){
            		escreva("\nDigite o credito do dia ",x,": ")
            		leia(credito)
            		escreva("Digite o débito do dia ",x,": ")
            		leia(debito)
            		se(diaAniversario == diaAtual){
            		escreva("Feliz Aniversário, você recebeu um acrescimo de 0,5% na sua conta!!!")
            		creditoSoma = credito * (0.5 / 100)
            		credito = credito + creditoSoma
            		escreva("\nSeu credito agora  de:",credito)
            		}
            		total = credito - debito
            		se(total<=0){
            	 	escreva("\nSaldo insuficiente!")
            		 pare
            	}	
		}
			
	
	}
			senao se(menu=='2')
			{
				
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
					
				escreva("\nO total da transação foi: ",saldo," R$")
				escreva("\n")
					}	
				escreva("O total do dia ",x+1," foi: R$ ", total, "\nSeu limite é de R$ ",emprestimoEmpresa)
            		escreva("\n")
            		se(emprestimoEmpresa < 0){
            			escreva("Deseja usar seu limite? [S] [N] ");
            			leia(simNao)
            			se(simNao == 'S' ou simNao == 's')
            				{
            				emprestimoEmpresa -= total
            				escreva("Você está utilizando um limite de R$1000")
            				pare 
            				}
            				senao se(simNao == 'N' ou simNao == 'n')
            				{
            					escreva("Volte sempre!")
            					pare
            				}
            				}
            			}
			}

			
            			senao se(acesso == 'N' ou acesso == 'n'){
            				escreva("\nMuito obrigada e volte sempre!")
            				pare
            		}
            	}
            	senao se(menu=='3'){
            		
			 se escreva ("Deseja saber seu saldo? Digite 1 ")
            		escreva ("Para consultar empréstimo digite 2: ")
            		leia (opcaoMenu)
            	 se (opcaoMenu =='1' ) {          		
            		escreva ("Olá, seu saldo atual é de: ", total)
            	 }	
            	senao se (opcaoMenu == '2'){
            	escreva ("Olá, seu limite para emprestimos é: ", emprestimoEstudante)
            	}
	
			}
			senao {
				escreva("\nCodigo Insulficiente")
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
 * @POSICAO-CURSOR = 1894; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */