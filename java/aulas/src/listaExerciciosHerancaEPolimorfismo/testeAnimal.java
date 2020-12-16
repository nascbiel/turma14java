package listaExerciciosHerancaEPolimorfismo;

public class testeAnimal {
	public static void main(String[] args)
	{
		Cachorro spyke = new Cachorro();
		Cavalo peDePano = new Cavalo();
		Preguica bob = new Preguica();
		
		spyke.setNome("Spyke");
		spyke.setIdade(8);
		peDePano.setNome("Pe de Pano");
		peDePano.setIdade(5);
		bob.setNome("Bob");
		bob.setIdade(6);
		
		System.out.println("Nome: "+spyke.getNome()+" a idade:"+spyke.getIdade());
		spyke.corra();
		spyke.emitirSom();
		System.out.println();
		
		System.out.println("Nome: "+peDePano.getNome()+" a idade:"+peDePano.getIdade());
		peDePano.corra();
		peDePano.emitirSom();
		System.out.println();
		
		System.out.println("Nome: "+bob.getNome()+" a idade:"+bob.getIdade());
		bob.subirArvore();
		bob.emitirSom();
		
		
	}
}
