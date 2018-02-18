
public class Evenodd {


	public static void main(String[] args) {
		int a[]={4,3,6,1,8,9};
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0 && a[i]%2!=0)
			{
				flag=flag+1;
			}
			else if (i%2!=0 && a[i]%2==0)
			{
				flag=flag+1;
			}
		}
		if (flag==0)
		{
			System.out.println("EVENODD");
		}
		else
		{
			System.out.println("NOT");
		}
	}

}

