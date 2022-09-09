package demo.array.single.dimensional;

 class Display{
	int arr1[]= {10,20,30,40,50,60};
	int arr2[]= {5,6,7,8,9,6};
	 int arr3[]=new int[6];
	
	void display() {
		
		//without for loop 
		/*
		 System.out.println(arr3[0]=arr1[0]+arr2[0]);
		 System.out.println(arr3[1]=arr1[1]+arr2[1]);
		 System.out.println(arr3[2]=arr1[2]+arr2[2]);
		 System.out.println(arr3[3]=arr1[3]+arr2[3]);
		 System.out.println(arr3[4]=arr1[4]+arr2[4]);
		 System.out.println(arr3[5]=arr1[5]+arr2[5]);
		 */
		 
		 
		 //for loop
		 for(int i=0;i<arr3.length;i++) {
			 System.out.println(arr3[i]=arr1[i]+arr2[i]);
	   }
	 } 
  }
  public class SingleDimensionalArrayDemo
	{
		public static void main(String[] args) {
			
			Display d=new Display();
			d.display();
		}
	}
