import java.util.HashMap;
import java.util.Map;

public class IdandPassword {
	
	Map<String,String> logininfo = new HashMap<String,String>();
	
	IdandPassword(){
		logininfo.put("Santojeet", "1234");
		logininfo.put("admin", "admin123");
		logininfo.put("user1", "pass123");
		logininfo.put("user2", "pass1234");
	}
	
	protected Map getLoginInfo(){
		return logininfo;
	}
		 
}
