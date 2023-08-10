import java.util.Scanner;
 


public class String24 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String sequenciaNumerica = "";
		int contador = 0;
		int maiorSequencia = Integer.MIN_VALUE;
			
		System.out.print("Digite uma sequencia numeria de 0 e 1: ");
		sequenciaNumerica = leiaStr.nextLine().trim();
		
		for ( int i = 0 ; i < sequenciaNumerica.length() ; i++){
			
			
			if (sequenciaNumerica.charAt(i) == '1' ){
			
				contador++;
			
			} else {
				
				contador = 0;
			
			}
			
			
			if (contador > maiorSequencia ) maiorSequencia = contador;
			
	
		}
		
		System.out.println("A maior sequencia de numeros 1 eh: " + maiorSequencia);
		
	}	
}

