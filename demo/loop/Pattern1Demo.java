package demo.loop;


public class Pattern1Demo {
	public static void main(String[] args) {
		//outer loop
		for(int i=0;i<=4;i++) {
			//inner loop
			for(int j=1;j<=5;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*output
	1 2 3 4 5 
	1 2 3 4 5 
	1 2 3 4 5 
	1 2 3 4 5 
	1 2 3 4 5 
 	*/
