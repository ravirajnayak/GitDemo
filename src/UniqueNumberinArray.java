import java.util.ArrayList;

public class UniqueNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {4,5,5,5,4,6,6,9,4};
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++)
		{
			int k=0;
			
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				
				for(int j=i; j<a.length; j++)
				{	
					if (a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i]+":"+k);
				
				if (k==1)
				{
					System.out.println("Unique number is:" +a[i]);
				}
			}
		}
		
		
	}

}
