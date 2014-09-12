package pack1;

// they read better if they are referenced through static import
// more info: http://junit.sourceforge.net/javadoc/org/junit/Assert.html
import static org.junit.Assert.*;
import org.junit.*;

public class Test01 {
	
	Demo01 d1 = new Demo01();

//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}

	@Test
	public void testSumValue() {
		// this test will fail because res =/= 29
//		assertEquals("res is not 29", d1.demoMethod2(), 29);
		// this test will pass because res == 30
		assertEquals("res is not 30", d1.demoMethod2(), 30);
		
		foo();
	}
	
	public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(Test01.class);
    }
	
	public void foo() {
		System.out.println(suite().countTestCases());
	}

}
