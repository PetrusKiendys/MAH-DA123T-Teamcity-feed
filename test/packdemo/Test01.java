package packdemo;

import static org.junit.Assert.*;
import org.junit.*;

public class Test01 {
	
	Demo01 d1 = new Demo01();

/**	---setup and teardown methods---	**/
	// this method does a one-time setup before all tests are run in this test class
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("--running Test01--");
		System.out.println("no. of test cases in this suite: "+suite().countTestCases()+"\n");
	}
	

/**	---Test cases---	**/
	@Test
	public void testStringConcatenate() {
		assertEquals("something is wrong with Demo01.demoStringConcatenate",
				"hello", d1.demoStringConcatenate("he", "llo"));
		System.out.println("testStringConcatenate has passed successfully");
	}
	
	@Test
	public void testCalcSum() {
		assertEquals("something is wrong with Demo01.demoCalcSum",
				30, d1.demoCalcSum(10, 20));
		System.out.println("testCalcSum has passed successfully");
	}


/** ---custom methods used by this class--- **/
	public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(Test01.class);
    }

}
