package listaExPOO;

import java.util.Scanner;

public class testeFuncionario {

	public static void main(String[] args) {
		/*
		 * Crie uma classe funcionário e apresente os atributos e 
		 * métodos referentes esta classe, em seguida crie um objeto 
		 * funcionário, defina as instancias deste objeto e apresente 
		 * as informações deste objeto no console.
		 */
		Scanner teclado= new Scanner(System.in);
		Funcionario trabalhador=new Funcionario();
		
		trabalhador.cargoFuncao="Atendente";
		trabalhador.dataAdmissão="14/12/2020";
		trabalhador.remuneracao=1000.00;
		trabalhador.localTrabalho="Americanas,das 9:00hrs ás 21:00hrs";
		trabalhador.ferias="10/06/2021";
		
		System.out.println("Número de Inscrição do Trabalhador:");
		trabalhador.identificacaoNumero=teclado.nextInt();
		System.out.println("data de admissão:"+trabalhador.dataAdmissão);
		System.out.println("cargo:"+trabalhador.cargoFuncao);
		System.out.println("remuneração e forma de pagamento:"+trabalhador.remuneracao);
		System.out.println("local e horário de trabalho:"+trabalhador.localTrabalho);
		System.out.println("concessão de férias:"+trabalhador.ferias);
		System.out.println("Houve acidente no trabalho?");
		System.out.println("[S] para sim / [N] para não");
		trabalhador.acidenteTrabalho=teclado.next().toUpperCase().charAt(0);
		trabalhador.acontecerAcidente(trabalhador.acidenteTrabalho);
	}

}
