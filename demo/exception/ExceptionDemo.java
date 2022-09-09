package demo.exception;
import java.util.*;
public class ExceptionDemo {
 public static void main(String[] args) {
	 //Try Block must be need Catch Block...
	try {
		int a=10,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of c : ");
		c=sc.nextInt();
	   int  b=a/c;
		System.out.println(b);
		sc.close();
	}
	//catch Block always follow TRy block
	catch (Exception e) {
		System.out.println("Exception occured please checkmthe program.. ");
	
	}
	/*finally {
		int p=50,q=60,r;
		r=q+p;
		System.out.println(r);
	}*/
	System.out.println("Hello ,Rest of the program will be executed");
	
}
}
