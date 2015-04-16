package com.codewars;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Guesser {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Guesser guesser = new Guesser();
		guesser.guess();
	}

	public void guess() throws NoSuchFieldException, SecurityException {
		System.out.println(LittleClass.class.getName());
		LittleClass.isMySecret("thatILoveUnicorns");
		
		try {
			Class c = LittleClass.class;
			Method[] m = c.getDeclaredMethods();
			Field[] f = c.getDeclaredFields();
			
			for (int i = 0; i < m.length; i++)
				System.out.println(m[i].toString());
			
			for (int i = 0; i < f.length; i++) {
				System.out.println(f[i].toString());
				f[i].setAccessible(true);
				f[i].get(null);
			}
				
		} catch (Throwable e) {
			System.err.println(e);
		}
		
//        Field field = LittleClass.class.getDeclaredField("secret");
//        field.setAccessible(true);
	}

	static class LittleClass {
		public static void isMySecret(String message) {
			// System.out.println(message);
		}
	}

}

// class LittleClass {
// public static void isMySecret(String message) {
// System.out.println(message);
// }
// }