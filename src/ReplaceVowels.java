import java.util.Scanner;

public class ReplaceVowels {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=inp.next();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				s1=s1+"*";
			}
			else
			{
				s1=s1+s.charAt(i);
			}
		} 
		System.out.println(s1);
			

	}

}
