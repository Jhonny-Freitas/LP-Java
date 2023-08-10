import java.util.Scanner;
 


public class String18 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String entrada = "";
		
		System.out.print("Digite uma sequencia de caracteres: ");
		entrada = leiaStr.nextLine().trim();
		
		if (entrada.length() != 8){
		
		 System.out.println("Nao eh uma sequencia de 8 bits.1");
		 return;
		
		}
		
		for (int i = 0; i < entrada.length(); i++){
			
			if (entrada.charAt(i) != '0' && entrada.charAt(i) != '1'){
			
				System.out.println("Nao eh uma sequencia de 8 bits.2");
				return;
			
			}
			
		}
		
		System.out.println("Eh uma sequencia de 8 bits.");
		
	}	
}

