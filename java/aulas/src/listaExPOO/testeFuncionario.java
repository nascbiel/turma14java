package listaExPOO;

import java.util.Scanner;

public class testeFuncionario {

	public static void main(String[] args) {
		/*
		 * Crie uma classe funcion�rio e apresente os atributos e 
		 * m�todos referentes esta classe, em seguida crie um objeto 
		 * funcion�rio, defina as instancias deste objeto e apresente 
		 * as informa��es deste objeto no console.
		 */
		Scanner teclado= new Scanner(System.in);
		Funcionario trabalhador=new Funcionario();
		
		trabalhador.cargoFuncao="Atendente";
		trabalhador.dataAdmiss�o="14/12/2020";
		trabalhador.remuneracao=1000.00;
		trabalhador.localTrabalho="Americanas,das 9:00hrs �s 21:00hrs";
		trabalhador.ferias="10/06/2021";
		
		System.out.println("N�mero de Inscri��o do Trabalhador:");
		trabalhador.identificacaoNumero=teclado.nextInt();
		System.out.println("data de admiss�o:"+trabalhador.dataAdmiss�o);
		System.out.println("cargo:"+trabalhador.cargoFuncao);
		System.out.println("remunera��o e forma de pagamento:"+trabalhador.remuneracao);
		System.out.println("local e hor�rio de trabalho:"+trabalhador.localTrabalho);
		System.out.println("concess�o de f�rias:"+trabalhador.ferias);
		System.out.println("Houve acidente no trabalho?");
		System.out.println("[S] para sim / [N] para n�o");
		trabalhador.acidenteTrabalho=teclado.next().toUpperCase().charAt(0);
		trabalhador.acontecerAcidente(trabalhador.acidenteTrabalho);
	}

}
