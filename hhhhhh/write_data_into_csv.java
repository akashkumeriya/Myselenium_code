package hhhhhh;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

public class write_data_into_csv {

	public static void main(String[] args) throws IOException, CsvValidationException {

		String input_file = "/home/shatam-system-i2/Documents/GST PRICES.csv";

		String output_file = "/home/shatam-system-i2/Documents/GST PRICES_output.csv";

		String email = null;

		String password = null;

		CSVWriter writer = new CSVWriter(new FileWriter(output_file));

		CSVReader reader = new CSVReader(new FileReader(input_file));

		String[] header = { "email", "password", "TestCase" };

		writer.writeNext(header);

		String[] nextLine;

		while ((nextLine = reader.readNext()) != null) {

			email = nextLine[0];

			password = nextLine[1];

			String[] data1 = { email, password, "pass" };

			writer.writeNext(data1);
		}

		writer.flush();

		writer.close();

	}
}
