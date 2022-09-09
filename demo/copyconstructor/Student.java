package demo.copyconstructor;

public class Student {
	
		private int roll_no;
		private String name;
		private float percentage;
		
		public Student(int r,String n, float p)
		{
			this.roll_no=r;
			this.name=n;
			this.percentage=p;
		}
		public Student(Student s1) {
			roll_no=s1.roll_no;
			name=s1.name;
			percentage=s1.percentage;
			
		}
		public void display() {
			System.out.println("Roll No of student is :" +roll_no);
			System.out.println("Name of Student is :" +name);
			System.out.println("Percentage of student is :" +percentage);
		}

		public static void main(String[] args) {
			Student s1=new Student(1,"Hemant",98.99f);
			Student s2=new Student(s1);
		s2.display();
		}
			
		
		
	}

