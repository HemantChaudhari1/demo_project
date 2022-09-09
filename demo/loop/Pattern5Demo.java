package demo.loop;

public class Pattern5Demo  {
	public static void main(String[] args) {
		//outer loop
		
		for(int i=3;i>=0;i--) {
			//inner loop
			for(int j=0;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}


	
}
