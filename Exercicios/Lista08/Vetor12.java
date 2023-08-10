import java.util.Scanner;
import java.util.Arrays;

public class Vetor12 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int tamanhoP = 10,
		tamanhoQ = 15,
		tamanhoR = tamanhoP + tamanhoQ;
		
		int[] P = new int[tamanhoP];
		int[] Q = new int[tamanhoQ];
		int[] R = new int[tamanhoR];
		
		
		
		System.out.println("Entre com os 10 numeros inteiros do primeiro vetor: ");
		for ( int i = 0; i < tamanhoP ; i++){
	
			P[i] = leia.nextInt();
			R[i] = P[i];
			
		}
		
		
		System.out.println("\nEntre com os 15 numeros inteiros do segundo vetor: ");
		for ( int i = 0; i < tamanhoQ ; i++){
	
			Q[i] = leia.nextInt();
			R[P.length + i] = Q[i];
			
		}
		
		System.out.println("\nO novo vetor formado com a concatenacao entre os vetores dados eh: ");
		
		for (int i : R){
		
			System.out.print( i + " " );
		
		}
	}
}

