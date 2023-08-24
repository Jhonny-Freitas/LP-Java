
public class TiposDeResultado {
	

    public static void main(String[] args) {
		
		byte a = 1;
        short b = 2;
        double c = 3.14;

        int d = a + b;      // Utilizado int porque é maior que byte e short
        double e = b + c;   // Utilizado double porque é o maior dos dois tipos

        System.out.println(d); // Saída: 3
        System.out.println(e); // Saída: 5.14
    } 
   
}


