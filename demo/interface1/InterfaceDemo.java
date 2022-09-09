package demo.interface1;
interface Show{
	void show();
	
}
	class Show1 implements Show{
		void show1()
		{
			System.out.println("class Method..");
		}
		public void show() {
			System.out.println("Interface Method..");
		}
	}

public class InterfaceDemo {
  public static void main(String [] args) {
	  Show1 s=new Show1();
	  s.show();
	  s.show1();
  }

}
