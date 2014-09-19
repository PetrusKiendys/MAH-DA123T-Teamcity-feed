package packdemo;

// NOTE: "...they read better if they are referenced through static import"
// more info: http://junit.sourceforge.net/javadoc/org/junit/Assert.html
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;
import org.junit.runners.MethodSorters;

//all tests will run in an ascending order sorted by name
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test01 {
	
	Demo01 d1 = new Demo01();

/**	---setup and teardown methods---	**/
	// this method does a one-time setup before all tests are run in this test class
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("--running Test01--");
		System.out.println("no. of test cases in this suite: "+suite().countTestCases()+"\n");
	}

	// this method does a one-time teardown after all tests are run in this test class
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// unimplemented
	}

	// this method does a setup before every test method is run in this test class
	@Before
	public void setUp() throws Exception {
		// unimplemented
	}

	// this method does a teardown after every test method is run in this test class
	@After
	public void tearDown() throws Exception {
		// todo: print out "success/fail" of testname
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
	
	@Ignore
	public void testIgnoreOrFail() {
		fail("this test case will be ignored, or fail if @Ignore annotation is changed to @Test");
	}
	
	// test that passes when an expected exception is thrown
	@Test(expected=IndexOutOfBoundsException.class)
	public void testIndexOutOfBoundsException() {
	    ArrayList<Object> emptyList = new ArrayList<Object>();
	    Object o = emptyList.get(5);
	}
	
	// test that fails when an exception is thrown
	@Test
	public void testIndexOutOfBoundsExceptionNotRaised() 
	    throws IndexOutOfBoundsException {
		ArrayList<Object> emptyList = new ArrayList<Object>();
	    Object o = emptyList.get(0);
	}
	
	// test that will generate a failure
	@Test
	public void testGenerateFailure() {
		fail("this test will fail");
	}
	
	// test that will generate an error
	@Test
	public void testGenerateError() {
		int[] array = new int[5];
		array[15] = 99;
	}
	
	// test that will generate failures on multiple assertions
	// JUnit will only recognize the first statement 'assertTrue(false);' as a failure
	@Test
	public void testMultipleFailAsserts() {
		assertTrue(false);
		assertNotEquals("hello", "hello");
		assertEquals("hello", "world");
	}
	
	
/** ---custom methods used by this class--- **/
	
	public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(Test01.class);
    }

}
