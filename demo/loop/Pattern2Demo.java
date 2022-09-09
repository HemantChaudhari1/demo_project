package demo.loop;

public class Pattern2Demo {
	public static void main(String[] args) {
		//outer loop
		for(int j=1;j<=4;j++) {
			//inner loop
			for(int i=1;i<=5;i++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}


