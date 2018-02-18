import java.util.Scanner;

public class MobileNo {
	

		public static void main(String[] args) {
			Scanner inp=new Scanner(System.in);		
			System.out.println("Enter the 10 digit mobile no.");
			String s=inp.next();
			if(s.length()==10)
			{
			int flag=0;
			for(int j=0;j<10;j++)
			{			
				for(int i=0;i<s.length();i++)
				{   String c=String.valueOf(j);		
					String d=String.valueOf(s.charAt(i));
					if(c.equals(d))		//Doubt if(s.charAt(i)==i)
					{
						flag+=1;
					}
				}
				System.out.println("Frequency of "+ j+" is "+flag);
				flag=0;
			}
			}
			else
			{
				System.out.println("The entered no is not 10 digit");
			}

		}

	}

