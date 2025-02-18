package hhhhhh;

public class split_sentence {
	
	public static void main(String [] args) throws InterruptedException
	{
		String a="flipcart";
		
		String rev="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		
		
		
		Thread.sleep(-2000);
		
		
		System.out.println(rev);
		
	}


}
