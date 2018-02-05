package info.fabiosartori.util.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import info.fabiosartori.util.ReflectionUtil;

class TestReflectionUtil {

	private Bla bla = new Bla("1", "Teste");;
	
	@Test
	void testGetMethods() {
		
		int size = ReflectionUtil.getMethods(bla).size();
		
		assertTrue(size > 0);
	}
	
	@Test
	void testGetField() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		String id = (String) ReflectionUtil.getFieldValue(bla, "id");
		
		assertTrue(id.compareTo("1") == 0);
		
		
		assertTrue(true);
		
	}
	
	@Test
	void testSetField() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		ReflectionUtil.setFieldValue(bla, "id", "3");
		
		String id = (String) ReflectionUtil.getFieldValue(bla, "id");
		
		assertTrue(id.compareTo("3") == 0);
		
		
		assertTrue(true);
		
	}
	
}
