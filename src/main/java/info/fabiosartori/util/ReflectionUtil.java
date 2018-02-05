package info.fabiosartori.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Reflection Util
 * @author fabio_sartori
 *
 */
public class ReflectionUtil {

	/**
	 * Returns a Property Value
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public static Object getFieldValue(Object obj, String  fieldName) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field f = obj.getClass().getDeclaredField(fieldName);
		
		f.setAccessible(true);
		
		return f.get(obj);
		
	}
	
	/**
	 * Seta o valor de um atributo
	 * @param obj
	 * @param fieldName
	 * @param fieldValue
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static void setFieldValue(Object obj, String fieldName, Object fieldValue) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Field f = obj.getClass().getDeclaredField(fieldName);
		
		f.setAccessible(true);

		f.set(obj, fieldValue);
		
	}

	/**
	 * Get Methods
	 * @param obj
	 * @return
	 */
	public static List<String> getMethods(Object obj) {
		
		Class c = obj.getClass();

		List<String> list = new ArrayList<String>();
		
		if (c.getDeclaredMethods().length > 0) {
			
			for (Method m : c.getDeclaredMethods()) {
				
				list.add(m.getName());
				
			}
		}
		
		return list;
			
	}
	
	
}
