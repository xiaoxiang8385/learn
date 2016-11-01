package nio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleServer {

	
	public static void main(String[] args) throws Exception {
        ServerSocket echoServer = null;
        Socket clientSocket = null;
        
        
        ExecutorService tp = Executors.newFixedThreadPool(20);  
        
        try {
            echoServer = new ServerSocket(8000);
        } catch (IOException e) {
            System.out.println(e);
        }
        while (true) {
            try {
                clientSocket = echoServer.accept();
                System.out.println(clientSocket.getRemoteSocketAddress()
                        + " connect!");
                
				tp.execute(new HandleMsg(clientSocket));
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
	
	
	
	
}
