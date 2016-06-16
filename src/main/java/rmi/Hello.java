package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
 
public class Hello extends UnicastRemoteObject implements IHello {
    private static final long serialVersionUID = 1L;
    private int index = 0;
    
    protected Hello() throws RemoteException {
    }
    @Override
    public int helloWorld(){
        System.out.println("Hello!");
        return ++index;
    }
   
    public static void main(String[] args) {
    	 String a = new String("a");
    	 String b = "a";
    	 Object d = a;
    	 System.out.println(a.hashCode());
    	 System.out.println(b.hashCode());
     	}
}
