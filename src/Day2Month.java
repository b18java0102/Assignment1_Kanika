import java.util.Scanner;

public class Day2Month {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of days");
		int days=s.nextInt();
		int month=days/12;
		int day=days%30;
		System.out.println(month +" Month " + day+ " Days");
		s.close();
	}

}
