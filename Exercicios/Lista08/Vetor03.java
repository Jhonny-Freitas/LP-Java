import java.util.Scanner;

public class Vetor03 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int cLength;
		
		
		do{
		
			System.out.print("Digite quantos elementos voce quer no vetor (Deve ser um número inteiro entre 1 e 20): ");

			cLength = leia.nextInt();
		
		}while(cLength < 1 || cLength > 20);
		
		int[] c = new int[cLength];
		
		for (int i = 0 ; i < cLength ; i++){
		
			System.out.print( (i+1) + ") Entre com um numero inteiro: ");
			c[i] = leia.nextInt();
		
		}
		
		for (int i = 0 ; i < cLength; i++){
			
			System.out.println( i + " --> " + c[i] );	
			
		}
		
	}
}

