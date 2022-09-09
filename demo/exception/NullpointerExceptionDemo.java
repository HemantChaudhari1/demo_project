package demo.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileReader;

public class NullpointerExceptionDemo {
	public static void main(String[] args) {
		try {
			//Null Pointer Exception
		String name=null;
		String name1=name;
		
		System.out.println(name.charAt(0));
	}
		catch (NullPointerException e) {
			System.out.println("Null Pointer Exception..");
		}try {
			String index="Welcome to FUEL Organization , Pune";
			char c=index.charAt(100);
			System.out.println(c);
			//StringIndexOutOfBoundException
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Out of index");
		}
		//FileNotFoundException
		try {
			
		
		File file=new File("H:\\Resume.txt");
		FileReader fr=new FileReader(file);
		fr.close();
		}
		catch (Exception e) {
		 System.out.println("Exception Executed At The Last");
			
		}
	}
}
