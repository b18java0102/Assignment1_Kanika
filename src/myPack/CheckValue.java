package myPack;

public class CheckValue implements Check{
	public boolean CheckString(String s)
	{int space=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				space++;
		}
		if(space==0)
			return false;
		else
			return true;
	}
	public boolean CheckInt(int i)
	{
		int space=0;
	String s=String.valueOf(i);
	for(int j=0;j<s.length();j++)
	{
		if(s.charAt(j)=='0')
			space++;
	}
	if(space==0)
	return false;
	else
		return true;
		
	}
}
