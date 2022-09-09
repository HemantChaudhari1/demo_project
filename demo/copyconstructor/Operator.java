package demo.copyconstructor;

public class Operator {
	int a,b,c;
	public Operator(int a, int b){
		this .a=a;
		this.b=b;
	}
	void addition() {
		
		c=a+b;
		System.out.println("Additio is; "+c);
		
	}
	void substraction() {
		c=a-b;
		System.out.println("Substraction is :"+c);
	}
	void multiplication() {
		c=a*b;
		System.out.println("Multiplication is :"+c);
		
	}
	void division() {
		c=a/b;
		System.out.println("Division is:"+c);
	}
		
		public static void main(String [] args) {
			Operator O=new Operator(100,50);
			O.addition();
			O.substraction();
			O.multiplication();
			O.division();
		}
	}
	

