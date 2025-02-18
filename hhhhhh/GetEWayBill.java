package hhhhhh;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;

public class GetEWayBill 
{
    private static final String EWB_DETAILS_URL = "https://api.mastergst.com/ewaybillapi/v1.03/ewayapi/getewaybill";

    
	public static String getEWayBillDetails(String ewayBillNo) throws ClientProtocolException, IOException {

    
    
  //  public static String getEWayBillDetails(String ewbNo) throws Exception 
  //  {
        CloseableHttpClient client = HttpClients.createDefault();

        // Construct the API URL with query parameters
        String url = EWB_DETAILS_URL + "?email=akashkumeriya27@gmail.com&ewbNo=" + ewayBillNo;
        HttpGet request = new HttpGet(url);

        // Set request headers
        request.setHeader("Accept", "application/json");
        request.setHeader("ip_address", "203.192.225.1");
        request.setHeader("client_id", "42fbb3a3-477e-4985-ba2d-552d6437b27c");
        request.setHeader("client_secret", "5da81d29-f8cc-4313-9793-a649b270a6e5");
        request.setHeader("gstin", "05AAACH6188F1ZM");

        // Set timeout configuration
        RequestConfig requestConfig = RequestConfig.custom()
            .setSocketTimeout(5000)
            .setConnectTimeout(5000)
            .setConnectionRequestTimeout(5000)
            .build();
        request.setConfig(requestConfig);

        // Execute the request
        CloseableHttpResponse response = client.execute(request);
        String responseString = EntityUtils.toString(response.getEntity());

        // Close resources
        response.close();
        client.close();

        return responseString;
    }

		

   
}
