package listeners;

import java.time.LocalTime;

public class iReatrylisteners {
public static void main(String[] args) {
	

	// write logic for failed test cases
	// IRetryAnalyzer----->(IAnnotationTransformer)
	 LocalTime myObj = LocalTime.now();
	 //   System.out.println(myObj.toString().replace(":", "").replace(".","").sub);
	    
	    //11:47:38.328856600
	    
	    //replace---> String -->
	   // myObj.rep
	    
	 String str=  myObj.toString();
	 String str2=str.replace(":","");
	 
	String str3= str2.replace(".", "");
	
	System.out.println(str3.substring(9));
	
	//adv

}  
	    
	
}
