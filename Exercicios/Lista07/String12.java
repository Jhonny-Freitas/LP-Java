import java.util.Scanner;
 


public class String12 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String frase = "";
		
		String vogais = "aeiou";
		
		int contador = 0;
		
		System.out.print("Digite uma frase qualquer: ");
		frase = leiaStr.nextLine().toLowerCase();
		
		
		for (int vogal = 0; vogal < vogais.length(); vogal++){
			
			for (int letra = 0; letra < frase.length(); letra++){
			
				if 	(vogais.charAt(vogal) == frase.charAt(letra)){
						
						contador++;
					
				} 	
			}
			 	
		}
		
		System.out.println("Quantidade de vogais: " + contador);
	}
}

