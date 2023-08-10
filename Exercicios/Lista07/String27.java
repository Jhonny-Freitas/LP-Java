import java.util.Scanner;

 


public class String27 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String frase1 = "",
		frase2 = "",
		frasesConcatenadas = "";
		
		System.out.print("Digite duas Strings de mesmo tamanho: \n");
		
		System.out.print("Digite a primeira String: ");
		frase1 = leiaStr.nextLine();
		
		System.out.print("Digite a segunda String: ");
		frase2 = leiaStr.nextLine();
		
		if (frase1.length() == frase2.length()) {
			
			for (int i = 0 ; i < frase1.length() ; i++){
			
				frasesConcatenadas = frasesConcatenadas + (Character.toString(frase1.charAt(i)) + Character.toString(frase2.charAt(i)));
			
			}
			
			System.out.println(frasesConcatenadas);
		
		} else {
		
			System.out.println("Tamanhos diferentes");
		
		}
	}	
}

