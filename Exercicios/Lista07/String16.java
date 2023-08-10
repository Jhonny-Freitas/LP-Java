import java.util.Scanner;
 


public class String16 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String frase = "";
		int contador = 0;
		
		System.out.print("Digite uma frase qualquer: ");
		frase = leiaStr.nextLine();
		String fraseSemEspacos = frase.replaceAll(" ", "");
		
		for (int i = 0; i < fraseSemEspacos.length(); i++){
		
			if (fraseSemEspacos.charAt(i) >= 'A' && fraseSemEspacos.charAt(i) <= 'Z') contador++;
			
		
		}
		
		System.out.println((contador == fraseSemEspacos.length()) ? "Todos os caracteres da frase sao maiusculos" : "A frase não possui apenas caracteres maiusculos." );
		
	}
}

