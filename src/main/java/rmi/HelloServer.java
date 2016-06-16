package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
 
public class HelloServer {
    public static void main(String args[]) {
        try {
            IHello rhello = new Hello();
            Registry registry = LocateRegistry.createRegistry(8888);
            registry.bind("test", rhello);
            System.out.println("Remote Hello Object is bound sucessfully！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
