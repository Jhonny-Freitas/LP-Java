
public class DivisaoInteiraReal {
	

    public static void main(String[] args) {
		
		 int a = 5;
        int b = 2;

        System.out.println(a / b);               		// Resultado: 2 (divisão inteira)
        System.out.println((double) a / b);      		// Resultado: 2.5 (casting de 'a' para double)
        System.out.println(a / (double) b);      		// Resultado: 2.5 (casting de 'b' para double)
        System.out.println((double) (a / b));    		// Resultado: 2.0 (casting do resultado inteiro para double)
        System.out.println((double) a / (double) b); 	// Resultado: 2.5 (casting de ambos 'a' e 'b' para double)
    
    } 
   
}


