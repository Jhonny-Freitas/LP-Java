import java.util.Scanner;
 


public class String09 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String frase = "";
		
		int contador = 0;
		
		char espaco = ' ';
		
		System.out.print("Escreva uma frase qualquer: ");
		frase = leiaStr.nextLine();
		
		for (int i = 0; i < frase.length(); i++){
			
			if (frase.charAt(i) == espaco) contador++;
			
		}
		
		System.out.println("A frase digitada possui " + contador + " espacos em branco.");
		
		
	}
}

