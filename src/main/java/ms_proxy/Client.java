package ms_proxy;

/**
 * 客户类
 *  
 */
public class Client
{
    public static void main(String[] args)
    {
        Subject subject = new ProxySubject();
        subject.request();        
    }    
}
