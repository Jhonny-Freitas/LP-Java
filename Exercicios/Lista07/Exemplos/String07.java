import java.util.Scanner;

public class String07 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
			
		int contador = 0;
		
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine().toUpperCase();
	
	
			
		for(int i = 0; i < frase.length(); i++){
				
			if(frase. charAt(i) == ' '){
					
				contador++;
			}
			
		}
		System.out.println("Quantidade de espaços em branco: " + contador);		
	
	}
}

