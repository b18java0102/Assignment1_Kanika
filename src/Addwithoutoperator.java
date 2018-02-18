import java.util.Scanner;

public class Addwithoutoperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two no's to perform addition");
		System.out.println("Ist no: ");
		int a=s.nextInt();
		System.out.println("IInd no: ");
		int b=s.nextInt();
		int sum=a;
		int add=b;
		while(add>0)
		{
			sum++;
			add--;
		}
		System.out.println("Sum of "+a +" and "+b+" is "+sum);
		s.close();
	}

}
