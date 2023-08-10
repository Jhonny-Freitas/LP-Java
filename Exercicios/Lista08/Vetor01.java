import java.util.Scanner;

public class Vetor01 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for (int i = 0 ; i < 5 ; i++){
		
			System.out.println("Entre com um número inteiro: ");
			a[i] = leia.nextInt();
		
		}
		
		for (int i = 0 ; i <= 4; i++){
			
			System.out.println( i + " --> " + a[i] );	
			
		}
		
	}
}

