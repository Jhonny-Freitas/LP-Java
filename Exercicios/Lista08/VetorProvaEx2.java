import java.util.Random;

public class VetorProvaEx2 {
	
	public static void main (String[] args) {
		Random random = new Random();
		
		String resultado = "";
		int contador = 1;
		
		int tamanho = 5; // Define o tamanho dos vetores
		
		boolean[] vetor = new boolean[tamanho]; //Declaranado o novo vetor boolean
		
		
		//gera os valores boolean aleatórios e atribui a cada posição do vetor
		for (int i = 0 ; i < tamanho ; i++){
		
			vetor[i] = random.nextBoolean();
		
		}
		
		String[] novoVetor = new String [tamanho]; // declarando vetor que vai receber os 0 e 1
		
		
		//atribui os valores 0 ou 1 para o novo vetor
		for (int i = 0; i < tamanho ; i++){
		
			novoVetor[i] = vetor[i] ? "1" : "0"; //operador ternario, se o valor na posição i for true ele substitui por 1
		
		}
		
		//printa o vetor de 0 e 1
		for (String i : novoVetor){
		
			System.out.print(i + " ");
		
		}
		
		for (int i = 1 ; i < tamanho ; i++){
		
			if (novoVetor[i].equals(novoVetor[i-1])) {
				contador++;
			} else {
			
				resultado += novoVetor[i-1] + "," + contador + ",";
				contador = 1;
			
			}
		
		}
		
		resultado += novoVetor[novoVetor.length - 1] + "," + contador;
		
		System.out.println("\n" + resultado);
		
	}
}

