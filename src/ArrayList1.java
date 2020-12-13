import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		
		a.add("one");
		a.add("two");
		a.add("three");
		a.add("four");
		a.add("five");
		a.add("six");
		a.remove(5);
		a.remove("five");
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.contains("one"));
		System.out.println(a.indexOf("two"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		
		
		
	}

}
