
public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "madam";
		String b ="";
		
		for(int i=a.length()-1; i>=0; i--)
		{
			b=b+a.charAt(i);
		}
		
		System.out.println("Reversed string is:"+b);
		
		
		if (a.equals(b))
		{
			System.out.println("Given word is a palindrome");
		}
		else
		{
			System.out.println("Given word is not a palindrome");
		}
		
	
	}

}
;