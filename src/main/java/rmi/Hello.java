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
    
    
	@Override
	public void update(Student student) throws RemoteException {
		student.setAge(99);
		student.setName("hhh");
	}
}
