import java.util.Scanner;
 


public class String17 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String primeiraFrase = "";
		String segundaFrase = "";
		
		System.out.print("Digite uma frase: ");
		primeiraFrase = leiaStr.nextLine();
		
		System.out.print("Digite mais uma frase: ");
		segundaFrase = leiaStr.nextLine();
		
		if (primeiraFrase.length() != segundaFrase.length()){
		
			System.out.println("As frases sao diferentes.");
			return;
		} 
		
		for (int i = 0; i < primeiraFrase.length(); i++){
		
			if (primeiraFrase.charAt(i) != segundaFrase.charAt(i)){
				System.out.println("As frases sao diferentes.");
				return;
			}
			
		}
		
		System.out.println("As frases sao iguais!");
	}	
}

