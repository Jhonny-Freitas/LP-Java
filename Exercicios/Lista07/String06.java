/*
 * String01.java
 */
 import java.util.Scanner;
 


public class String06 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String frase = "";
		
		String letra = "";
		
		int contador = 0;
		
		System.out.print("Escreva uma frase qualquer: ");
		frase = leiaStr.nextLine().toUpperCase();
		
		System.out.print("Agora escreva uma letra qualquer: ");
		letra = leiaStr.nextLine().toUpperCase();
		
		for (int i = 0; i < frase.length(); i++){
			
			if(frase.charAt(i) == letra.charAt(0)) contador++;
		}
		
		System.out.println("A letra " + letra + " aparece " + contador + " vezes na frase digitada.");
		
	}
}

