import java.util.Random;

public class ExibeNumeroAleatorio {
	

    public static void main(String[] args) {
		
		Random random = new Random();
        
		double numeroAleatorio = random.nextDouble() * 101;
		
		System.out.printf("%.2f", numeroAleatorio);
    } 
   
}


