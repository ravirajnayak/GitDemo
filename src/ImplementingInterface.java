
public class ImplementingInterface implements JavaInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaInterface a	= new ImplementingInterface();
		a.red();
		a.yellow();
		a.green();
		
		ImplementingInterface b = new ImplementingInterface();
		b.color();

	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("Red implemented");
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("yellow implemented");

	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("Green implemented");

	}
	
	public void color()
	{
	System.out.println("color implemented");
	}

}
