package CollectionFramework;

class HumanBody1
{
   public void displayHuman()
   {
     System.out.println("Method defined inside HumanBody class");
   }
}
interface Male
{
 public void show();
}
interface Female
{
 public void show();
}

public class HumanBody extends HumanBody1 implements Male, Female
{
 public void show()
 {
   System.out.println("Implementation of show() method defined in interfaces Male and Female");
 }  
 
 public void displayChild()
 {
   System.out.println("Method defined inside Child class");
 }
 
 public static void main(String[]args)
 {
   HumanBody obj = new HumanBody();
   System.out.println("Implementation of Hybrid Inheritance in Java");
   obj.show();
   obj.displayChild();
 }
}