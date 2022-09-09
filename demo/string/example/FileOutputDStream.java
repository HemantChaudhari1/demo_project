package demo.string.example;
import java.io.FileOutputStream;

public class FileOutputDStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("H:\\demo.txt");
			fout.write(69);
			fout.close();
			System.out.println("success");
		}
		catch(Exception e){
			System.out.println("Exception account");
			
		}
	}

}
