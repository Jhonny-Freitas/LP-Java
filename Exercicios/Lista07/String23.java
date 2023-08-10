import java.util.Scanner;
 


public class String23 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String nome = "";
		String sobrenome = "";
			
		System.out.print("Escreva o seu nome completo: ");
		nome = leiaStr.nextLine().trim();
		
		sobrenome = nome.substring(nome.lastIndexOf(' ') + 1 );
		
		System.out.println(sobrenome);
	}	
}

