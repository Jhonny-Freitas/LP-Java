import java.util.Random; 


public class String26 {
	
	public static void main (String[] args) {
		
		Random gerador = new Random();
		
		int maiorSequenciaLetras = Integer.MIN_VALUE,
		maiorSequenciaVogais = Integer.MIN_VALUE,
		maiorSequenciaAlfabetica = Integer.MIN_VALUE;
		
		int contadorSequencia =1,
		contadorVogais = 0,
		contadorAlfabeticas = 0;
		
		String geraString = "";
		String vogais = "aeiou";
		char maiorSequencia = ' ';
	
		
		for (int i = 0 ; i < 100 ; i++) {
			
			char letra = (char) (gerador.nextInt(26) + (int)'a');
			
			geraString += letra;			
			
		}
	
		System.out.println(geraString);
		
		System.out.print("Letras Nao Contidas: ");
		for (int i = 'a'; i <= 'z' ; i++){
			boolean valid = false;

		
			for ( int j = 0 ; j < geraString.length() ; j++){
				
				if(geraString.charAt(j)== (char)i) valid = true;
				
			}
			System.out.print(valid? "" :(char)i);
		}
		
		////////////////////////////////////////////////////////////////////////////////
		
		for(int i = 0; i < geraString.length();i++){
			//contando o numero de vogais
			if(vogais.contains(""+geraString.charAt(i))){
				contadorVogais++;
			}else{//zerando o contador caso a letra n seja vogal
				contadorVogais = 0;
			}
			//contando a sequencia de letras
			if(i<geraString.length()-1 && geraString.charAt(i) == geraString.charAt(i+1)){
				contadorSequencia++;
			}else{//reseta o contador
				contadorSequencia  = 1;
			}
			
			if(i<geraString.length()-1 && geraString.charAt(i+1) == geraString.charAt(i)+1){
				contadorAlfabeticas++;
			}else{//reseta o contador
				contadorAlfabeticas  = 1;
			}
			//validando os maiores valores
			if(contadorSequencia>maiorSequenciaLetras){
				maiorSequenciaLetras = contadorSequencia;
			}
			if(contadorVogais>maiorSequenciaVogais){
				maiorSequenciaVogais = contadorVogais;
			}
			if(contadorAlfabeticas>maiorSequenciaAlfabetica){
				maiorSequenciaAlfabetica = contadorAlfabeticas;
			}
		}
		/*for(int i = 0; i<maiorSequenciaLetras;i++){
			System.out.print(maiorSequencia);
		}*/
		System.out.println("\nA maior sequencia de letras repetidas: "+maiorSequenciaLetras);
		System.out.println("A maior sequencia de vogais: "+maiorSequenciaVogais);
		System.out.println("A maior sequencia alfabetica: "+maiorSequenciaAlfabetica);

	}	
}

