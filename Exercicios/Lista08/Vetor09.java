import java.util.Scanner;
import java.util.Arrays;

public class Vetor09 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int tamanho = 5;
		int pares = 0;
		int indiceH = 0;
		
		int[] G = new int[tamanho];
		
		for ( int i = 0; i < tamanho ; i++){
		
		
			System.out.print("Entre com um numero inteiro: ");
			G[i] = leia.nextInt();
			
		    if (G[i] % 2 == 0) pares++;
		
		}
		System.out.print(pares);
		
		int[] H = new int[pares];
		
		for (int i : G ){
			
			if(i % 2 == 0){
				
				H[indiceH] = i;
				indiceH++;
			
			}
			
		}
		
		if(pares != 0){
		
			System.out.println("\nO novo vetor contendo os elementos pares eh: ");
			
			for (int i : H){
		
			System.out.print(i + " ");
			
			}	
		
		} else {
			
			System.out.println("\nO vetor original nao possui valores pares.");
		
		}
		
	}
}

