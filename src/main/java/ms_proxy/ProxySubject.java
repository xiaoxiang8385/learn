package ms_proxy;

/**
 * 代理角色
 * 
 */
public class ProxySubject extends Subject{
	
	
    //代理角色对象内部含有对真实对象的引用
    private RealSubject realSubject;

    @Override
    public void request()
    {
        //在真实角色操作之前所附加的操作
        preRequest();
        if(null == realSubject)
        {
            realSubject = new RealSubject();
        }
        
        //真实角色所完成的事情
        realSubject.request();
        //在真实角色操作之后所附加的操作
        postRequest();
    }
    
    private void preRequest()
    {
        System.out.println("Pre Request.");
    }
    private void postRequest()
    {
        System.out.println("Post Request");
    }
}
