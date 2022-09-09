package demo.loop;
 import java.util.*;
	class ArrayLoop{
		String cityName[]=new String[5];
		void add() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value in array : ");
			for(int i=0;i<5;i++) {
				cityName[i]=sc.next();
				
			}
			System.out.println("Array having the value :  ");
			
			int  i=0;
			while(i<5) {
				System.out.println(cityName[i]+" ");
				i++;
			}
		}
	}
public class ArrayWithLoopDemo {
	public static void main(String[] args) {
		ArrayLoop a1=new ArrayLoop();
		a1.add();
	}

}
