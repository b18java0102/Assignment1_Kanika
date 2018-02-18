
public class Pattern1Loop {
		public static void main(String[] args) {
				char []s={'*','*','*','*','*'};
				//System.out.println(s.charAt(0));
				for(int i=0;i<s.length;i++)
				{
					if(i==0)
					{
						System.out.println(s);
						s[i]=' ';
					}
					else
					{
					if(s[i]=='*')
					{
						System.out.println(s);
						s[i]=' ';
					
					}
					
					}
				}
		
			}

}
