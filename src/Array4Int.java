
public class Array4Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayInt = new int[4];
	      arrayInt[0] = 8;
	      arrayInt[1] = 3;
	      arrayInt[2] = 6;
	      arrayInt[3] = 5;
	      for(int i = 0; i < arrayInt.length; i ++ ) {
	         if(i == 2) {
	            System.out.print(arrayInt[1] + " ");
	         }
	         else {
	            System.out.print(arrayInt[i] + " ");
	         }
	      }
	}

}
