package demo.presentation;
import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter Any Number :");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+" = "+n*i);
		}
		
	}

}
