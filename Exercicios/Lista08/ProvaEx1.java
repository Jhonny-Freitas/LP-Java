import java.util.Scanner;

// Jhonny Miguel de Freitas

public class ProvaEx1 {
	
	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String frase = "",
		fraseFatiada = "",
		fatiamento = "";
		
		int primeiroNumero = 0,
		segundoNumero = 0;
		
		System.out.println("Entre com uma frase qualquer: ");
		frase = scanner.nextLine();
		
		System.out.println("\nAgora escolha como deseja fatiar a frase (utilize numeros inteiros separados por dois pontos, ex ==> 2:5 ) ");
		
		do{
			System.out.print("Fatiamento ==> ");
			fatiamento = scanner.nextLine().toUpperCase();
			
			if (fatiamento.charAt(0) == 'X') break; // verifica a condição para finalizar a execução
			
			String[] partes = fatiamento.split(":"); //separa os números de fatiamento
			
			
			//primeiroNumero = (partes[0].isEmpty()) ? 0 : Integer.parseInt(partes[0]);
			//segundoNumero = (partes[1].isEmpty()) ? frase.length() : Integer.parseInt(partes[1]); // tive uma dúvida do motivo de dar uma exception nesse caso
			
			primeiroNumero = partes.length > 0 && !partes[0].isEmpty() ? Integer.parseInt(partes[0]) : 0; // verifica o tamanho do array e se não é vazio antes de acessar os elementos para sanar a exeception caso o usuário não digite a segunda opção
			segundoNumero = partes.length > 1 && !partes[1].isEmpty() ? Integer.parseInt(partes[1]) : frase.length();
			
			// reajusta o primeiro número caso seja negativo
			if (primeiroNumero < 0) {
                primeiroNumero = frase.length() + primeiroNumero;
            }
            
            // reajusta o primeiro número caso seja negativo
            if (segundoNumero < 0) {
                segundoNumero = frase.length() + segundoNumero;
            }
			
			// verifica os possiveis casos de erros
			if (primeiroNumero < 0 || segundoNumero < 0 || primeiroNumero >= frase.length() || segundoNumero > frase.length() || primeiroNumero > segundoNumero){
				
				System.out.println("Erro!");
				continue; // avança para a proxima iteração do loop
				
			}
			
			fraseFatiada = frase.substring(primeiroNumero, segundoNumero); // gera a substring conforme o usuário solicitou
			
			System.out.println(fraseFatiada);
			
		} while (true);	
	}
}

