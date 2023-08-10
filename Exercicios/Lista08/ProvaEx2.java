import java.util.Random;
import java.util.Scanner;

// Jhonny Miguel de Freitas

public class ProvaEx2 {
	
	public static void main (String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		String continuar = "S";
		String resultado = "";
		
		int tamanho = 5,
		indiceVetoresIntercalados = 0;
		
		int[] vetorBoolean = new int[tamanho]; // vetor que receberá os valores 0 e 1
		
		int[] vetorQuantidades = new int[tamanho]; // vetor que receberá a quantidade de vezes que o true/false deverá ser impresso
		
		int[] vetoresIntercalados = new int[tamanho * 2]; // vetor com os termos dos vetors anteriores intercalados
		
		do{
			
			// gera os vetores com valores aleatórios	
			for (int i = 0 ; i < tamanho ; i++){
				vetorBoolean[i] = random.nextInt(2); // gera números aleatórios entre 0 e 1
				vetorQuantidades[i] = random.nextInt(4) + 1; //gera números aleatórios entre 1 e 5
			}
			
			// intercala os dois vetores
			for (int i = 0 ; i < tamanho ; i++){
				
				vetoresIntercalados[indiceVetoresIntercalados] = vetorBoolean[i];
				indiceVetoresIntercalados++;
				vetoresIntercalados[indiceVetoresIntercalados] = vetorQuantidades[i];
				indiceVetoresIntercalados++;
			
			}
			
			// gera string com o resultado final
			for (int i = 0 ; i < tamanho ; i++){
			
				String booleana = (vetorBoolean[i] == 1 ) ? "true, " : "false, "; // string auxiliar para definir valor true ou false
				
				// repete e incremente o valor definido a string de resultado final
				for (int j = 0; j < vetorQuantidades[i] ; j++ ){
				
					resultado += booleana;
				
				}
			
			}
			
			// printa o vetor intercalado
			System.out.println("Vetor com valores:");
			
			for (int i : vetoresIntercalados){
			
				System.out.print(i + " ");
			
			}
			
			// printa a string com o resultado final
			System.out.println("\n\nResultado:");
			
			resultado = resultado.substring(0, resultado.length() - 2); // remove o espaço e a ultima virgula da string
			System.out.println(resultado);
			
			// reseta variaveis para caso o usuario queira jogar novamente
			indiceVetoresIntercalados = 0; 
			resultado = "";
			
			// verifica a resposta do usuario
			do{
				System.out.println("\nDeseja jogar novamente? [S/N]");
				continuar = scanner.nextLine().toUpperCase();
				
				if (continuar.charAt(0) != 'S' && continuar.charAt(0) != 'N') System.out.println("\nOpcao invalida, responda com S para sim ou N para nao.");
				
			} while (continuar.charAt(0) != 'S' && continuar.charAt(0) != 'N' )	;
			
		} while (continuar.charAt(0) == 'S');	
	}
}

