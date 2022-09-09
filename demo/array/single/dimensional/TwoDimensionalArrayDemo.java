package demo.array.single.dimensional;

public class TwoDimensionalArrayDemo {
	 public static void main(String[] args) {
		int arr[][]= {{2,3,6,4},{4,2,6,5},{4,6,8,9},{5,6,8,9}};
		//cuter loop
	   for(int i=0;i<4;i++) {
		   //inner loop
		   for(int j=0;j<4;j++) {
			   
		   
		   System.out.print(arr[i][j]+" ");
	   }
	   System.out.println();
	  }
	 }
}
