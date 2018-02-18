import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner inpu=new Scanner(System.in);
		String s=inpu.next();
		//String s=new String("Madam");
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
		s1=s1+ s.charAt(i);
		}
		if(s1.equalsIgnoreCase(s))
		{
			System.out.println(s+" is palindrome");
		}
		else
		{
			System.out.println(s+" is not palindrome");
		}

	}
}
