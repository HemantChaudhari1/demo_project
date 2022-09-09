package demo.practice;
import java.util.*;

public class Alphabate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character:  ");
		char c=sc.next().charAt(0);
		if( (c >= 'a' && c <='z')||(c >= 'A' && c <= 'z') )
			System.out.println(c +" is an alphabet.");
		else
			System.out.println(c + " is not an alphabet.");
			

	}

}
