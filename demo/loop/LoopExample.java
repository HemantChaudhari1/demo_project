package demo.loop;
import java.util.*;
public class LoopExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch=sc.next().charAt(0);
		{
			if(ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U' 
				||	ch=='a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u') {
				System.err.println(ch +  " is vowel ");
			}
			if(ch=='Z' || ch=='B' || ch=='T'|| ch=='G' || ch=='H' 
				||	ch=='z'|| ch=='b' || ch=='t'|| ch=='g'|| ch=='h'){
				
				System.out.println(ch+" is Consonent ");
					
				}
			else {
				
				System.out.println(ch +" is Alphabet ");
				
			}
		}
		  
		}
				

} 
