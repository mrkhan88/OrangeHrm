package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflections {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		
		Stinfo info = new Stinfo();
		
		Class cls = info.getClass();
		
		System.out.println(cls.getName());
		
		Constructor cons = cls.getConstructor();

		Method[] methods=cls.getMethods();
		
		for (Method mm : methods) {
			System.out.println(mm.getName());
		}
		
		Field fl1 = cls.getDeclaredField("name");
		System.out.println("before changing "+fl1.get(info));
		
		//changing the vlaue of instacnce variable
		fl1.set(info, "Khan");
		
		System.out.println("After changing "+fl1.get(info));
		
		
		
		Field fl2 =cls.getDeclaredField("ssn");
		fl2.setAccessible(true);
		
		System.out.println(fl2.get(info));
		
		Method m1 = cls.getDeclaredMethod("dsiplayName");
		
		m1.invoke(info);
		
		
	}

}
