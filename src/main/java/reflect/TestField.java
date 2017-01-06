package reflect;

import java.lang.reflect.Field;

public class TestField {
	private String x = "0";
	
	
	public String getx(){
		return x;
	}

	public static void main(String[] ag) {
		TestField a = new TestField();
		Field field = null;
		try {
			field = a.getClass().getDeclaredField("x");
			try {
				System.out.println("xiugaiqiandezhi-----------------" + field.get(a));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		field.setAccessible(true);
		try {
			
			//属性所属的对象
			field.set((Object) a, "1");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		System.out.println("xiugaihoudezhi-----------------" + a.getx());
		
	}

}
