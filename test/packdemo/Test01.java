package packdemo;

// they read better if they are referenced through static import
// more info: http://junit.sourceforge.net/javadoc/org/junit/Assert.html
import static org.junit.Assert.*;

import org.junit.*;

public class Test01 {
	
	Demo01 d1 = new Demo01();

/**	---setup and teardown methods---	**/
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("--running Test01--");
		System.out.println("no. of test cases in this suite: "+suite().countTestCases());
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// unimplemented
	}

	@Before
	public void setUp() throws Exception {
		// unimplemented
	}

	@After
	public void tearDown() throws Exception {
		// todo: print out "success/fail" of testname
	}
	

/**	---Test cases---	**/
	@Test
	public void testStringConcatenate() {
		assertEquals("something is wrong with Demo01.demoStringConcatenate",
				"hello", d1.demoStringConcatenate("he", "llo"));
	}
	
	@Test
	public void testCalcSum() {
		assertEquals("something is wrong with Demo01.demoCalcSum",
				30, d1.demoCalcSum(11, 20));
	}
	
	
/** ---custom methods used by this class--- **/
	
	public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(Test01.class);
    }

}
