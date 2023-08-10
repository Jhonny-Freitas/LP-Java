import java.util.Scanner;
 


public class String19 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String palavra = "";
		String palavraInvertida = "";
		
		System.out.print("Digite uma sequencia de caracteres: ");
		palavra = leiaStr.nextLine().toLowerCase().trim();
		
		for (int i = 0; i < palavra.length(); i++){
			palavraInvertida = palavra.charAt(i) + palavraInvertida;
		}
		
		System.out.println(palavraInvertida);
		System.out.println(palavraInvertida.equals(palavra) ? "Palindromo!" : "Nao eh palindromo.");

	
	}	
}

