package hhhhhh;

import java.util.HashMap;

public class find_repeatation {
	
	public static void main (String [] args)
	{
		String a="kumeriye";
		
		  HashMap<Character, Integer> a1 = new HashMap<>();
		
		for(int i=0;i<a.length();i++)
		{
			int count= 1;
			
			
			for(int j=i+1;j<a.length();j++)
			{
				if(a.charAt(i)==(a.charAt(j)))
				{
					 count++;
					
					// System.out.println(a.charAt(i)+"   "+count);
					 a1.put(a.charAt(i), count);
				}
				
			}
			
			 if (!a1.containsKey(a.charAt(i))) {
			
			 a1.put(a.charAt(i), count);
			}
			
		//	System.out.println(a.charAt(i)+"   "+count);	
			
			
		}
		
		
	System.out.println(a1);
	}

}
