import java.util.Scanner;

public class String09 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
			
		int contadorNumero = 0;
		int contadorLetra = 0;
		
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine().toUpperCase();
	
	
			
		for(int i = 0; i < frase.length(); i++){
				
			if(frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z'){
					
				contadorLetra++;
			}
			
			if(frase.charAt(i) >= '0' && frase.charAt(i) <= '9'){
					
				contadorNumero++;
			}
			
		}
		System.out.println("Quantidade de letras: " + contadorLetra);
		System.out.println("Quantidade de numeros: " + contadorNumero);		
		
	
	}
}

