package hhhhhh;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class MasterGstAuth
{
    private static final String AUTH_URL = "https://api.mastergst.com/ewaybillapi/v1.03/authenticate";

        public static String getAccessToken(
        String email, String username, String password, 
        String ipAddress, String clientId, String clientSecret, String gstin) {
        
        String accessToken = null;

        try (CloseableHttpClient client = HttpClients.createDefault()) {
            // Encode query parameters
            String encodedEmail = URLEncoder.encode(email, StandardCharsets.UTF_8);
            String encodedUsername = URLEncoder.encode(username, StandardCharsets.UTF_8);
            String encodedPassword = URLEncoder.encode(password, StandardCharsets.UTF_8);

            // Construct URL with query parameters
            String requestUrl = AUTH_URL + "?email=" + encodedEmail + "&username=" + encodedUsername + "&password=" + encodedPassword;
            HttpGet httpGet = new HttpGet(requestUrl);

            // Add required headers
            httpGet.setHeader("ip_address", ipAddress);
            httpGet.setHeader("client_id", clientId);
            httpGet.setHeader("client_secret", clientSecret);
            httpGet.setHeader("gstin", gstin);

            // Execute request
            try (CloseableHttpResponse response = client.execute(httpGet)) {
                String responseString = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);
               
                System.out.println("Response: " + responseString);

                // Parse JSON response
                ObjectMapper mapper = new ObjectMapper();
                JsonNode rootNode = mapper.readTree(responseString);

                // Extract token if available
//                if (rootNode.has("access_token")) {
//                    accessToken = rootNode.get("access_token").asText();
//                } else {
//                    System.err.println("Authentication failed: " + rootNode);
//                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return accessToken;
    }
}
