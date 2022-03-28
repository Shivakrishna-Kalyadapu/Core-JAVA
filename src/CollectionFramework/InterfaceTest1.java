package CollectionFramework;

interface call
{
	void callback(int parameter);
}
class client implements call
{
	public void callback (int p)
	{
		System.out.println("callback called with " + p);
	}
}
public class InterfaceTest1 {

	public static void main(String[] args) {

call c= new client();
c.callback(135);
	}

}
