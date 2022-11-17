import java.util.*;

public class reverseString {
	
	public static void main(String args[]) {
		
		
		Scanner in=new Scanner(System.in);
		
		
		System.out.println("Enter the string to reverse");
		String userinput = in.next();
	reverse(userinput);
		
	
		


		try  {
			
			    System.out.println("Exit? (y exits)");
			    Scanner in2 = new Scanner(System.in);
				String input1 = in2.nextLine();
			    if (input1.equals("y")) {
			    	System.out.println("Thank you");
			    System.exit(0);
			    
			    
			    }  
			    else {
	


			    System.out.println("Ok! Let's carry on!");
			    Scanner userinput2 = new Scanner(System.in);
			    System.out.println("Enter the String to be reversed");
			    String input2 = userinput2.next();
			    reverse(input2);
			    }
		} catch(Exception e1) {
			System.out.println(e1);
		}
		
		
	
		}

	private static void reverse(String userinput) {
		// TODO Auto-generated method stub
		String rev="";
		int length=userinput.length();
		
		for(int i=length-1;i>=0;i--) 
		  rev=rev+userinput.charAt(i);
		System.out.println("Reversed string: "+rev);
	}
		
		
	
	
}

