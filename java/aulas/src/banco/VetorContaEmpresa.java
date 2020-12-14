package banco;

import java.util.Scanner;

public class VetorContaEmpresa {
		public static void main(String[] args)
		{
			Scanner teclado = new Scanner(System.in);
			/*
			 * EMPRESA - EMPRESTIMO [1000 - 10000] - PODE PEDI EMPRESTADO 
			 * O VALOR A QUALQUER TEMPO, NÃO PODE FICA NEGATIVO. O EMPRESTIMO
               É SOLICITADO.
			   O SALDO DO EMPRESTIMO É CORRIGIDO A CADA USO.
			 */
			int emprestimo;
			double saldo=0.0, emprestimoEmpresa=10000.00;
			char simNop,menuzin;
			System.out.println("Deseja um emprestimo da empresa?");
			System.out.println("[1] - SIM   /   [2] - NÃO");
			simNop=teclado.next().charAt(0);
			if(simNop=='1')
			{
				System.out.println("Solicite o valor do emprestimo: ");
				emprestimo=teclado.nextInt();
				if(emprestimo<=emprestimoEmpresa)
				{
					System.out.println("O emprestimo da empresa é de: "+emprestimoEmpresa);
				emprestimoEmpresa -= emprestimo;
				saldo += emprestimo;
				System.out.println("O que resta do emprestimo: "+emprestimoEmpresa);
				System.out.println("O seu saldo agora é: "+saldo);
				}
				else {
					System.out.println("Emprestimo solicidado inválido!");
				}
			}
			else if(simNop=='2')
			{
				System.out.println("CONTINUANDO..");
			}
		}
		/*
		 * escreva("\nSolicite um emprestimo: ")
				leia(emprestimo)
			se (emprestimo<=emprestimoEmpresa)
			{
				escreva("\nO emprestimo da empresa é de: ",emprestimoEmpresa)
				emprestimoEmpresa -= emprestimo
				saldo += emprestimo
				escreva("\nO seu saldo ficou: ",saldo)
				escreva("\nO que restou foi: ", emprestimoEmpresa)		
				escreva("\n")
			}
			senao
			{
				escreva("\nEmprestimo solicitado invalido!\n")
				
			}
		 */
		
		/*public static double Volta(double emprestimoEmpresa)
		{
			
		}*/
		
}
