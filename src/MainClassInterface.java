import myPack.Palindromee;
import myPack.CheckValue;
public class MainClassInterface {

	public static void main(String[] args) {
		CheckValue c=new CheckValue();
		System.out.println(c.CheckInt(1011));
		System.out.println(c.CheckString("Hello World"));
		Palindromee p=new Palindromee();
		System.out.println(p.CheckInt(1221));
		System.out.println(p.CheckString("Madam"));
		

	}

}
