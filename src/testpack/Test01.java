package testpack;

public class Test01 {
	
	private void testMethod1() {
		int foo = 5;
		int bar = 10;
		
		int res = foo+bar;
		System.out.print("res: "+res);
	}

	public static void main(String[] args){
		Test01 testobj = new Test01();
		testobj.testMethod1();
	}
}
