import java.util.Scanner;
import java.util.Random;
// Jhonny Miguel de Freitas

public class ProvaEx3 {
	
	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int tamanho = random.nextInt(20 - 5 + 1) + 5; // gera um tamanho aleatório entre 5 e 20 para o votor V
		
		int min = 42,
		max = 73;
		
		do {
			
			
		
		
		
		int [] V = new int[tamanho];
		
		for ( int i = 0 ; i < tamanho ; i++) V[i] = random.nextInt(max - min + 1) + min; // gera vetor com numeros leatorios no intervalo dado
		
		
		// substitui valores repetidos
		for ( int i = 0 ; i < tamanho ; i++){
			
			for (int j = i + 1 ; j < tamanho ; j++){
				
				if(V[i] == V[j]) V[j] = random.nextInt(max - min + 1) + min;
			
			}
			
		}
		
		System.out.println("Vetor V de tamanho: " + tamanho);
		
		System.out.print("\nElementos do vetor V: ");
		
		for (int i : V){
		
			System.out.print( i + " ");
		
		}
		
		//utiliza o Bubble Sort para ordenar o os elementos pares de forma crescente
		
		for (int i = 0 ; i < tamanho ; i++){
		
			// verifica se o elemento em questão é par
			if (V[i] % 2 == 0){
			
				// compara o elemento em i com os próximos elementos do Array
				for (int j = i + 1 ; j < tamanho ; j++){
					
					// verifica se o elemento em j também é par
					if (V[j] % 2 == 0){
						
						// verifica se o elemento em i é maior que o elemento em j
						if (V[i] > V[j]){
						
							int aux = V[i]; // guarda o valor de V[i]
							V[i] = V[j]; // troca o elemento de menor valor V[j] com o V[i] (mais para o inicio do array)
							V[j] = aux; // atribui o elemento de maior valor a V[j] (mais para o fim do array)
						
						}
					
					}
				
				
				}
			
			}
		
		}
		
		System.out.print("\n\nVetor V ordenado: ");
		
		for (int i : V){
		
			System.out.print( i + " ");
		
		}
		
	}
}

