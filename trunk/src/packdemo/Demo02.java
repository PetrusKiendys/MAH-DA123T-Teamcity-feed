/**
 * 	@author Petrus K.
 */
package packdemo;

public class Demo02 {

/**	---Demo methods---	**/
	private void demoPlaceholder() {
		System.out.print("Demo02 isn't doing anything..");
		new UnsupportedOperationException("Demo02 isn't doing anything..");
	}
	
/** ---run method---	**/
	public void run() {
		System.out.println("--running Demo02--");
		System.out.print("demoPlacehold:\t");
		demoPlaceholder();
		System.out.println();
	}
	
}
