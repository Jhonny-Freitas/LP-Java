import java.util.Scanner;
 


public class String21 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String frase = "";
		
		System.out.print("Escreva uma frase qualquer: ");
		frase = leiaStr.nextLine().trim();
		
		frase = frase.replace(" ", "\n");
		
		System.out.println(frase);
	}	
}

