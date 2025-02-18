package hhhhhh;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class pink_temp_calculation_feb_7 {
    public static void main(String[] args) {
        String inputFilePath = "/home/shatam-system-i2/Downloads/final_7_feb.csv";
        String outputFilePath = "/home/shatam-system-i2/Downloads/final_7_feb_output.csv";

        Map<String, ProductData> productMap = new HashMap<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(inputFilePath))) {
            String line;
            br.readLine(); // Skip header

            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",", -1); // Preserve empty values
                if (columns.length < 5) continue;

                String productName = columns[2].trim();
                String quantityStr = columns[3].trim();
                String priceStr = columns[4].trim().replace("Rs.", "").replace(",", "").trim();

                int quantity = extractNumericValue(quantityStr);
                String unit = extractUnit(quantityStr);
                double price = parsePrice(priceStr);

                if (quantity > 0 && price > 0) {  // Avoid corrupt data entries
                    productMap.putIfAbsent(productName, new ProductData(0, 0, unit));
                    ProductData data = productMap.get(productName);
                    data.totalQuantity += quantity;
                    data.totalPrice += price;
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        // Write results to a new CSV file
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(outputFilePath))) {
            bw.write("Product Name,Total Quantity,Unit,Total Price\n");
            for (Map.Entry<String, ProductData> entry : productMap.entrySet()) {
                bw.write(entry.getKey() + "," + entry.getValue().totalQuantity + " " + entry.getValue().unit + ",Rs." + String.format("%.2f", entry.getValue().totalPrice) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Summary written to: " + outputFilePath);
    }

    private static int extractNumericValue(String quantityStr) {
        String[] parts = quantityStr.split(" ");
        for (String part : parts) {
            try {
                return Integer.parseInt(part.replaceAll("[^0-9]", "")); // Extract only numbers
            } catch (NumberFormatException ignored) {}
        }
        return 0;
    }

    private static String extractUnit(String quantityStr) {
        List<String> validUnits = Arrays.asList("pack", "bag", "kg", "box", "pcs", "line", "tin", "bunch");
        for (String unit : validUnits) {
            if (quantityStr.toLowerCase().contains(unit)) {
                return unit;
            }
        }
        return "unit"; // Default unit if none found
    }

    private static double parsePrice(String priceStr) {
        try {
            return Double.parseDouble(priceStr);
        } catch (NumberFormatException e) {
            return 0.0; // Default price to 0.0 if parsing fails
        }
    }

    static class ProductData {
        int totalQuantity;
        double totalPrice;
        String unit;

        ProductData(int quantity, double price, String unit) {
            this.totalQuantity = quantity;
            this.totalPrice = price;
            this.unit = unit;
        }
    }
}
