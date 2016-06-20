package rmi;

import java.rmi.Naming;
public class HelloClient2 {
    public static void main(String args[]) {
        try {
        	
        	Student s = new Student();
        	s.setAge(11);
        	s.setName("aaa");
            
        	IHello rhello = (IHello) Naming.lookup("rmi://localhost:8888/test");
            rhello.update(s);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
