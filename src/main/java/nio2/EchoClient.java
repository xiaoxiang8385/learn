package nio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.LockSupport;

 
public class EchoClient implements Runnable{
			
			private static final int sleep_time=1000*1000*1000;
			
			Socket client = null;
		    PrintWriter writer = null;
		    
			@Override
			public void run() {
				try {              
                    client = new Socket();              
                    client.connect(new InetSocketAddress("localhost", 8000)); 
                    writer = new PrintWriter(client.getOutputStream(), true); 
                    writer.print("H");              
                    LockSupport.parkNanos(sleep_time);       
                    writer.print("e");           
                    LockSupport.parkNanos(sleep_time);      
                    writer.print("l");       
                    LockSupport.parkNanos(sleep_time);  
                    writer.print("l");       
                    LockSupport.parkNanos(sleep_time);  
                    writer.print("o");     
                    LockSupport.parkNanos(sleep_time);  
                    writer.print("!");         
                    LockSupport.parkNanos(sleep_time);    
                    writer.println();      
                    writer.flush(); 
                }catch(Exception e){
                	e.printStackTrace();
                }finally{
                	 // 省略资源关闭
                	try {
						client.close();
						writer.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
			}
			
			
			public static void main(String[] args) {
				
				new Thread(new EchoClient()).start();  
				
				
			}
			
			
			
}
