package demo.interface1;

interface polygon{
	void getArea(int height,int width);
}
	class Reactangle implements polygon{
	public void getArea(int height,int width) {
		System.out.println("Area of Reactangle is : " +(height*width));
		
	}
	}
public class InterfaceDemo1 {
	public static void main (String [] args) {
		Reactangle r=new Reactangle();
		r.getArea(20,25);
	}

}
