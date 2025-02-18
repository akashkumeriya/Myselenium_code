package hhhhhh;

import java.util.Arrays;

public class find_max_min_from_array {
	
	
	public static void main(String [] args)
	{
		int a[]= {12,78,66,45,98,28,44};
		
		int min=a[0];
		int max=a[0];
		
		for( int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
			
			if(max<a[i])
			{
				max=a[i];
			}
			
		}
		
		System.out.println(min);
		System.out.println(max);
		
	}
}
