package listaExPOO;

public class testeAviao {
		public static void main(String[] args)
		{
			Aviao meuAviao = new Aviao();
			meuAviao.modelo="Airbus A320";
			meuAviao.motor="2x CFM International CFM56";
			meuAviao.velocidadeAtual=0;
			meuAviao.velocidadeMaxima=850;
			
			System.out.println("O modelo deste avião é "+meuAviao.modelo+" e o motor é o "+meuAviao.motor);
			meuAviao.liga();
			meuAviao.acelera(300);
			System.out.println("Velocidade atual "+meuAviao.velocidadeAtual);
			
		}
}
