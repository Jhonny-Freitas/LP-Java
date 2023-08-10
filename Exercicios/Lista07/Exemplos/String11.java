import java.util.Scanner;

public class String11 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
		
		String vogais = "bcdfghjklmnpqrstvwxyz";
			
		int contador = 0;
		
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine().toLowerCase();
	
	
		for(int v = 0; v < vogais.length(); v++){
				
			for(int i = 0; i < frase.length(); i++){
					
				if( frase.charAt(i) == vogais.charAt(v) ){
						
					contador++;
				}
				
			}
		}
		
		System.out.println("Quantidade de letras: " + contador);	
	
	}
}

