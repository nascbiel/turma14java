package listaExerciciosHerancaEPolimorfismo;

public class Cachorro extends Animal {
	
	public void corra() 
	{
		System.out.println("correndo..");
	}
	
	@Override	
	public void emitirSom()
	{
		System.out.println("au au");
	}
}
