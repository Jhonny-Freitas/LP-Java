import java.util.Scanner;

 


public class String28 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String frase = "",
		frasesConcatenadas = "";
		
		System.out.print("Digite uma String qualquer: ");
		frase = leiaStr.nextLine();
	
		int length = frase.length();
		int halfLength = length/2;
		
		int teste = length + halfLength;
		
		String primeiraMetade = frase.substring(0, halfLength),
		segundaMetade = frase.substring(halfLength);
		
		System.out.println("Primeira metade: " + primeiraMetade);
		System.out.println("Segunda metade: " + segundaMetade);
		
		
		System.out.println(frasesConcatenadas);
		
	}	
}

