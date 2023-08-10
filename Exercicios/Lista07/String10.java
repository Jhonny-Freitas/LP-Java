import java.util.Scanner;
 


public class String10 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String frase = "";
		
		int contador = 0;
		
		
		System.out.print("Escreva uma frase qualquer: ");
		frase = leiaStr.nextLine();
		
		for (int i = 0; i < frase.length(); i++){
			
			if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z' ) contador++;
			
		}
		
		System.out.println("A frase digitada possui " + contador + " letras maiusculas.");
		
		
	}
}

