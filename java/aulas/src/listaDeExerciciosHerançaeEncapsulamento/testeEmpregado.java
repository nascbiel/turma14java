package listaDeExerciciosHerançaeEncapsulamento;

public class testeEmpregado {
	public static void main(String[] args)
	{
		Empregado claudia = new Empregado();
		
		claudia.setCodigoSetor(1);
		claudia.setSalarioBase(1500);	
		System.out.println("Codigo Setor:"+claudia.getCodigoSetor());
		System.out.println("Salario bruto:"+claudia.getSalarioBase());
		claudia.calcularSalario();
	}
}
