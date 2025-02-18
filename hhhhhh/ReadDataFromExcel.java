package hhhhhh;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("/home/shatam-system-i2/Akash Java Workspace/third_maven/test_data/data2.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Dynamicdata");
		
	//	 XSSFRow row1 = sheet.createRow(0);
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter how many rows");
		
		int no_of_rows=sc.nextInt();
		
		
		
		
           System.out.println("enter how many cells");
		
		   int no_of_cells=sc.nextInt();
		   
		   
		   for(int i=0;i<=no_of_rows;i++)
		   {
			   for(int j=0;j<no_of_cells;j++)
			   {
				   
			   }
		   }
		   
		   
		
		
		
		workbook.write(file);
		workbook.close();
		file.close();
	}
}
