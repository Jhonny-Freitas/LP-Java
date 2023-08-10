import java.util.Scanner;

public class Vetor05 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int vetoresLength;
		
		
		do{
		
			System.out.print("Digite quantos elementos voce quer no vetor (Deve ser um numero inteiro entre 1 e 15): ");

			vetoresLength = leia.nextInt();
		
		}while(vetoresLength < 1 || vetoresLength > 15);
		
		int[] vetor1, vetor2, soma;
		
		vetor1 = new int[vetoresLength];
		vetor2 = new int[vetoresLength];
		soma = new int [vetoresLength];
		
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
		
		System.out.println("\nA soma dos vetores eh igual a:  ");
		for (int i =  0 ; i < vetoresLength ; i++ ){
		
			soma[i] = vetor1[i] + vetor2[i];
		
		}
		
		for (int elemento : soma) {
		
			System.out.print( elemento + " ");
		
		}
		
	}
}

