import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d=new Date();
		SimpleDateFormat c = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat f = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		System.out.println(d.toString());
		System.out.println(c.format(d));
		System.out.println(f.format(d));
		
		

	}

}
