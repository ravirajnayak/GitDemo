import demo.javaInterfacedemo;

public class Interface2 implements javaInterfacedemo {
	
	public void sub() {
		System.out.println("Sub implemented");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 a = new Interface2();
		javaInterfacedemo b = new Interface2();
		a.sub();
		b.sum();

	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("Sum method implemented");
	}

}
