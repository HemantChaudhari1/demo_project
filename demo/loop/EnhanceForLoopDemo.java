package demo.loop;

public class EnhanceForLoopDemo {
	public static void main(String[] args) {
		int arrayNumber[]= {20,30,50,60,40,30,50,89,90,111};
		int sum=0;
		
		
		//Enhance for loop/ for each loop
		for (int number :arrayNumber) {
			sum+=number;
			System.out.println(sum +" ");
		}
}
} 
	