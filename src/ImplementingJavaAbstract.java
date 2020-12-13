
public class ImplementingJavaAbstract extends JavaAbstract {
	
	public void height() {
		System.out.println("160cms");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementingJavaAbstract a=new ImplementingJavaAbstract();
		a.name();
		a.age();
		a.weight();
		a.height();
		System.out.println(a.q);

	}

	@Override
	public void weight() {
		// TODO Auto-generated method stub
		System.out.println("83kgs");
		 
	}

}
