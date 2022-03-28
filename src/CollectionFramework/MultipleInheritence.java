package CollectionFramework;

/*class A
{
	public static void msg()
	{
	System.out.println("Hello");
}
}
class B
{
	public static void msg()
	{
	System.out.println("Hi");
}
}
class MultipleInheritence extends A, B
{
//public class MultipleInheritence {

	public static void main(String[] args) {
		MultipleInheritence obj=new MultipleInheritence();
		obj.msg();

	}*/

interface A
{
	void msg();
	}
interface B
{
	void msg();
}
class MultipleInheritence implements A, B
		{
			@Override
			public void msg()
			{
				System.out.println("msg() method implementation");
			}
			
			public static void main(String[] args) {
				MultipleInheritence obj=new MultipleInheritence();
				obj.msg();
			}
	}

