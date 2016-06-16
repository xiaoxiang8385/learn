package rmi;

import java.rmi.Naming;
public class HelloClient {
    public static void main(String args[]) {
        try {
            for (int i = 0; i < 5; i++) {
                IHello rhello = (IHello) Naming.lookup("rmi://localhost:8888/test");
                System.out.println(rhello.helloWorld());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
