package demo.casting;

public class CastingDemo {
	public static void main(String[] args) {
		//widening  Casting 
		byte a=10;
		short b;
		b=a;
		System.out.println(b);
		System.out.println("--------------------------");
		int c=30;
		long d;
		d=c; 
		System.out.println(d);
		System.out.println("--------------------------");
		
		//narrowing casting
		short e=40;
		byte f;
		f=(byte)e;
		System.out.println(f);
		System.out.println("--------------------------");
		
		double g=3045.40;
		float h;
		h=(float)g;
		System.out.println(h);
		System.out.println("--------------------------");
		
	}
	
}
