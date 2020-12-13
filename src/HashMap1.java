import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "one");
		hm.put(1, "two");
		hm.put(2, "three");
		hm.put(3, "four");
		hm.put(4, "five");
		hm.put(5, "six");
		hm.remove(5);
		
		System.out.println(hm);
		System.out.println(hm.get(2));
		
		
		Set s = hm.entrySet();
		Iterator i = s.iterator();
		
		while(i.hasNext())
		{
			Map.Entry mp=(Map.Entry) i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
		
		
		
		
		

	}

}
