import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("five");
		hs.add("six");
		System.out.println(hs);
		hs.remove("three");
		System.out.println(hs.isEmpty());
		
		Iterator<String> i = hs.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		
		while(i.hasNext()) {
			System.out.print(i.next());
			
		}
		
		
		
		

	}

}
