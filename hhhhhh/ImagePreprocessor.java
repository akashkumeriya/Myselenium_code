package hhhhhh;
import org.bytedeco.opencv.global.opencv_imgcodecs;
import org.bytedeco.opencv.global.opencv_imgproc;
import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_core.Size;

public class ImagePreprocessor {
    public static String preprocessImage(String inputPath, String outputPath) {
        // Load the image
        Mat source = opencv_imgcodecs.imread(inputPath);
        Mat destination = new Mat();

        // Convert to grayscale
        opencv_imgproc.cvtColor(source, destination, opencv_imgproc.COLOR_BGR2GRAY);

        // Apply Gaussian blur to reduce noise
        opencv_imgproc.GaussianBlur(destination, destination, new Size(5, 5), 0);

        // Apply adaptive thresholding to enhance text
        opencv_imgproc.adaptiveThreshold(destination, destination, 255,
                opencv_imgproc.ADAPTIVE_THRESH_GAUSSIAN_C, opencv_imgproc.THRESH_BINARY, 11, 2);

        // Save the preprocessed image
        opencv_imgcodecs.imwrite(outputPath, destination);
        return outputPath;
    }
}