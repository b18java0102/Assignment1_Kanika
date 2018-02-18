import java.util.Scanner;

public class CodingChallenge {
	public static void main(String args[])
	{
		int l,u;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the lower limit");
		l=s.nextInt();
		System.out.println("Enter the upper limit");
		u=s.nextInt();
		System.out.println("Enter the number whose multiple need to return");
		int k=s.nextInt();
		int []arr=solution(l,u,k);
		System.out.println("Multiples of " + k + "are");
		for(int m=0;m<arr.length;m++)
		{
			System.out.print(arr[m]+ "  ");
		}
	}
	static int [] solution(int a,int b,int c)
	{
		int count=0,j=0;
		int []array = new int[5];
		for(int i=a;i<=b;i++)
		{
			if(i%c==0)
			{
				count+=1;
				array[j]=i;
				j=j+1;
			}
		}
		
		return (array);
		
	}
}
