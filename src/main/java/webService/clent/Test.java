package webService.clent;


public class Test {
	public static void main(String[] args) {

		SayHiServiceImpService a = new SayHiServiceImpService();

		SayHiService b = a.getSayHiServiceImpPort();
		
		Hello c = new Hello();
		c.setAge(12);
		c.setUsername("ddd");
		
		
		Hello d =b.updateHello(c);
		System.out.println(d.getAge());
		System.out.println(d.getUsername());
	}
}
