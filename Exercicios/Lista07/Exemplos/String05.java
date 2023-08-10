import java.util.Scanner;

public class String05 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
			
		int contador = 0;
		
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine().toUpperCase();
	
	
		for (char letra = 'A'; letra <= 'Z'; letra++){
			
			contador = 0;
			
			for(int i = 0; i < frase.length(); i++){
				
				if(frase. charAt(i) == letra){
					
					contador++;
				}
			
			}
			
			System.out.println(letra + " - " + contador);
		
		}
		
	}
}

