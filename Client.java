class Projectmanager
{
 public void task(int x)
 {
   //empty waiting for implementation
 }
}

class Developer extends Projectmanager
{
 public void task(int x)
 {
  System.out.println("x square root is:"+Math.sqrt(x));
  System.out.println("Project Sucess");
  }
}

class Client
{
 public static void main(String[]args)
 {
  Projectmanager p = new Developer();
  p.task(5);
 }
}