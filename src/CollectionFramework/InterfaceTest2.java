package CollectionFramework;

interface call1
{
	void callback(int parameter);
}
class client1 implements call1
{
	public void callback (int p1)
	{
		System.out.println("callback called with " + p1);
	}
}
	class client2 implements call1
	{
		public void callback (int p2)
		{
			System.out.println("callback called with " + p2);
		}
}
public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
call1 c1=new client1();
call1 c2=new client2();
c1.callback(123);
c2.callback(136);
	}
}
