
public class KPattern {
	public static void main(String[] args) {
		for(int i=3;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2!=0)
				{
				System.out.print("*  ");
				}
				else if(j%2==0 && i%2==0)
				{
					for(int k=1;k<j;k++)
					{
						System.out.print("*  ");
					}
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=3;i++)
		{
			for(int j=i;j>=1;j--)
			{
				if(j%2!=0)
				{
				System.out.print("*  ");
				}
				else if(j%2==0 && i%2==0)
				{
					for(int k=1;k<j;k++)
					{
						System.out.print("*  ");
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
