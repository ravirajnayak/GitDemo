
public class PyramidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 1
		 2 3
		 4 5 6
		 7 8 9 10
		 */
		
		int k =1;
		
		for(int i=1; i<5; i++)
		{
			for (int j =1; j<=i; j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println("");
		}
		
		
		
		

	}
	
	

}
