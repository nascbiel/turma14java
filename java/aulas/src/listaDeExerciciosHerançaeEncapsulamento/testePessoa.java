package listaDeExerciciosHerançaeEncapsulamento;

public class testePessoa {
		public static void main(String[] args)
		{
			Pessoa individuo = new Pessoa();
			Fornecedor ramon = new Fornecedor();
			
			//1
			individuo.setNome("Larissa");
			individuo.setEndereco("Rua xxxx, numero 222");
			individuo.setTelefone("948899443");
			System.out.println(individuo.getNome());
			System.out.println(individuo.getEndereco());
			System.out.println(individuo.getTelefone());
			
			//2
			ramon.setNome("Ramon");
			ramon.setValorCredito(10000.00);
			ramon.setValorDivida(4000.00);
			
			System.out.println("Ola senhor "+ramon.getNome());
			System.out.println("O seu valor de Credito era "+ramon.getValorCredito());
			System.out.println("O seu valor de Divida foi "+ramon.getValorDivida());
			ramon.obterSaldo();
			
		}
}
