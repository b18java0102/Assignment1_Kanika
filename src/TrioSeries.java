import java.util.Scanner;

public class TrioSeries {
		public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the no of term for Trio series: ");
				int n=s.nextInt();
				int a=0,b=1,c=1,d;
				for(int i=1;i<=n;i++)
				{
					if(i==1)
					{
						System.out.print(+a);
					}
					else if(i==2)
					{
						System.out.print(" , "+b);
					}
					else if(i==3)
					{
						System.out.print(" , "+c);
					}
					else
					{
						d=a+b+c;
						System.out.print(" , "+d);
						a=b;
						b=c;
						c=d;
					}
			}
			}

}
