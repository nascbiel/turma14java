programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Crie um programa que receba valores do usuário para 
		 * preencher uma matriz 3X3, e em seguida, exiba a soma 
		 * dos valores dela e a soma dos valores da primeira diagonal, 
		 * ou seja, diagonal principal.
		 */

		const inteiro LINHA = 3 ,COLUNA = 3
		inteiro mat[LINHA][COLUNA],l,c, soma=0, somaDiagonal=0

		para(l=0;l<LINHA;l++)
		{
			para(c=0;c<COLUNA;c++)
			{
				mat[l][c]=Util.sorteia(3,4)
				escreva(mat[l][c], " ")
				
			}
			escreva("\n")
		}
		
		

		para(l=0;l<LINHA;l++)
		{
			para(c=0;c<COLUNA;c++)
			{
				soma = mat[l][c]+soma
				se(mat[l][c]== mat[c][l])
				{
					somaDiagonal= somaDiagonal + mat[l][c]
				}
				
			}
		}
			escreva("\nResultado da soma de tudo: ",soma)
			escreva("\nResultado da diagonal foi: ",somaDiagonal)



		
		 
	}

	funcao linha(){
		escreva("-------------------------------------------------------")
	}
	funcao pula(){
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 764; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */