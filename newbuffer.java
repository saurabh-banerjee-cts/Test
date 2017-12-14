package first1;
import java.util.*;
import java.io.*;
import java.text.*;
public class newbuffer {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter the agent details");
		System.out.println("Enter the agent name :");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name1="NULL";
			try {
				name1 = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Enter the identification number :");
		String name2="NULL";
		try {
			name2 = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the accountNumber :");
		String name3="NULL";
		 name3 = br.readLine();
		System.out.println("Enter the creditLimit :");
		String credit = br.readLine();
		 double CreditLimit = Double.parseDouble ( credit );
		DecimalFormat df = new DecimalFormat("#.00");
				
		System.out.println("Agent details are\n"+name1+"\nIdentification Number : "+name2+"\nAccount Number : "+name3+"\nCredit Limit : "+ df.format(CreditLimit));
    		 
	}



		
}

