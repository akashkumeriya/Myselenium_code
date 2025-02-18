package hhhhhh;
import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class read_data_from_csv {

	public static void main(String[] args) throws IOException, CsvValidationException {

		String strFile = "/home/shatam-system-i2/Documents/GST PRICES.csv";

		CSVReader reader = new CSVReader(new FileReader(strFile));

		String[] nextLine;

		String product_name = null;

		String values = null;

		while ((nextLine = reader.readNext()) != null) {

			product_name = nextLine[0];

			values = nextLine[1];

			System.out.println(product_name + " " + values);

		}

	}

}
