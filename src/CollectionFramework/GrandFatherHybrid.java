package CollectionFramework;

interface Son
{
	public static void message() {
	}
	}
interface Daughter
{
	public static void message1() {
	}
	}
class Father implements Son, Daughter {
	public static void message()
	{
		System.out.println("Son");
	}
	public static void message1()
	{
		System.out.println("Daughter");
	}
	public static void father()
	{
		System.out.println("Father");
	}
}
public class GrandFatherHybrid extends Father {

	public static void main(String[] args) {
		GrandFatherHybrid gf=new GrandFatherHybrid();
		gf.message();
		gf.message1();
		gf.father();
		
	}

}
