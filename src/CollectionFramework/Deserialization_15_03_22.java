package CollectionFramework;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization_15_03_22
{

	public static void main(String[] args)
	{

		try {
			FileInputStream fis = new FileInputStream("D:\\JavaTestInput.txt.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Serialization ds = (Serialization) ois.readObject(); // Taking Object from Serialization class
		//	Emp ds = (Emp)ois.readObject();
			System.out.println("ID : " + ds.id + "\n" + "Name : " + ds.name + "\n" + "Grade : " + ds.grade);
			ois.close();
			
		} catch (Exception e)
		{
			System.out.println(e);
		}
	}
}