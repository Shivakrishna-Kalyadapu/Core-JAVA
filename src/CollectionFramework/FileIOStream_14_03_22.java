package CollectionFramework;

import java.io.FileOutputStream;

public class FileIOStream_14_03_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		try {
			FileOutputStream fos=new FileOutputStream("D:\\JavaTestInput.txt.txt");
			s="Developing File Output Stream program";    
            byte b[]=s.getBytes();
			fos.write(b);
			fos.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Data inserted"+ "\n" + s);
	}

}
