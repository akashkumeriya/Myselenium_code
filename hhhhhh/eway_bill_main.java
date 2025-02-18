package hhhhhh;
import org.json.JSONObject;

public class eway_bill_main {

    public static void main(String[] args) throws Exception {
    	
    //	String ewayBillNo = null;
    	
       
            // Step 1: Authenticate and get Access Token
    	
    	
        	 String accessToken = MasterGstAuth.getAccessToken(
                     "akashkumeriya27@gmail.com",
                     "05AAACH6188F1ZM",
                     "abc123@@",
                     "203.192.225.1",
                     "42fbb3a3-477e-4985-ba2d-552d6437b27c",
                     "5da81d29-f8cc-4313-9793-a649b270a6e5",
                     "05AAACH6188F1ZM"
                 );
        	 
        	 
        	 
        	 

//                 if (accessToken == null) {
//                     System.out.println("Authentication failed. Exiting...");
//                     return;
//                 }
//
//                 System.out.println("Access Token: " + accessToken);

            // Step 2: Generate E-Way Bill
            String eWayBillResponse = GenerateEWayBill.generateEwayBill();
            System.out.println("E-Way Bill Response: " + eWayBillResponse);
            
            
            
            
            JSONObject responseJson = new JSONObject(eWayBillResponse);
            
           
               String  ewayBillNo = responseJson.getJSONObject("data").get("ewayBillNo").toString();
                
                
                System.out.println("E-Way Bill number: " + ewayBillNo);
                
                
                
                String ewbDetails = GetEWayBill.getEWayBillDetails(ewayBillNo);
                
                System.out.println("E-Way Bill more Details: " + ewbDetails);

                
                
         
            
            

            // Step 3: Fetch E-Way Bill Details (Replace with actual E-Way Bill Number)
           
            
            
            
            
            
         
            
            
         //   System.out.println("E-Way Bill Details: " + ewbDetails);
            
       
    }
}
