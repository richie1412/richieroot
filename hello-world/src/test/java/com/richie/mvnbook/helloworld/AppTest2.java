package com.richie.mvnbook.helloworld;


public class AppTest2 extends AppTest {
	
	String aString;
	String bString;

  

	public AppTest2(String testName, String aString, String bString) {
		super(testName);
		this.aString = aString;
		this.bString = bString;
	}

	public AppTest2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppTest2(String testName) {
		super(testName);
		// TODO Auto-generated constructor stub
	}
	private void test2() {
		int i = 0;
		LABLE1 : 
			while (true) {
				System.out.println(Messages.getString("AppTest.8")); //$NON-NLS-1$
				i++;
				
				LABLE2:  {
					while (true) { 
						System.out.println(Messages.getString("AppTest.9")); //$NON-NLS-1$
						i++;
	
						if (i == 2) {
							System.out.println(Messages.getString("AppTest.10")); //$NON-NLS-1$
							continue ;
						}
						if (i == 3) {
							System.out.println(Messages.getString("AppTest.11")); //$NON-NLS-1$
							break;
						}
						
						if (i == 5) {
							System.out.println(Messages.getString("AppTest.12")); //$NON-NLS-1$
							continue LABLE1;
						}
						if (i == 7) {
							System.out.println(Messages.getString("AppTest.13")); //$NON-NLS-1$
							break LABLE1;
						}
						
						if (i == 8) {
							System.out.println(Messages.getString("AppTest.14")); //$NON-NLS-1$
						}
					}
				}
			}  
	}

}
