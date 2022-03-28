package CollectionFramework;

class L
{
   public void call1()
   {
     System.out.println("Hello");
   }
}
interface M
{
 public void show();
}
interface C
{
 public void show();
}

public class HybridInterface extends L implements M, C
{
 public void show()
 {
   System.out.println("Hi");
 }  
 
 public void call1()
 {
   System.out.println("Method defined inside Child class");
 }
 
 public static void main(String[]args)
 {
	 HybridInterface obj = new HybridInterface();
   System.out.println("Implementation of Hybrid Inheritance in Java");
   obj.show();
   obj.call1();
 }
}