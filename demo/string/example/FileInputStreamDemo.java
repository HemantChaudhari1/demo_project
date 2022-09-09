package demo.string.example;
import java.io.*;

//not Successful only error

public class FileInputStreamDemo {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("H:\\demo1.txt");
			System.out.println("Data Store in the file");
			int i=fin.read();
			while(i!=-1) {
			System.out.print((char)i);
			i=fin.read();
		
			} 
		
		fin.close(); 
		}
		catch(Exception e){
		 e.getStackTrace();			
		}

}
