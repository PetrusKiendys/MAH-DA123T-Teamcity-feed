package pack1;

public class Demo01 {
	
	private void demoMethod1() {
		int foo = 5;
		int bar = 10;
		
		int res = foo+bar;
		System.out.print("res: "+res);
	}

	public static void main(String[] args){
		Demo01 demo = new Demo01();
		demo.demoMethod1();
		// new change...
	}
}
