package myPack;

public class Palindromee implements Check{
	public boolean CheckString(String s){
		String str="";
		for(int i=0;i<s.length();i++)
		{
			str=str+s.charAt(i);
		}
		if(s.equals(str))
			return true;
		else
			return false;
	}
	public boolean CheckInt(int i){
		int num=i;
		int rev=0,rem;
		while(i>0){
			rem=i%10;
			rev=rev*10+rem;
			i=i/10;
		}
		if(rev==num)
			return true;
		else
			return false;
	}
}
