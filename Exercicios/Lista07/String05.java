/*
 * String01.java
 */
 import java.util.Scanner;
 


public class String05 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String frase = "";
		
		int contador = 0;
		
		System.out.print("Escreva uma frase qualquer: ");
		frase = leiaStr.nextLine().toUpperCase();
		
		for (int i = 0; i < frase.length(); i++){
			
			if(frase.charAt(i) == 'A') contador++;
		}
		
		System.out.println("A letra 'a' aparece " + contador + " vezes na frase digitada.");
		
	}
}

