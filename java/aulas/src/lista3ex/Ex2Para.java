package lista3ex;

public class Ex2Para {
	public static void main(String[] args) {
		
		/*
		 * 2- Desenvolver um sistema que efetue a soma de todos 
		 * os n�meros �mpares que s�o  m�ltiplos de tr�s e que se 
		 * encontram no conjunto dos n�meros de 1 at� 500.
		 */
		
		int soma=0;
		
		for(int x=1;x<=500;x++)
		{
			if(x%2!=0 && x%3==0)
			{
				soma=x+x;
			}
		}
		System.out.println("Resultado: "+soma);
		
	}
}
