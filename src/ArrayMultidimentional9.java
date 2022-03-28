
public class ArrayMultidimentional9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{3,4,5}, {2,1,4}, {4,5,6}};
		int[][] b= {{1,5,8}, {3,7,5}, {5,6,8}};
		int[][] Mul = new int[3][3];
		int i,j;
		for(i=0; i<a.length; i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				Mul[i][j]=0;
				for(int k=0;k<3;k++)//k<a.length can also be use
				{
				Mul[i][j]+=a[i][k]*b[k][j];
				
			}
				System.out.format("%d\t", Mul[i][j]);
			}
			System.out.println(" ");

			}
			
	}

}
