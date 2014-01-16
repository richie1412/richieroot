package com.richie.mvnbook.helloworld;

/**
 * Hello world!
 *
 */
public class App 
{
    protected static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app =new App();
        app.test();
    }
    int index =0;
	public String str;
    private void test() {
		++index;
		
		for (int i = 0; i < 5; i++) {
			++index;
		}
		
		str = Integer.toBinaryString(index);
		System.out.println(str);
		
	}
    
   public class Inner{

		public Inner() {
			super();
			// TODO Auto-generated constructor stub
		} 
    }
}
