package hessian;

import java.rmi.RemoteException;

import com.caucho.hessian.server.HessianServlet;

/**
 * 
 * @类名: BasicService 
 * @描述: 提供的实现
 * @作者: hansun
 * @日期: 2016年6月15日 上午9:59:28
 */
public class BasicService extends HessianServlet implements BasicAPI{
	private static final long serialVersionUID = 1L;
	
	  
	  	private int index = 0;
	    
	    public String hello(){
	        System.out.println("Hello!");
	        return ++index + "";
	    }
	  
	  

	  
	}
