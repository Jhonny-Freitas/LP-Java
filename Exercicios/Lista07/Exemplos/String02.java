

public class String02 {
	
	public static void main (String[] args) {
		
		String alfabeto = "";
		
		//A - 65
		//Z - 90
		
		//for (char letra = 'A'; letra <= 'Z'; letra ++){
		//for (char letra = 'a'; letra <= 'z'; letra ++){
		for (char letra = '0'; letra <= '9'; letra ++){	
		
			alfabeto += letra;
		
		}
		
		System.out.println(alfabeto);
	}
}

