package demo.decisionstatement;

public class NestedIfStatementDemo {
	public static void main(String[] args) {
		String criminalrecord="No";
		String nationality="Indian";
		long id=123456789;
		String addressproof="Electric_Bill";
		String  photoId="Photo";
		String mobileNO="7709865974";
		String fees="Yes";
		
		
		if(criminalrecord=="Yes") {
			System.out.println("You are eligible to apply for the passport");
		
		if(nationality=="Indian"){
			System.out.println("You can apply....");
		
		if(id==123456789) {
			System.out.println("ID Varified");
		
		if(addressproof=="Electric_Bill") {
			System.out.println("Address Proof Varified .");
		
		if(photoId=="Photo") {
			System.out.println("Photo Varified");
		
		if(mobileNO=="7709865974") {
			System.out.println("Mobile NO is Varified . ");
		
		if(fees=="Yes") {
			System.out.println("You have paid fees Successfully .");
		
		}	
		}
		}
		else {
			System.err.println("Sorry , you are not eligible for passport");
		
		
		}
		}
		}
		}
		}
	}
}
		
			
		
		


