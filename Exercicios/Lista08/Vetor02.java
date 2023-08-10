import java.util.Scanner;

public class Vetor02 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int bLength = 5;
		int[] b = new int[bLength];
		
		for (int i = 0 ; i < bLength ; i++){
		
			System.out.println("Entre com um numero inteiro: ");
			b[i] = leia.nextInt();
		
		}
		
		for (int i = bLength - 1 ; i >= 0; i--){
			
			System.out.println( i + " --> " + b[i] );	
			
		}
		
	}
}

