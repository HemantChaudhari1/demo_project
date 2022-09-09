package demo.decisionstatement;
import java.util.*;
class ladderDemo{
	double marks;
	void display() {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the marks of the student");
	double marks=sc.nextDouble();
	if(marks<100.00 && marks>=75) {
		System.out.println("Dist");
	}
	else  if(marks<75.00 && marks>60.00) {
		System.out.println("first Class");
	}
	else if(marks<60.00 && marks>=35.00) {
		System.out.println("Pass");
	}
	else if(marks<35 && marks>=0) {
		System.err.println("Fail");
	}
	else {
		System.out.println("Invalid Marks , please enter the valid marks between 0 to 100...");
	}
	
}
}

public class IfelseIfLadder {
	public static void main(String[] args) {
		ladderDemo l=new ladderDemo();
		l.display();
	
	}
	

}
