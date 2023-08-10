import java.util.Scanner;
 


public class String14 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String frase = "";
		String letra = "";
		
		
		System.out.print("Digite uma frase qualquer: ");
		frase = leiaStr.nextLine().toLowerCase();
		
		System.out.print("Agora digite uma letra: ");
		letra = leiaStr.nextLine().toLowerCase();
		
		frase = frase.replace(letra, "*");
		System.out.println(frase);
		
	}
}

