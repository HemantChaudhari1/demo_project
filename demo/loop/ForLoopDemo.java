package demo.loop;

public class ForLoopDemo {
	public static void main(String[] args) {
		//for loop
		int a=1;
		for(;a<=10;a++)
		{
			System.out.println(a+" ");
		}
		System.out.println();
		//while loop
		a=1;
		while(a<=10) {
			System.out.println(a+" ");
			a++;
		}
		System.out.println("D0-While-loop");
		//Do-While-Loop
		int b=1;
		do {
			
			System.out.println(b);
			b++;
		}
		while(b<1);
	}

}
