
public class ConversaoPrimitivos {
	

    public static void main(String[] args) {
		
		int a = 10;
        long b = (long) a;
        int c = (int) b;
        float d = b;
        short e = (short) a;
        double f = d;
        Long g = b;  // Autoboxing
        long h = g;  // Unboxing

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    } 
   
}


