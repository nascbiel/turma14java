package listaExerciciosHerancaEPolimorfismo;

public class Cavalo extends Animal{
	
	public void corra() 
	{
		System.out.println("correndo..");
	}
	
@Override
	public void emitirSom()
	{
		System.out.println("hinn in in");
	}

}
