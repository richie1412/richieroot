package com.richie.mvnbook.helloworld;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 * @ClassName: AppTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author haoxiaoqi
 * @date Nov 17, 2013 11:24:38 AM
 * 
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	public AppTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}
	private void test() {
		
		ArrayList<String> lst= new ArrayList<String>();
		
	}

	public static void main(String[] args) {
		Map <String,String > map =new HashMap<String,String >();
		System.out.println(map);
		map.put("123", "value132");
		map.put("234", "value1123");
		map.put("456", "value1432");
		map.put("235", "value17546");
		
		System.out.println(map);
		System.exit(1);
		
		AppTest test =new AppTest(	Messages.getString("AppTest.0")); //$NON-NLS-1$
		test.test();
		
		String key = Messages.getString("AppTest.1"); //$NON-NLS-1$
		
		key = key.toUpperCase(); 
		System.out.println(Messages.getString("AppTest.2")+ key); //$NON-NLS-1$
		String s= Messages.getString("AppTest.3"); //$NON-NLS-1$
		System.out.println(Messages.getString("AppTest.4")+s.indexOf(Messages.getString("AppTest.5"))); //$NON-NLS-1$ //$NON-NLS-2$
 	String tmp = s.substring( s.indexOf(Messages.getString("AppTest.6"))+1); //$NON-NLS-1$
//		String tmp = s.substring(1);
		System.out.println(Messages.getString("AppTest.7")+tmp.toString()); //$NON-NLS-1$
		ParseException e =new ParseException(s, 10);
		e.getErrorOffset();
		
		
		System.out.println(key.indexOf(s));
	}
}
