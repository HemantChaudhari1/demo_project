package demo.decisionstatement;
import java.util.*;

	class TestSwitch{
		int choice;
		int a,b,c;
		void  SwitchTest() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your choice :"+"\n"+"1.Addition"+"\n"
			+ "2.subtraction"+"\n"+"3.Multiplication"+"\n"+"4.Division"+"\n"+"5.Modulus");
            choice=sc.nextInt();
            switch(choice){
			case 1:
				System.out.println("Enter Two Value For a & b for addition :");
				a=sc.nextInt();
				b=sc.nextInt();
				c=a+b;
				System.out.println("Addition of two number are :" +c);
				break;
			case 2:
				System.out.println("Enter Two Value For a&b for substractions :");
				a=sc.nextInt();
				b=sc.nextInt();
				c=a-b;
				System.out.println("Substraction of two number are :" +c);
				break;
			case 3:
				System.out.println("Enter Two Value For a&b for Multiplication :");
				a=sc.nextInt();
				b=sc.nextInt();
				c=a*b;
				System.out.println("Substraction of two number are :" +c);
				break;
			case 4:
				System.out.println("Enter Two Value For a&b for Division :");
				a=sc.nextInt();
				b=sc.nextInt();
				c=a/b;
				System.out.println("Division  of two number are :" +c);
				break;
			case 5:
				System.out.println("Enter Two Value For a&b for moduls :");
				a=sc.nextInt();
				b=sc.nextInt();
				c=a%b;
				System.out.println("moduls of two number are :" +c);
				break;
			default :
				System.out.println("Invalid choice... Please enter the choice between 1 to 5");
						
            }
			
		}
		
	}

public class SwitchDemo {
public static void main(String[] args) {
	 TestSwitch ts= new TestSwitch();
	 ts.SwitchTest();
	 
	 }
}
