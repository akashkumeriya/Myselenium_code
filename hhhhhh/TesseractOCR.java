package hhhhhh;

import net.sourceforge.tess4j.*;

import java.io.File;

public class TesseractOCR {
    public static void main(String[] args) {
        try {
            // Set TESSDATA_PREFIX environment variable programmatically
            System.setProperty("user.library.path", "/usr/share/tesseract-ocr/4.00/");

            // Set the path to your tessdata directory containing the trained data files
            File tessData = new File("/usr/share/tesseract-ocr/4.00/tessdata");
            
            Tesseract tesseract = new Tesseract();
            
            tesseract.setDatapath(tessData.getAbsolutePath());

            // Specify the image file for OCR
            
            
         File imageFile = new File("/home/shatam-system-i2/Downloads/Screenshot from 2025-01-22 12-02-34.png");

      //  File imageFile = new File("/home/shatam-system-i2/Pictures/Screenshot from 2025-01-22 12-02-34.png");
  
            
            // Perform OCR
            String result = tesseract.doOCR(imageFile);

            // Output the extracted text
            System.out.println("Extracted Text: ");
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
