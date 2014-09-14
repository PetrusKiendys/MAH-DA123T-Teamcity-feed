/**
 * 	@author Petrus K.
 */
package packdemo;

public class Demo01 {
	
	
/**	---Demo methods---	**/
	public String demoStringConcatenate(String str1, String str2) {
		return str1 + str2; 
	}
	
	public int demoCalcSum(int int1, int int2) {	
		return int1+int2;
	}

	

/** ---run method---	**/
	public void run() {
		System.out.println("--running Demo01--");
		System.out.println("demoStringConc:\t"+demoStringConcatenate("hello", "world"));
		System.out.println("demoCalcSum:\t"+demoCalcSum(5, 10));
		System.out.println();
	}

	
/** ---main method---	**/
	public static void main(String[] args){
		Demo01 d1 = new Demo01();
		d1.run();
		
		Demo02 d2 = new Demo02();
		d2.run();
	}
}
