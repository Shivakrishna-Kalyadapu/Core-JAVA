package CollectionFramework;

public class ParentChildClassAnimalExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
final private Void characteristics() {
	int legs=4;
	int eyes=2;
	int ears=2;
	int nose=1;
	int tail=1;
	
	System.out.println("Characteristics of an anomal are : ");
	System.out.println("Legs : " + legs);
	System.out.println("Eyes : " + eyes);
	System.out.println("Ears : " + ears);
	System.out.println("Nose : " + nose);
	System.out.println("Tail : " + tail);

	class Dog extends ParentChildClassAnimalExample {
		final void sound() {
			System.out.println();
			System.out.println("Additional characteristics : ");
			System.out.println("Barking sound as : bow bow");
		}
}

}
}