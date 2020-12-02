programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria
		 * a) Uma matriz M1 cujos elementos serão as somas dos elementos de 
		 * mesma posição das matrizes N1 e N2;
		   b) Uma matriz M2 cujos elementos serão as diferenças 
		   dos elementos de mesma posição das matrizes N1 e N2
		 */
		//variaveis - vetores e matrizes
		const inteiro LINHA=4, COLUNA=6
		inteiro N1[LINHA][COLUNA],N2[LINHA][COLUNA]  //0-3 0-5
		inteiro M1[LINHA][COLUNA],M2[LINHA][COLUNA]
		
		escreva("DADOS DE N1\n")
		para (inteiro linha=0;linha<LINHA; linha++)
		{
			para (inteiro coluna=0; coluna<COLUNA; coluna++)
			{
				//magica
				N1[linha][coluna]=Util.sorteia(3, 4)
				escreva(N1[linha][coluna]," ")
				
			}
			escreva("\n")
		}
		escreva("\n")
		escreva("DADOS DE N2\n")
		para (inteiro linha=0;linha<LINHA; linha++)
		{
			para (inteiro coluna=0; coluna<COLUNA; coluna++)
			{
				//magica
				N2[linha][coluna]=Util.sorteia(1, 2)
				escreva(N2[linha][coluna]," ")
				
			}
			escreva("\n")
		}
		escreva("\n")
		escreva("DADOS DE M1\n")
		para (inteiro linha=0;linha<LINHA; linha++)
		{
			para (inteiro coluna=0; coluna<COLUNA; coluna++)
			{
				//magica
				
				M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna]
				escreva(M1[linha][coluna]," ")
				
			}
			escreva("\n")
		}
		escreva("\n")
		escreva("DADOS DE M2\n")
		para (inteiro linha=0;linha<LINHA; linha++)
		{
			para (inteiro coluna=0; coluna<COLUNA; coluna++)
			{
				//magica
				
				M2[linha][coluna]=N1[linha][coluna]-N2[linha][coluna]
				escreva(M2[linha][coluna]," ")
				
			}
			escreva("\n")
		}
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 361; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */