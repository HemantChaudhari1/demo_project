package demo.loop;

public class Pattern6Demo {
	public static void main(String[] args) {
		//outer loop
		
		for(int i=1;i<=3;i++) {
			//inner loop
			for(int j=1;j<=10;j++) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}

}
