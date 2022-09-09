package demo.exception;
import java.io.IOException;
class TestException{
	int a;
	int arr[];
	void display() {
		try {
			a=10/0;
			System.out.println(a);
		
			arr[6]=20;

		}
		catch(Exception e){
			System.out.println("Not Divid By Zero ");
				
		}
		finally {
		System.out.println("Finally Block")	;
		}
		System.out.println("Rest the code");
	}
}

public class ExceptionDemo1 {
	public static void main(String[] args) {
		TestException te=new TestException();
		te.display();
	}

}
