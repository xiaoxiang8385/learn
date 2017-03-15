package getui;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;


/**
 * Created by qinan on 2017/2/21.
 */
public class GetuiAPI {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		Map<String, Object> token = getToken();
		if (token != null && token.get("access_token") != null) {
			String access_token = token.get("access_token").toString();
			
			
			/*Map<String, Object> json = new HashMap<String, Object>();
			json.put("value", MD5Util.getMD5Format("18617010735"));// 填写具体imei
			Map<String, Object> from = HttpUtil.httpPostJSON("https://q.zx.getui.com/credit/phone/cheatingConsumer_query/",json, access_token);*/
			
			paramUtil("13350688868", "userinstallAppNumber_query", access_token);
			
			
		}else{
			System.out.println("token is null");
		}
		
		
		
	}
	
	private static void paramUtil(String value, String methodName, String access_token){
		Map<String, Object> json = new HashMap<String, Object>();
		json.put("value", MD5Util.getMD5Format(value));// 填写具体imei
		
		Map<String, Object> from = null;
		try {
			from = HttpUtil.httpPostJSON("https://q.zx.getui.com/credit/phone/"+methodName+"/",json, access_token);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(methodName +": "+ from.toString());
	}
	
	

	public static Map<String, Object> getToken() throws JsonGenerationException, JsonMappingException, IOException {
		Map<String, Object> jsondata = new HashMap<String, Object>();

		String appkey = "l1E4wM1ojL7jrXedRi8QE6";// 此处填写具体的appkey
		Long timestamp = System.currentTimeMillis();
		String masterSecret = "uZgYlO6rPv9FC6Dh8tO1X7";// 此处填写具体的masterSecret
		String sgn = MD5Util.getMD5Format(appkey + timestamp + masterSecret);
		jsondata.put("appkey", appkey);
		jsondata.put("timestamp", timestamp);
		jsondata.put("sgn", sgn);
		System.out.println("输入参数:"+jsondata.toString());
		Map<String, Object> token = HttpUtil.httpPostJSON1("https://q.zx.getui.com/credit/phone/auth", jsondata);
		System.out.println("token result:"+token);
		return token;
	}
}
