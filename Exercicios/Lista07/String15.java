import java.util.Scanner;
 


public class String15 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String frase = "";
		int contador = 0;
		
		System.out.print("Digite uma frase qualquer: ");
		frase = leiaStr.nextLine();
		
		for (int i = 0; i < frase.length(); i++){
		
			if (frase.charAt(i) >= '0' && frase.charAt(i) <= '9') contador++;
		
		}
		
		System.out.println("A frase digitada possui " + contador + " caracteres numericos.");
	}
}

