package hhhhhh;
import java.security.SecureRandom;
import java.util.Base64;

public class token_generation { 
    public static void main(String[] args) {
        byte[] keyBytes = new byte[16]; // AES-128 (16 bytes)
        new SecureRandom().nextBytes(keyBytes);
        String appKey = Base64.getEncoder().encodeToString(keyBytes); // Encode to Base64
        System.out.println("Generated App Key: " + appKey);
    }
}
