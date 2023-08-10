import java.util.Scanner;
import java.util.Arrays;

public class Vetor07 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int vetoresLength;
		
		
		do{
		
			System.out.print("Digite quantos elementos voce quer no vetor (Deve ser um numero inteiro entre 1 e 15): ");

			vetoresLength = leia.nextInt();
		
		}while(vetoresLength < 1 || vetoresLength > 15);
		
		int[] vetor1, vetor2;
		
		vetor1 = new int[vetoresLength];
		vetor2 = new int[vetoresLength];
		
		System.out.println("\nEntre com os elementos do vetor1: ");
		for (int i = 0 ; i < vetor1.length ; i++){
			
			System.out.print((i+1) + ") Entre com um numero: ");
			vetor1[i] = leia.nextInt();
		}
		
		System.out.println("\nEntre com os elementos do vetor2: ");
		for (int i = 0 ; i < vetor2.length ; i++){
			
			System.out.print((i+1) + ") Entre com um numero: ");
			vetor2[i] = leia.nextInt();
		}
		
		Arrays.sort(vetor1);
		Arrays.sort(vetor2);
		
		int menor1 = vetor1[0],
		maior1 = vetor1[vetor1.length - 1],
		menor2 = vetor2[0],
		maior2 = vetor2[vetor2.length - 1];
		
		
		System.out.println("\nO maior valor no vetor 1 eh: " + maior1);
		System.out.println("O menor valor no vetor 1 eh: " + menor1);

		System.out.println("\nO maior valor no vetor 2 eh: " + maior2);
		System.out.println("O menor valor no vetor 1 eh: " + menor2);
		
		
		
		
		
	}
}

