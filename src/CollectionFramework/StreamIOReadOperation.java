package CollectionFramework;

import java.io.FileReader;
import java.io.FileWriter;

public class StreamIOReadOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i;
			FileReader fr=new FileReader("D:\\JavaTestInput.txt.txt");
			while ((i=fr.read())!=-1)
				System.out.print((char)i);
			fr.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("\n"+"Data inserted");
	}

}
