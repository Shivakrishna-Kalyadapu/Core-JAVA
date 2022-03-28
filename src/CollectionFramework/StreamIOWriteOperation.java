package CollectionFramework;

import java.io.FileReader;
import java.io.FileWriter;

public class StreamIOWriteOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileWriter fw=new FileWriter("D:\\JavaTestInput.txt.txt");
	fw.write("Developing File IO program");
	fw.close();
}
catch (Exception e)
{
	System.out.println(e);
}
System.out.println("Data inserted");
	}
}