package demo.loop;

public class Pattern3Demo {
	public static void main(String[] args) {
		//outer loop
		
		for(int i=1;i<=3;i++) {
			//inner loop
			for(int j=1;j<=4;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}


