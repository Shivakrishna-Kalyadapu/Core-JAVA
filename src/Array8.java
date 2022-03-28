
public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] a= {{15,25,35}, {45,55,65}};
int[][] b= {{12,22,32}, {55,25,85}};
int rows, columns;
int[][] Sum = new int[2][3];

for(rows=0; rows<a.length; rows++)
{
	for(columns=0;columns<a[0].length;columns++)
	{
		Sum[rows][columns]=a[rows][columns]+b[rows][columns];
	}
	}
System.out.println("Sum of those arrays are: ");
for(rows=0;rows<a.length;rows++)
{
	for(columns=0;columns<a[0].length;columns++)
	{
		System.out.format("%d\t", Sum[rows][columns]);
		//System.out.print(Sum[rows][columns]); //This is not formated properly
	}
	System.out.println(" ");
}
	}

}
