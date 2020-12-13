
public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[3][2];
		
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		a[2][0]=5;
		a[2][1]=6;
	
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println(" ");
		}
		

	}

}
