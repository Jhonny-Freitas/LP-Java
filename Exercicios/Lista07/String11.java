import java.util.Scanner;
 


public class String11 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String frase = "";
		
		int contadorNumero = 0;
		int contadorLetra = 0;
		
		
		System.out.print("Escreva uma frase qualquer: ");
		frase = leiaStr.nextLine().toUpperCase();
		
		for (int i = 0; i < frase.length(); i++){
			
			if (frase.charAt(i) >= '0' && frase.charAt(i) <= '9' ) contadorNumero++;
			
			if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z' ) contadorLetra++;
			
		}
		
		System.out.println("A frase digitada possui " + contadorLetra + " letras e" + contadorNumero + " numeros.");
		
		
	}
}

