import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the number for swapping");
		System.out.println("I no: ");
		int a=s.nextInt();
		System.out.println("II no: ");
		int b=s.nextInt();
		swap(a,b);
		s.close();
	}
	static void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Number after swapping :");
		System.out.println("I no: "+ a);
		System.out.println("II no: "+b);
		
		
	}

	}

