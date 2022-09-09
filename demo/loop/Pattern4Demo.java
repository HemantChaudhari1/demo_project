package demo.loop;

public class Pattern4Demo {
	public static void main(String[] args) {
		//outer loop
		
		for(int i=1;i<=3;i++) {
			//inner loop
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
