package demo.string.example;

public class StringReverce {
	void show(){
		StringBuilder str= new StringBuilder("Hemant chaudhari");
		System.out.println("String is :"+str);
		str.reverse();
		System.out.println("Reverce String is: "+str.toString());
		if (str.equals(str))
		{
			System.out.println("String is palindrome ");
		}
		else  {
			System.out.println("String is not palindrome");
		}
	}
		public static void main(String[] args) {
			StringReverce sr=new StringReverce();
			sr.show();
		}
}