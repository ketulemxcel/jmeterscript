import java.util.Base64;
import java.util.UUID;
import java.io.UnsupportedEncodingException;

public class HelloWorld {
   public static void main(String args[]){
      try {
		
		
	//Code to generate tenant activation UUID
	String TenantEmailID = "dmsqa.test";
	String TenantDomain = "@emxcelsolutions.com";	
	int tenantID = 1;
	int tenantPackageID = 111;
	String TenantFullEmail = "das";
	String base64encodedString = "";
	String tenantUUID = ""; 
	 for(int i=1;i<=15;i++){  
		TenantFullEmail = TenantEmailID + i + "@emxcelsolutions.com";
		base64encodedString = TenantFullEmail + " " + tenantID + " " + tenantPackageID + " " + 0/1;
		tenantID = tenantID + 1;
		tenantPackageID = tenantPackageID + 1;
		tenantUUID = Base64.getEncoder().encodeToString(base64encodedString.getBytes("utf-8"));
		//System.out.println(tenantUUID);  
    } 
		
	tenantID = 2;
	base64encodedString = "dmsqa.test1@emxcelsolutions.com" + " " + tenantID + " " + 3 + " " + 0/1;
	tenantUUID = Base64.getEncoder().encodeToString(base64encodedString.getBytes("utf-8"));
	System.out.println(tenantUUID);  
	
	tenantID = tenantID + 1;
	base64encodedString = "dmsqa.test2@emxcelsolutions.com" + " " + tenantID + " " + 2 + " " + 0/1;
	tenantUUID = Base64.getEncoder().encodeToString(base64encodedString.getBytes("utf-8"));
	System.out.println(tenantUUID);  

	tenantID = tenantID + 1;
	base64encodedString = "dmsqa.test3@emxcelsolutions.com" + " " + tenantID + " " + 5 + " " + 0/1;
	tenantUUID = Base64.getEncoder().encodeToString(base64encodedString.getBytes("utf-8"));
	System.out.println(tenantUUID);  

	tenantID = tenantID + 1;
	base64encodedString = "dmsqa.test4@emxcelsolutions.com" + " " + tenantID + " " + 4 + " " + 0/1;
	tenantUUID = Base64.getEncoder().encodeToString(base64encodedString.getBytes("utf-8"));
	System.out.println(tenantUUID);  

	tenantID = tenantID + 1;
	base64encodedString = "dmsqa.test5@emxcelsolutions.com" + " " + tenantID + " " + 8 + " " + 0/1;
	tenantUUID = Base64.getEncoder().encodeToString(base64encodedString.getBytes("utf-8"));
	System.out.println(tenantUUID);  

	tenantID = tenantID + 1;
	base64encodedString = "dmsqa.test6@emxcelsolutions.com" + " " + tenantID + " " + 13 + " " + 0/1;
	tenantUUID = Base64.getEncoder().encodeToString(base64encodedString.getBytes("utf-8"));
	System.out.println(tenantUUID);   

	tenantID = tenantID + 1;
	base64encodedString = "dmsqa.test7@emxcelsolutions.com" + " " + tenantID + " " + 6 + " " + 0/1;
	tenantUUID = Base64.getEncoder().encodeToString(base64encodedString.getBytes("utf-8"));
	System.out.println(tenantUUID);  

	tenantID = tenantID + 1;
	base64encodedString = "dmsqa.test8@emxcelsolutions.com" + " " + tenantID + " " + 9 + " " + 0/1;
	tenantUUID = Base64.getEncoder().encodeToString(base64encodedString.getBytes("utf-8"));
	System.out.println(tenantUUID);  

	tenantID = tenantID + 1;
	base64encodedString = "dmsqa.test9@emxcelsolutions.com" + " " + tenantID + " " + 10 + " " + 0/1;
	tenantUUID = Base64.getEncoder().encodeToString(base64encodedString.getBytes("utf-8"));
	System.out.println(tenantUUID);  

	tenantID = tenantID + 1;
	base64encodedString = "dmsqa.test10@emxcelsolutions.com" + " " + tenantID + " " + 12 + " " + 0/1;
	tenantUUID = Base64.getEncoder().encodeToString(base64encodedString.getBytes("utf-8"));
	System.out.println(tenantUUID);  

	tenantID = tenantID + 1;
	base64encodedString = "dmsqa.test11@emxcelsolutions.com" + " " + tenantID + " " + 7 + " " + 0/1;
	tenantUUID = Base64.getEncoder().encodeToString(base64encodedString.getBytes("utf-8"));
	System.out.println(tenantUUID);  

	tenantID = tenantID + 1;
	base64encodedString = "dmsqa.test12@emxcelsolutions.com" + " " + tenantID + " " + 15 + " " + 0/1;
	tenantUUID = Base64.getEncoder().encodeToString(base64encodedString.getBytes("utf-8"));
	System.out.println(tenantUUID);  	
	
	tenantID = tenantID + 1;
	base64encodedString = "dmsqa.test13@emxcelsolutions.com" + " " + tenantID + " " + 14 + " " + 0/1;
	tenantUUID = Base64.getEncoder().encodeToString(base64encodedString.getBytes("utf-8"));
	System.out.println(tenantUUID);  

	tenantID = tenantID + 1;
	base64encodedString = "dmsqa.test14@emxcelsolutions.com" + " " + tenantID + " " + 11 + " " + 0/1;
	tenantUUID = Base64.getEncoder().encodeToString(base64encodedString.getBytes("utf-8"));
	System.out.println(tenantUUID);  

	tenantID = tenantID + 1;
	base64encodedString = "dmsqa.test15@emxcelsolutions.com" + " " + tenantID + " " + 10 + " " + 0/1;
	tenantUUID = Base64.getEncoder().encodeToString(base64encodedString.getBytes("utf-8"));
	System.out.println(tenantUUID);  


	//User stoken for feed app - str_userToken = Base64.encodeToString((str_contactNo + "-" + str_password).getBytes(), Base64.DEFAULT);
	
	System.out.println("*********" + "User Tocken for feed app" + "********");  	
	String[] myContactNumbers = {"5655950010","5655950011", "5655950012","5655950013","5655950014","5655950015","5655950016","5655950017","5655950018","5655950019"};
	String myPassword = "Passwd@123";
	

	for(int i=0;i<10;i++){  
		base64encodedString = myContactNumbers[i] + "-" + myPassword;
		tenantUUID = Base64.getEncoder().encodeToString(base64encodedString.getBytes("utf-8"));
		System.out.println(tenantUUID); 
    } 
	
	byte[] decoded =Base64.getDecoder().decode(encoded);
	//System.out.println("Decode :" +new String(decoded));
	decoded =Base64.getDecoder().decode(driverEncoded);
	//System.out.println("Decode :" +new String(decoded));
      }catch(UnsupportedEncodingException e){
         //System.out.println("Error :" + e.getMessage());
      }
   }
}