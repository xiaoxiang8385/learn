package getui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Created by Administrator on 2016/1/27.
 */
public class HttpUtil {
	
	  static ObjectMapper mapper = new ObjectMapper();
	  
	public static Map<String, Object> httpPostJSON(String httpUrl, Map<String, Object> jsondata,String token) throws JsonGenerationException, JsonMappingException, IOException {

		BufferedReader reader = null;
		String result = null;
		 Map retMap = null;
		StringBuffer sbf = new StringBuffer();
		String httpArg = mapper.writeValueAsString(jsondata);
		 byte[] data = httpArg.getBytes("UTF-8");
		try {
			URL url = new URL(httpUrl);
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "text/html;charset=UTF-8");
			connection.setRequestProperty("Content-Length", String.valueOf(data.length));
			// 填入appkey到HTTP header 改
			connection.setRequestProperty("access_token", token);
			connection.setHostnameVerifier(new HostnameVerifier() {        
			    public boolean verify(String hostname, SSLSession session)  {  
				return true;
			    }});
			
			connection.setDoOutput(true);
			connection.getOutputStream().write(httpArg.getBytes("UTF-8"));
			
			connection.connect();
			InputStream is = connection.getInputStream();
			reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			String strRead = null;
			while ((strRead = reader.readLine()) != null) {
				sbf.append(strRead);
				sbf.append("\r\n");
			}
			reader.close();
			result = sbf.toString();
			 if(result != null && !"".equals(result)) {
	                retMap = (Map)mapper.readValue(result, Map.class);
	                return retMap;
	            } else {
	                return null;
	            }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retMap;
	}
	
	public static Map<String, Object> httpPostJSON1(String httpUrl, Map<String, Object> jsondata) throws JsonGenerationException, JsonMappingException, IOException {
		BufferedReader reader = null;
		String result = null;
		 Map retMap = null;
		StringBuffer sbf = new StringBuffer();
		String httpArg = mapper.writeValueAsString(jsondata);
		 byte[] data = httpArg.getBytes("UTF-8");
		try {
			URL url = new URL(httpUrl);
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "text/html;charset=UTF-8");
			connection.setRequestProperty("Content-Length", String.valueOf(data.length));
			connection.setHostnameVerifier(new HostnameVerifier() {        
			    public boolean verify(String hostname, SSLSession session)  {  
				return true;
			    }});
			connection.setDoOutput(true);
			connection.getOutputStream().write(httpArg.getBytes("UTF-8"));
			
			connection.connect();
			InputStream is = connection.getInputStream();
			reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			String strRead = null;
			while ((strRead = reader.readLine()) != null) {
				sbf.append(strRead);
				sbf.append("\r\n");
			}
			reader.close();
			result = sbf.toString();
			 if(result != null && !"".equals(result)) {
	                retMap = (Map)mapper.readValue(result, Map.class);
	                return retMap;
	            } else {
	                return null;
	            }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retMap;
	}
}
