package hhhhhh;
public class DocumentProcessor {
    public static void main(String[] args) {
    	
        // Input and output file paths
        String inputImage = "/home/shatam-system-i2/Pictures/Screenshot from 2025-01-22 12-02-34.png";
        String enhancedImage = "/home/shatam-system-i2/Desktop/enhanced_document.jpeg";

        // Step 1: Preprocess the image
        System.out.println("Preprocessing the image...");
        ImagePreprocessor.preprocessImage(inputImage, enhancedImage);

        // Step 2: Perform OCR using Google Vision
        System.out.println("Performing OCR...");
        GoogleVisionOCR.performOCR(enhancedImage);
    }
}

