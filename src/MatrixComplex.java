
public class MatrixComplex {
	// Finding the minimum number and then finding maximum number in that column of
	// max number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{2,4,5},{1,4,0},{1,2,9}};
		int min=a[0][0];
		int b=0;
		
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				if(a[i][j]<min)
				{
					min = a[i][j];
					b =j;
				}
			}
		}
		
		//System.out.println("Min number is:"+ min);
		
		int max = a[0][b];
		for (int k=0; k<3; k++)
		{
			if(a[k][b]>max)
			{
				max = a[k][b];
			}
		}
		
		System.out.println("MAX number in min number column is:"+max);
		
		
		

	}

}
