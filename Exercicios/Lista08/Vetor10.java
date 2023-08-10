import java.util.Scanner;
import java.util.Arrays;

public class Vetor10 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int tamanho = 5;
		int pares = 0;
		
		int[] PA = new int[tamanho];
		int[] PB = new int[tamanho];
		int[] PC = new int[tamanho * 2];
		
		
		
		System.out.println("Entre com os 5 numeros inteiros do primeiro vetor: ");
		for ( int i = 0; i < tamanho ; i++){
	
			PA[i] = leia.nextInt();
			PC[i] = PA[i];
			
		}
		
		
		System.out.println("\nEntre com os 5 numeros inteiros do segundo vetor: ");
		for ( int i = 0; i < tamanho ; i++){
	
			PB[i] = leia.nextInt();
			PC[PA.length + i] = PB[i];
			
		}
		
		System.out.println("\nO novo vetor formado com a concatenacao entre os vetores dados eh: ");
		
		for (int i : PC){
		
			System.out.print( i + " " );
		
		}
	}
}

