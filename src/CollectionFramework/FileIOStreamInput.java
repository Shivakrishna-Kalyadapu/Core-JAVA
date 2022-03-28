package CollectionFramework;

import java.io.FileInputStream;

public class FileIOStreamInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i;
			FileInputStream fis=new FileInputStream("D:\\JavaTestInput.txt.txt");
			while ((i=fis.read())!=-1)
				System.out.print((char)i);
			fis.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("\n"+"Data inserted");
	}

}
