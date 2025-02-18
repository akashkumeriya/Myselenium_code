package hhhhhh;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;

public class GenerateEWayBill {
  //  private static final String API_URL = "https://api.mastergst.com/ewaybillapi/v1.03/ewayapi/genewaybill";

    
  //  private static final String API_URL = "https://api.mastergst.com/ewaybillapi/v1.03/ewayapi/genewaybill?email=akashkumeriya27@gmail.com";
    
      private static final String API_URL = "https://api.mastergst.com/ewaybillapi/v1.03/ewayapi/genewaybill?email=akashkumeriya27@gmail.com";

    
    public static String generateEwayBill() throws ClientProtocolException, IOException {
    	
        String responseString = "";
        
       CloseableHttpClient client = HttpClients.createDefault();
       
            HttpPost httpPost = new HttpPost(API_URL);

            // Set Headers
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-Type", "application/json");
            httpPost.setHeader("ip_address", "203.192.225.1");
            httpPost.setHeader("client_id", "42fbb3a3-477e-4985-ba2d-552d6437b27c");
            httpPost.setHeader("client_secret", "5da81d29-f8cc-4313-9793-a649b270a6e5");
            httpPost.setHeader("gstin", "05AAACH6188F1ZM");
            
            
         //   httpPost.setHeader("email", "akashkumeriya27@gmail.com");


            
            
            
            String json = "{"
            	    + "\"supplyType\": \"O\","
            	    + "\"subSupplyType\": \"1\","
            	    + "\"subSupplyDesc\": \"\","
            	    + "\"docType\": \"INV\","
            	    + "\"docNo\": \"ebctk/06/2020\","
            	    + "\"docDate\": \"11/02/2025\","  // ✅ Fixed format (DD/MM/YYYY)
            	    + "\"fromGstin\": \"05AAACH6188F1ZM\","
            	    + "\"fromTrdName\": \"welton\","
            	    + "\"fromAddr1\": \"2ND CROSS NO 59  19  A\","
            	    + "\"fromAddr2\": \"GROUND FLOOR OSBORNE ROAD\","
            	    + "\"fromPlace\": \"FRAZER TOWN\","
            	    + "\"actFromStateCode\": 5,"
            	    + "\"fromPincode\": 263652,"
            	    + "\"fromStateCode\": 5,"
            	    + "\"toGstin\": \"05AAACH6886N1Z0\","
            	    + "\"toTrdName\": \"sthuthya\","
            	    + "\"toAddr1\": \"Shree Nilaya\","
            	    + "\"toAddr2\": \"Dasarahosahalli\","
            	    + "\"toPlace\": \"Beml Nagar\","
            	    + "\"toPincode\": 263680,"
            	    + "\"actToStateCode\": 5,"
            	    + "\"toStateCode\": 5,"
            	    + "\"transactionType\": 4,"
            	    + "\"dispatchFromGSTIN\": \"05AAACH6188F1ZM\","
            	    + "\"dispatchFromTradeName\": \"ABC Traders\","
            	    + "\"shipToGSTIN\": \"05AAACH6886N1Z0\","
            	    + "\"shipToTradeName\": \"XYZ Traders\","
            	    + "\"totalValue\": 56099,"
            	    + "\"cgstValue\": 150.34,"
            	    + "\"sgstValue\": 150.34,"
            	    + "\"igstValue\": 0,"
            	    + "\"cessValue\": 400.56,"
            	    + "\"cessNonAdvolValue\": 400,"
            	    + "\"totInvValue\": 57200.24,"
            	    + "\"transMode\": \"1\","  // ✅ Changed to String
            	    + "\"transDistance\": \"67\","  // ✅ Changed to String
            	    + "\"transporterName\": \"\", "  // ✅ Changed from null to empty string
            	    + "\"transporterId\": \"05AAACG0904A1ZL\","
            	    + "\"transDocNo\": \"12\","
            	    + "\"transDocDate\": \"13/02/2025\","
            	    + "\"vehicleNo\": \"APR3214\","
            	    + "\"vehicleType\": \"R\","
            	    + "\"itemList\": [{"
            	    + "    \"productName\": \"Wheat\","
            	    + "    \"productDesc\": \"Wheat\","
            	    + "    \"hsnCode\": 1001,"
            	    + "    \"quantity\": 4,"
            	    + "    \"qtyUnit\": \"BOX\","
            	    + "    \"taxableAmount\": 56099,"
            	    + "    \"sgstRate\": 1.5,"
            	    + "    \"cgstRate\": 1.5,"
            	    + "    \"igstRate\": 0,"
            	    + "    \"cessRate\": 0"
            	    + "}]"
            	    + "}";


            httpPost.setEntity(new StringEntity(json));

            CloseableHttpResponse response = client.execute(httpPost); 
                responseString = EntityUtils.toString(response.getEntity(), "UTF-8");
                System.out.println("Response:====== " + responseString);
         

        return responseString;
    }

    
}

