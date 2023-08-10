import java.util.Scanner;
import java.util.Arrays;

public class Vetor08 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int tamanho = 5;
		int soma = 0;
		
		int[] F = new int[tamanho];
		
		for ( int i = 0; i < tamanho ; i++){
		
		
			System.out.print("Entre com um numero inteiro: ");
			F[i] = leia.nextInt();
		
		
		}
		
		for (int i : F){
		
			if( i % 2 != 0 ) soma += i;
		}
		
		System.out.println((soma != 0 ) ? "A soma dos numeros impares eh igual a: " + soma : "Nenhum numero dado eh impar." );
	}
}

