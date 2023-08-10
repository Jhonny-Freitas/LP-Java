/*
 * String01.java
 */
 import java.util.Scanner;
 


public class String07 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String frase = "";
		
		int contador = 0;
		
		System.out.print("Escreva uma frase qualquer: ");
		frase = leiaStr.nextLine().toUpperCase().trim();
		
		
		for (char letra = 'A'; letra <= 'Z'; letra++){
			
			contador = 0;
			
			for(int i = 0; i <= frase.length() - 1 ; i++){
			
				if (frase.charAt(i) == letra) contador++;
			
			} 
				
			System.out.println(letra + " - " + contador);

		}
		
	}
}

