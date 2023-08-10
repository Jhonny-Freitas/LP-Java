import java.util.Scanner;
 


public class String20 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String frase = "";
		int contador = 1;
		
		System.out.print("Escreva uma frase qualquer: ");
		frase = leiaStr.nextLine().trim();
		
		if (frase.length() < 1){
			
			System.out.println("A frase deve conter pelo menos uma palvra.");
			return;
		
		}

		for (int i = 0 ; i < frase.length() ; i++){
			
			if (frase.charAt(i) == ' ') contador++;
		
		}
		
		System.out.println((frase.length() == 1) ? "Voce digitou apenas uma letra." : "A frase possui " + contador + " palavras.");
	}	
}

