
public class MinimumNumberinMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{5,7,9},{5,8,3},{3,1,4}};
		int min = a[0][0];
		
		for(int i=0; i<3; i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min = a[i][j];
				}
			}
		}
		
		System.out.println("Minimum number is:"+min);

	}

}
