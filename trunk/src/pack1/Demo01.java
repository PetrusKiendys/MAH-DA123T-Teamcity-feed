package pack1;

public class Demo01 {
	
	public void run() {
		System.out.println("--running Demo01--");
		demoMethod1();
	}
	
	private void demoMethod1() {
		int foo = 5;
		int bar = 10;
		
		int res = foo+bar;
		System.out.println("res: "+res);
	}

	public static void main(String[] args){
		Demo01 demo01 = new Demo01();
		demo01.run();
		// new change...
		
		Demo02 demo02 = new Demo02();
		demo02.run();
	}
}
