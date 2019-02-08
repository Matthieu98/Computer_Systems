import java.security.MessageDigest;

public class StringUtil {
	public static String applySha256(String input) {
		try {
			MessageDigest d = MessageDigest.getInstance("SHA-256");
			byte[] hash = d.digest(input.getBytes("UTF-8"));
			StringBuffer hex = new StringBuffer();
			for (int i = 0; i < hash.length; i++) {
				String h = Integer.toHexString(0xff & hash[i]);
				if (h.length() == 1) 
					hex.append('0');
				hex.append(h);
			}
			return hex.toString();
 		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
