import java.util.Scanner;

public class String04 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
		
		char letra;
		
		int contador = 0;
		
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine();
		
		System.out.print("Entre com uma letra: ");
		letra = leiaStr.nextLine().toLowerCase().charAt(0);
		
		
		for(int i = 0; i < frase.length(); i++){
			
			if(frase.toLowerCase().charAt(i) == letra){
				
			contador++;	
				
			}
		}
		
		System.out.println("\nO caracter \'" + letra + "\' apareceu: " + contador + " vezes.");
	}	
}

