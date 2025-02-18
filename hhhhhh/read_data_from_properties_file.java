package hhhhhh;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
	
public class read_data_from_properties_file {
	
	
	public static void main (String [] args) throws IOException
	{
	
	Properties obj=new Properties();
	
	FileReader obj1=new FileReader("/home/shatam-system-i2/Akash Java Workspace/third_maven/src/test/java/hhhhhh/login_data.properties");
	
	obj.load(obj1);

	String email=obj.getProperty("email");
	
	String pass=obj.getProperty("password");
	
	System.out.println(email);
	
	System.out.println(pass);
	
	}
}
