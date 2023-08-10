import java.util.Scanner;
 


public class String22 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String frase = "";
		String palavra = "";
		String recorte = "";
		
		int contador = 0;
		
		System.out.print("Escreva uma frase qualquer: ");
		frase = leiaStr.nextLine().trim();
		
		System.out.print("Escreva uma palavra: ");
		palavra = leiaStr.nextLine().trim();

		for (int i = 0 ; i <= frase.length() - palavra.length(); i++){
		
			recorte = frase.substring( i, i + palavra.length());
			
			if (recorte.equalsIgnoreCase(palavra)) contador++;
		
		}
				
		System.out.println("A palavra " + palavra + " aparece " + contador + " vezes na frase.");
	}	
}

