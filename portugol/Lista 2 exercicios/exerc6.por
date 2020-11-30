programa
{
	
	funcao inicio()
	{
		/*
		 * Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
			Infantil A = 5 a 7 anos
			Infantil B = 8 a 11 anos
			Juvenil A = 12 a 13 anos
			Juvenil B = 14 a 17 anos
			Adultos = Maiores de 18 anos 
		 */

		inteiro nadador

		escreva("Digite sua idade: ")
		leia(nadador)
		se (nadador>=0){	
			se (nadador>=5 e nadador<=7){
				escreva("Infantil A")
			}
			senao se (nadador>=8 e nadador<=11){
				escreva("Infantil B")
			}
			senao se (nadador>=12 e nadador<=13){
				escreva("Juvenil A")
			}
			senao se (nadador>=14 e nadador<=17){
				escreva("Juvenil B")
			}
			senao se (nadador>=18){
				escreva("Adultos")
			}
			senao {
				escreva("Você não pode competir!")
			}
		}	
		senao {
			escreva("Você digitou idade inválida.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 377; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */