import java.util.Scanner;

public class String08 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
			
		int contador = 0;
		
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine();
	
	
			
		for(int i = 0; i < frase.length(); i++){
				
			if(frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z'){
					
				contador++;
			}
			
		}
		System.out.println("Quantidade de caracteres maiusculos: " + contador);		
	
	}
}

