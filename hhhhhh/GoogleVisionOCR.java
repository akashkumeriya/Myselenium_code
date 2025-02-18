package hhhhhh;
import com.google.cloud.vision.v1.AnnotateImageRequest;
import com.google.cloud.vision.v1.AnnotateImageResponse;
import com.google.cloud.vision.v1.Feature;
import com.google.cloud.vision.v1.Feature.Type;
import com.google.cloud.vision.v1.Image;
import com.google.cloud.vision.v1.ImageAnnotatorClient;
import com.google.protobuf.ByteString;

import java.io.FileInputStream;
import java.util.Collections;

public class GoogleVisionOCR {
    public static void performOCR(String imagePath) {
        try (ImageAnnotatorClient vision = ImageAnnotatorClient.create()) {
            // Read the image file
            ByteString imgBytes = ByteString.readFrom(new FileInputStream(imagePath));

            // Create the image object
            Image img = Image.newBuilder().setContent(imgBytes).build();

            // Set up the request with TEXT_DETECTION feature
            Feature feat = Feature.newBuilder().setType(Type.TEXT_DETECTION).build();
            AnnotateImageRequest request = AnnotateImageRequest.newBuilder()
                    .addFeatures(feat)
                    .setImage(img)
                    .build();

            // Send the request to Google Cloud Vision
            AnnotateImageResponse response = vision.batchAnnotateImages(Collections.singletonList(request)).getResponses(0);

            if (response.hasError()) {
                System.err.println("Error: " + response.getError().getMessage());
                return;
            }

            // Print the detected text
            String detectedText = response.getTextAnnotationsList().get(0).getDescription();
            System.out.println("Detected Text:\n" + detectedText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

