package nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class HandleMsg implements Runnable{
	
	
	private Socket clientSocket;
	private BufferedReader is;
	private PrintWriter os;
	
	HandleMsg(Socket clientSocket){
		this.clientSocket = clientSocket;
	}
	
	@Override
	public void run() {
		
		try {         
            is = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
            os = new PrintWriter(clientSocket.getOutputStream(), true); 
            // 从InputStream当中读取客户端所发送的数据              
            String inputLine = null;                 
            long b=System. currentTimeMillis ();                 
            while ((inputLine = is.readLine()) != null)
            {           
                os.println(inputLine);                 
            }                 
            long e=System. currentTimeMillis ();                 
            System. out.println ("spend:"+(e - b)+" ms ");             
       } catch (IOException e) {                 
           e.printStackTrace();             
       }finally
       {  
           //关闭资源
    	   try {
    		   is.close();
    		   os.close();
    	   } catch (IOException e) {
    		   // TODO Auto-generated catch block
    		   e.printStackTrace();
    	   }
    	   
       }     
	}
}
