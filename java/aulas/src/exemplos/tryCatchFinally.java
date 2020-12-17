package exemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tryCatchFinally 
{

	//codigo para ler txt
		public static void main(String[] args) {
			File file = new File("C:\\temp\\lista.txt");
			Scanner sc = null;
			try
			{
				sc = new Scanner(file);
				while (sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
			}
			catch (FileNotFoundException e) {
				System.out.println("Erro ao abrir arquivo: " + e.getMessage());
			}
			finally
			{
				if (sc != null) {
					sc.close();
				}
			}
		}
	
	
}
