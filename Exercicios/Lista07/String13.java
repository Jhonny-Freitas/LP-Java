import java.util.Scanner;
 


public class String13 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String frase = "";
		
		String consoantes = "bcdfghjklmnpqrstvxwyz";
		
		int contador = 0;
		
		System.out.print("Digite uma frase qualquer: ");
		frase = leiaStr.nextLine().toLowerCase();
		
		
		for (int consoante = 0; consoante < consoantes.length(); consoante++){
			
			for (int letra = 0; letra < frase.length(); letra++){
			
				if 	(consoantes.charAt(consoante) == frase.charAt(letra)){
						
						contador++;
					
				} 	
			}
			 	
		}
		
		System.out.println("Quantidade de consoantes: " + contador);
	}
}

