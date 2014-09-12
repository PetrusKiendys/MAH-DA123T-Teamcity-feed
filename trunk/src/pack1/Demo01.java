/**
 * 	@author Petrus K.
 */
package pack1;

public class Demo01 {
	
	
/**	---Demo methods---	**/
	private void demoMethod1() {
		int foo = 5;
		int bar = 10;
		
		int res = foo+bar;
		System.out.println("res: "+res);
	}
	
	public int demoMethod2() {
		int foo = 10;
		int bar = 20;
		int res = foo+bar;
		System.out.println("res: "+res);
		
		return res;
	}

	

/** ---run method---	**/
	public void run() {
		System.out.println("--running Demo01--");
		demoMethod1();
		demoMethod2();
	}

	
/** ---main method---	**/
	public static void main(String[] args){
		Demo01 d1 = new Demo01();
		d1.run();
		
		Demo02 d2 = new Demo02();
		d2.run();
	}
}
