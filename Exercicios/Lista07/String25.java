import java.util.Scanner;
 


public class String25 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		
		String senha = "";
		String simbolos = "!@#$%&*()+";
		int contadorMaiusculas = 0,
		contadorMinusculas = 0,
		contadorNumeros = 0,
		contadorSimbolos = 0;
		int maiorSequencia = Integer.MIN_VALUE;
		boolean senhaValida = false;
		
		do{
			
			System.out.print("Digite sua senha: ");
			senha = leiaStr.nextLine().trim();
			senha = senha.replace(" ", "");
			
			for ( int i = 0; i < senha.length() ; i++){
				
				for ( int j = 0 ; j < simbolos.length() ; j++ ){
				
					if (senha.charAt(i) == simbolos.charAt(j)) contadorSimbolos++;
					
				}
		
				for ( char maiusculas = 'A' ; maiusculas <= 'Z' ; maiusculas++ ){
				
					if (senha.charAt(i) == maiusculas) contadorMaiusculas++;
					
				}
				
				for ( char minusculas = 'a' ; minusculas <= 'z' ; minusculas++ ){
				
					if (senha.charAt(i) == minusculas) contadorMinusculas++;
					
				}
				
				for ( char numeros = '0' ; numeros <= '9' ; numeros++ ){
				
					if (senha.charAt(i) == numeros) contadorNumeros++;
					
				}
				
			}
			
			int letras = contadorMaiusculas + contadorMinusculas;
			
			System.out.println((senha.length() >= 10) ? "Tamanho 10: " + senha.length() + " (ok)" : "Tamanho 10: " + senha.length() + " (x)");
			System.out.println((letras >= 3) ? "Letras 3: " + letras + " (ok)" : "Letras 3: " + letras + " (x)");
			System.out.println((contadorNumeros >= 3) ? "Numeros 3: " + contadorNumeros + " (ok)" : "Numeros 3: " + contadorNumeros + " (x)");
			System.out.println((contadorSimbolos >= 2) ? "Simbolos 2: " + contadorSimbolos + " (ok)" : "Simbolos 2: " + contadorSimbolos + " (x)");
			
			if(senha.length() >= 10 && letras >= 3 && contadorNumeros >= 3 && contadorSimbolos >= 2 && contadorMaiusculas > 0 && contadorMinusculas > 0 ){
			
				System.out.println("Senha aprovada! Parabens!");
				senhaValida = true;
			
			} else {
				if (contadorMaiusculas == 0 || contadorMinusculas == 0) System.out.println("A senha deve conter pelo menos uma letra maiuscula e uma minuscula.");
				System.out.println("Senha reprovada! Tente novamente.");
			}

		}while(!senhaValida);
		
		
	}	
}

