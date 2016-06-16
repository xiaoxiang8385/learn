package hessian;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;

/**
 * 
 * @类名: BasicClient 
 * @描述: 客户端
 * @作者: hansun
 * @日期: 2016年6月15日 上午10:00:02
 */
public class BasicClient {

	
	public static void main(String[] args) throws MalformedURLException {
		
		String url = "http://localhost:8080/hessian/hello";

		HessianProxyFactory factory = new HessianProxyFactory();
		BasicAPI basic = (BasicAPI) factory.create(BasicAPI.class, url);

		for(int i =0; i < 5; i++){
			System.out.println("hello(): " + basic.hello());
		}
	}
}
