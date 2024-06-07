package LogicalPrgrmsMock;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Logical {

	
	@Test
	public void frequency()
	{
		  String s= "how are you";
		  HashMap<Character, Integer> map= new HashMap<>();
		   for(int i=0;i<s.length();i++)
		 {
		    Character c= s.charAt(i);
		    if(map.containsKey(c))
		       {
		         map.put(c, map.get(c)+1);
		         }
		    else
		       {
		          map.put(c,1);
		        }
		 }
		   for (Entry<Character, Integer> e : map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}
	
	@Test
	public void rev()
	{
		String s= "how are you";
		String[] str= s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String str1=str[i];
			for(int j=str1.length()-1;j>=0;j--)
			{
				System.out.print(str1.charAt(j));
			}
			System.out.print(" ");
			
		}
		System.out.println();
	}
	
	
	@Test
	public void capital()
	{
		String s= "how are you";
		String[] str= s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String str1=str[i];
			for(int j=0;j<str1.length();j++)
			{
				if(j==0)
				{					
					char c=str1.charAt(j);
					int x=(int) c-32;
					char ch=(char) x;
				   System.out.print(ch);
				}
				else
				{
					System.out.print(str1.charAt(j));
				}
			}
			System.out.print(" ");
			
		}
	}
	
	
	
	@Test
	public void maxmin()
	{
		int a[]= {3,2,1,4,6,5};
		int max=0;
		int min1 = Integer.MAX_VALUE;
		int min2= Integer.MAX_VALUE;
		System.out.println(min1);
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[j]>a[i])
				{
					max=a[j];
				}
				
			}			
			   if(a[i]<min1)
		    	{ 
				   
		    	   min2=min1;
		    	   min1=a[i];
		    	}
			}		
		System.out.println(max);
		System.out.println(min2);
	}

	
	
		@Test
		public void sum()
		{
			String s="a3$4%65ab1";
			int sum=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)>='0' && s.charAt(i)<='9')
				{
					sum=sum+(s.charAt(i)-48);
				}
			}
			System.out.println(sum);
		}
		
		
		
		
		
	
}
